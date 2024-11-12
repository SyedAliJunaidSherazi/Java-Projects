package org.djbros;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;

public class LocalCar extends ShowRoomCars {
    public LocalCar(){

        super();
    }

    LocalCar(String carName, String carType, double carPrice, int carModel) {
        super(carName, carType, carPrice, carModel);
    }

    LocalCar(String carName, String carType, double carPrice, int carModel, int carCondition) {
        super(carName, carType, carPrice, carModel, carCondition);
    }


    @Override
    public String toString() {
        String returnValue = "";
        if(!super.carName.isEmpty() && !super.carType.isEmpty() && super.carPrice!=0 && super.carModel!=0 && super.carCondition==0){
            returnValue = " Car name: "+ super.carName + "  Car Type: "+ super.carType + "  Car price: "+ super.carPrice+ "  Car Model: "+ super.carModel+"\n";

        }
        else if (!super.carName.isEmpty() && !super.carType.isEmpty() && super.carPrice!=0 && super.carModel!=0 && super.carCondition!=0)
            returnValue = " Car name: "+ super.carName + "  Car Type: "+ super.carType + "  Car price: "+ super.carPrice+ "  Car Model: "+ super.carModel+" Car Condition: "+ super.carCondition+"\n" ;
        else {
            returnValue ="";
        }

        return returnValue;
    }

    @Override
    public void purchaseCar() {
        boolean startIt;

        do {

            try {

                System.out.println("\nEnter 0 for to checkout new Cars\nEnter 1 to checkout old Cars\nEnter any other key to quit ");
                System.out.println("Enter your choice: ");
                int key = input.nextInt();
                input.nextLine();

                startIt = false;
                if (key == 0) {
                    if (newLocalCars.isEmpty()){
                        System.out.println("Sorry! No new cars are available yet at our showRoom");
                        purchaseCar();

                    }else {
                        for (ShowRoomCars e : newLocalCars) {
                            System.out.println(e.carName + "\n" + e.carType + "\n" + e.carPrice + "\n" + e.carModel);

                        }
                        System.out.println("Enter your name");
                        String userName = input.nextLine().toUpperCase(Locale.ROOT);
                        System.out.println("Enter car name you want to buy");
                        String carName = input.nextLine().toUpperCase(Locale.ROOT);


                        System.out.println("Enter Car Type (Hatchback, Sedan, SUV, CrossOver): ");
                        String carType = input.nextLine().toUpperCase(Locale.ROOT);

                        ShowRoomCars foundCar = null;
                        boolean found = false;

                        for (int i = 0; i < newLocalCars.size(); i++) {
                            if (newLocalCars.get(i).carName.equals(carName) && newLocalCars.get(i).carType.equalsIgnoreCase(carType)) {
                                foundCar = newLocalCars.get(i);
                                found = true;

                            }
                        }
                        if (found){
                            String priceRange = "";
                            if (foundCar.carType.equalsIgnoreCase("HATCHBACK")){
                                priceRange = "(17k-22k)";
                            }
                            else if (foundCar.carType.equalsIgnoreCase("SEDAN")){
                                priceRange = "(25k-32k)";
                            }
                            else if (foundCar.carType.equalsIgnoreCase("CROSSOVER")){
                                priceRange = "(43k-53k)";
                            }
                            else if (foundCar.carType.equalsIgnoreCase("SUV")){
                                priceRange = "(75k-95k)";
                            }


//                        if (found) {
//                            String priceRange = "";
//                            if (foundCar.carType.equalsIgnoreCase("HATCHBACK")) {
//                                priceRange = "(17k-22k)";
//
//                            } else if (foundCar.carType.equalsIgnoreCase("SEDAN")) {
//                                priceRange = "(25k-32k)";
//
//                            } else if (foundCar.carType.equalsIgnoreCase("CROSSOVER")) {
//                                priceRange = "(43k-53k)";
//
//                            } else if (foundCar.carType.equalsIgnoreCase("SUV")) {
//                                priceRange = "(75k-95k)";
//
//                            }


                            boolean bargain = true;
                            while (bargain) {

                                System.out.println("lets have a fair deal!\nPrice range of" + carName + " is: " + priceRange);
                                System.out.println("Enter your price for this car: ");
                                int userPrice = input.nextInt();
                                input.nextLine();
                                if (foundCar.carType.equalsIgnoreCase("HATCHBACK") && userPrice >= 17 && userPrice <= 22
                                        || foundCar.carType.equalsIgnoreCase("SEDAN") && userPrice >= 25 && userPrice <= 32
                                        || foundCar.carType.equalsIgnoreCase("CROSSOVER") && userPrice >= 43 && userPrice <= 53
                                        || foundCar.carType.equalsIgnoreCase("SUV") && userPrice >= 75 && userPrice <= 95) {

                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
                                    System.out.println(carName + " Specifications");

                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundCar.carName + "\nCar Type: " + foundCar.carType + "\nCar Model: " + foundCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
                                    soldLocalCars.add(foundCar);
                                    newLocalCars.remove(foundCar);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget += userPrice;
                                    bargain = false;
                                    purchaseCar();

                                }  else {
                                    System.out.println("Sorry! We can't sell this car at loss. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                        continue;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                        purchaseCar();
                                    }


                                }


                            }

                        } else {
                            System.out.println("Sorry! this Car or Model is not available. Do you want us to book it for you?\nEnter 0 for booking\nEnter1 to reject offer");
                            int enteredKey = input.nextInt();
                            input.nextLine();
                            if (enteredKey == 0) {
                                System.out.println("Car" + carName + " of Model: " + carModel + " has been booked for you!.Stay tuned with us");
                                purchaseCar();


                            } else {
                                System.out.println("Thanks for your coming !");
                                startIt = false;
                                purchaseCar();

                            }

                        }

                    }



                } else if (key == 1) {
                    if (oldLocalCars.isEmpty()) {
                        System.out.println("Sorry! No old cars are available yet at our showRoom");
                        purchaseCar();
                    } else {
                        for (ShowRoomCars e : oldLocalCars) {
                            System.out.println(e.carName + "\n" + e.carType + "\n" + e.carPrice + "\n" + e.carModel);
                        }
                        System.out.println("Enter your name");
                        String userName = input.nextLine().toUpperCase(Locale.ROOT);
                        System.out.println("Enter car name you want to buy");
                        String carName = input.nextLine().toUpperCase(Locale.ROOT);
                        System.out.println("Enter Car Model: ");
                        int carModel = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter Type (Hatchback, Sedan, Crossover, SUV): ");
                        String carType = input.nextLine();
                        ShowRoomCars foundUsedCar = null;
                        boolean foundCar = false;
                        for (ShowRoomCars oldCar : oldLocalCars) {
                            if (oldCar.carName.equalsIgnoreCase(carName) && oldCar.carType.equalsIgnoreCase(carType)) {
                                foundUsedCar = oldCar;
                                foundCar = true;
                            }

                        }
                        if (foundCar) {

                            String priceRange = "";
                            if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("HATCHBACK")) {
                                priceRange = "(7k-12k)";

                            } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("HATCHBACK")) {
                                priceRange = "(12k-17k)";

                            } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("HATCHBACK")) {
                                priceRange = "(17k-21k)";

                            } else if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("SEDAN")) {
                                priceRange = "(10k-15k)";

                            } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("SEDAN")) {
                                priceRange = "(16k-20k)";

                            } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("SEDAN")) {
                                priceRange = "(23k-30k)";

                            } else if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("CROSSOVER")) {
                                priceRange = "(28k-31k)";

                            } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("CROSSOVER")) {
                                priceRange = "(32k-37k)";

                            } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("CROSSOVER")) {
                                priceRange = "(39k-48k)";

                            } else if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("SUV")) {
                                priceRange = "(47k-59k)";

                            } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("SUV")) {
                                priceRange = "(60k-68k)";

                            } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("SUV")) {
                                priceRange = "(70k-90k)";

                            }

                            boolean bargain = true;
                            while (bargain) {

                                System.out.println("lets have a fair deal!\nPrice range of" + carName + " is: " + priceRange);
                                System.out.println("Enter your price for this car: ");
                                int userPrice = input.nextInt();
                                input.nextLine();
                                if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("HATCHBACK")
                                        && userPrice >= 7 && userPrice <= 12
                                        || foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("HATCHBACK")
                                        && userPrice >= 12 && userPrice <= 17
                                        || foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("HATCHBACK")
                                        && userPrice >= 17 && userPrice <= 21
                                        || foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("SEDAN")
                                        && userPrice >= 10 && userPrice <= 15
                                        || foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("SEDAN")
                                        && userPrice >= 16 && userPrice <= 20
                                        || foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("SEDAN")
                                        && userPrice >= 23 && userPrice <= 30
                                        || foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("CROSSOVER")
                                        && userPrice >= 28 && userPrice <= 31
                                        || foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("CROSSOVER")
                                        && userPrice >= 32 && userPrice <= 37
                                        || foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("CROSSOVER")
                                        && userPrice >= 39 && userPrice <= 48
                                        || foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("SUV")
                                        && userPrice >= 47 && userPrice <= 59
                                        || foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("SUV")
                                        && userPrice >= 60 && userPrice <= 68
                                        || foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("SUV")
                                        && userPrice >= 70 && userPrice <= 90) {

                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
                                    System.out.println(carName + " Specifications");
                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
                                    soldLocalCars.add(foundUsedCar);
                                    oldLocalCars.remove(foundUsedCar);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget += userPrice;
                                    bargain = false;
                                    purchaseCar();

                                } else {
                                    System.out.println("Sorry! We can't sell this car at loss. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                        continue;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                        purchaseCar();
                                    }
                                }
                            }

                        } else {
                            System.out.println("Sorry! We can't sell this car at loss. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                            System.out.println("Enter choice: ");
                            int keyy = input.nextInt();
                            input.nextLine();
                            if (keyy == 0) {
                                startIt = false;
                                continue;
                            } else if (keyy == 1) {
                                startIt = false;

                            }
                        }
                    }

                } else {
                    if (key != 1 && key != 0) {
                        System.out.println("Quiting-----------------------");
                        startIt = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Oops! Looks like you have entered an invalid key. Retry Again");
                input.nextLine();
                startIt = true;
            }


        } while (startIt);








//        boolean startIt;
//
//        do {
//
//            try {
//
//                System.out.println("\nEnter 0 for to checkout new Cars\nEnter 1 to checkout old Cars\nEnter any other key to quit ");
//                System.out.println("Enter your choice: ");
//                int key = input.nextInt();
//                input.nextLine();
//
//                startIt = false;
//                if (key == 0) {
//                    if (newLocalCars.isEmpty()){
//                        System.out.println("Sorry! No new cars are available yet at our showRoom");
//                        purchaseCar();
//
//                    }else {
//                        for (ShowRoomCars e : newLocalCars) {
//                            System.out.println(e.carName + "\n" + e.carType + "\n" + e.carPrice + "\n" + e.carModel);
//
//                        }
//                        System.out.println("Enter your name");
//                        String userName = input.nextLine().toUpperCase(Locale.ROOT);
//                        System.out.println("Enter car name you want to buy");
//                        String carName = input.nextLine().toUpperCase(Locale.ROOT);
//
//
//                        System.out.println("Enter Car Type (Hatchback, Sedan, SUV, CrossOver): ");
//                        String carType = input.nextLine().toUpperCase(Locale.ROOT);
//
//                        ShowRoomCars foundCar = null;
//                        boolean found = false;
//
//                        for (int i = 0; i < newLocalCars.size(); i++) {
//                            if (newLocalCars.get(i).carName.equals(carName) && newLocalCars.get(i).carType.equalsIgnoreCase(carType)) {
//                                foundCar = newLocalCars.get(i);
//                                found = true;
//
//                            }
//                        }
//
//                        if (found) {
//                            String priceRange = "";
//                            if (foundCar.carType.equalsIgnoreCase("HATCHBACK")) {
//                                priceRange = "(17k-22k)";
//
//                            } else if (foundCar.carType.equalsIgnoreCase("SEDAN")) {
//                                priceRange = "(25k-32k)";
//
//                            } else if (foundCar.carType.equalsIgnoreCase("CROSSOVER")) {
//                                priceRange = "(43k-53k)";
//
//                            } else if (foundCar.carType.equalsIgnoreCase("SUV")) {
//                                priceRange = "(75k-95k)";
//
//                            }
//
//
//                            boolean bargain = true;
//                            while (bargain) {
//
//                                System.out.println("lets have a fair deal!\nPrice range of" + carName + " is: " + priceRange);
//                                System.out.println("Enter your price for this car: ");
//                                int userPrice = input.nextInt();
//                                input.nextLine();
//                                if (foundCar.carType.equals("HATCHBACK") && userPrice >= 17 && userPrice <= 22) {
//
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundCar.carName + "\nCar Type: " + foundCar.carType + "\nCar Model: " + foundCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    soldLocalCars.add(foundCar);
//                                    newLocalCars.remove(foundCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//
//
//                                } else if (foundCar.carType.equals("SEDAN") && userPrice >= 25 && userPrice <= 32) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundCar.carName + "\nCar Type: " + foundCar.carType + "\nCar Model: " + foundCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    soldLocalCars.add(foundCar);
//                                    newLocalCars.remove(foundCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//
//
//                                } else if (foundCar.carType.equals("CROSSOVER") && userPrice >= 43 && userPrice <= 53) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundCar.carName + "\nCar Type: " + foundCar.carType + "\nCar Model: " + foundCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    soldLocalCars.add(foundCar);
//                                    newLocalCars.remove(foundCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//
//
//                                } else if (foundCar.carType.equals("SUV") && userPrice >= 75 && userPrice <= 95) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundCar.carName + "\nCar Type: " + foundCar.carType + "\nCar Model: " + foundCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    newLocalCars.remove(foundCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//                                } else {
//                                    System.out.println("Sorry! We can't sell this car at loss. be fair. Enter 0 to bargain again\nEnter 1 to quit");
//                                    System.out.println("Enter choice: ");
//                                    int keyy = input.nextInt();
//                                    input.nextLine();
//                                    if (keyy == 0) {
//                                        startIt = false;
//                                        continue;
//                                    } else if (keyy == 1) {
//                                        bargain = false;
//                                        purchaseCar();
//                                    }
//
//
//                                }
//
//
//                            }
//
//                        } else {
//                            System.out.println("Sorry! this Car or Model is not available. Do you want us to book it for you?\nEnter 0 for booking\nEnter1 to reject offer");
//                            int enteredKey = input.nextInt();
//                            input.nextLine();
//                            if (enteredKey == 0) {
//                                System.out.println("Car" + carName + " of Model: " + carModel + " has been booked for you!.Stay tuned with us");
//                                purchaseCar();
//
//
//                            } else {
//                                System.out.println("Thanks for your coming !");
//                                startIt = false;
//                                purchaseCar();
//
//                            }
//                        }
//                    }
//
//
//
//                } else if (key == 1) {
//                    if (oldLocalCars.isEmpty()) {
//                        System.out.println("Sorry! No old cars are available yet at our showRoom");
//                        purchaseCar();
//                    } else {
//                        for (ShowRoomCars e : oldLocalCars) {
//                            System.out.println(e.carName + "\n" + e.carType + "\n" + e.carPrice + "\n" + e.carModel);
//                        }
//                        System.out.println("Enter your name");
//                        String userName = input.nextLine().toUpperCase(Locale.ROOT);
//                        System.out.println("Enter car name you want to buy");
//                        String carName = input.nextLine().toUpperCase(Locale.ROOT);
//                        System.out.println("Enter Car Model: ");
//                        int carModel = input.nextInt();
//                        input.nextLine();
//                        System.out.println("Enter Type (Hatchback, Sedan, Crossover, SUV): ");
//                        String carType = input.nextLine();
//                        ShowRoomCars foundUsedCar = null;
//                        boolean foundCar = false;
//                        for (ShowRoomCars oldCar : oldLocalCars) {
//                            if (oldCar.carName.equalsIgnoreCase(carName) && oldCar.carType.equalsIgnoreCase(carType)) {
//                                foundUsedCar = oldCar;
//                                foundCar = true;
//                            }
//
//                        }
//                        if (foundCar) {
//
//                            String priceRange = "";
//                            if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("HATCHBACK")) {
//                                priceRange = "(7k-12k)";
//
//                            } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("HATCHBACK")) {
//                                priceRange = "(12k-17k)";
//
//                            } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("HATCHBACK")) {
//                                priceRange = "(17k-21k)";
//
//                            } else if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("SEDAN")) {
//                                priceRange = "(10k-15k)";
//
//                            } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("SEDAN")) {
//                                priceRange = "(16k-20k)";
//
//                            } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("SEDAN")) {
//                                priceRange = "(23k-30k)";
//
//                            } else if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("CROSSOVER")) {
//                                priceRange = "(28k-31k)";
//
//                            } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("CROSSOVER")) {
//                                priceRange = "(32k-37k)";
//
//                            } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("CROSSOVER")) {
//                                priceRange = "(39k-48k)";
//
//                            } else if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("SUV")) {
//                                priceRange = "(47k-59k)";
//
//                            } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("SUV")) {
//                                priceRange = "(60k-68k)";
//
//                            } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("SUV")) {
//                                priceRange = "(70k-90k)";
//
//                            }
//
//                            boolean bargain = true;
//                            while (bargain) {
//
//                                System.out.println("lets have a fair deal!\nPrice range of" + carName + " is: " + priceRange);
//                                System.out.println("Enter your price for this car: ");
//                                int userPrice = input.nextInt();
//                                input.nextLine();
//                                if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("HATCHBACK")
//                                        && userPrice >= 7 && userPrice <= 12) {
//
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    soldLocalCars.add(foundUsedCar);
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//
//                                } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("HATCHBACK")
//                                        && userPrice >= 12 && userPrice <= 17) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//
//
//                                } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("HATCHBACK")
//                                        && userPrice >= 17 && userPrice <= 21) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//
//
//                                } else if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("SEDAN")
//                                        && userPrice >= 10 && userPrice <= 15) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//
//
//                                } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("SEDAN")
//                                        && userPrice >= 16 && userPrice <= 20) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//
//
//                                } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("SEDAN")
//                                        && userPrice >= 23 && userPrice <= 30) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//
//
//                                } else if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("CROSSOVER")
//                                        && userPrice >= 28 && userPrice <= 31) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//                                } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("CROSSOVER")
//                                        && userPrice >= 32 && userPrice <= 37) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//                                } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("CROSSOVER")
//                                        && userPrice >= 39 && userPrice <= 48) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//                                } else if (foundUsedCar.carModel >= 2010 && foundUsedCar.carModel <= 2013 && foundUsedCar.carType.equals("SUV")
//                                        && userPrice >= 47 && userPrice <= 59) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//                                } else if (foundUsedCar.carModel >= 2014 && foundUsedCar.carModel <= 2017 && foundUsedCar.carType.equals("SUV")
//                                        && userPrice >= 60 && userPrice <= 68) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//                                } else if (foundUsedCar.carModel >= 2018 && foundUsedCar.carModel <= 2021 && foundUsedCar.carType.equals("SUV")
//                                        && userPrice >= 70 && userPrice <= 90) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    oldLocalCars.remove(foundUsedCar);
//                                    totalBudget += userPrice;
//                                    bargain = false;
//                                    purchaseCar();
//                                }else {
//                                    System.out.println("Sorry! We can't sell this car at loss. be fair. Enter 0 to bargain again\nEnter 1 to quit");
//                                    System.out.println("Enter choice: ");
//                                    int keyy = input.nextInt();
//                                    input.nextLine();
//                                    if (keyy == 0) {
//                                        startIt = false;
//                                        continue;
//                                    } else if (keyy == 1) {
//                                        bargain = false;
//                                        purchaseCar();
//                                    }
//
//
//                                }
//
//
//
//                            }
//
//
//                        } else {
//                            System.out.println("Sorry! this Car or Model is not available. Do you want us to book it for you?\nEnter 0 for booking\nEnter1 to reject offer");
//                            int enteredKey = input.nextInt();
//                            input.nextLine();
//                            if (enteredKey == 0) {
//                                System.out.println("Car" + carName + " of Model: " + carModel + " has been booked for you!.Stay tuned with us");
//                                purchaseCar();
//
//
//                            } else {
//                                System.out.println("Thanks for your coming !");
//                                startIt = false;
//                                purchaseCar();
//
//                            }
//
//                        }
//
//
//                    }
//
//                } else {
//                    if (key != 1 && key != 0) {
//                        System.out.println("Quiting-----------------------");
//                        startIt = false;
//
//                    }
//                }
//
//
//            } catch (Exception e) {
//                System.out.println("Oops! Looks like you have entered an invalid key. Retry Again");
//                input.nextLine();
//                startIt = true;
//            }
//
//
//        } while (startIt);


    }

    @Override
    public void saleCar() {
        boolean startIt = true;

        do {
            try {
                System.out.println("\nEnter 0 to sell car to us \nEnter 1 to place car for selling \nEnter 2 to Exit to Menu ");
                System.out.println("Enter your choice: ");
                int key = input.nextInt();
                input.nextLine();
                if (key != 0 && key != 1 && key != 2) {
                    System.out.println("Plz enter required keys.");

                    continue;
                }
                startIt = false;
                if (key == 0) {
                    System.out.println("Enter your name: ");
                    String name = input.nextLine().toUpperCase(Locale.ROOT);
                    System.out.println("Enter car name: ");
                    String carName = input.nextLine();
                    boolean test = true;
                    int carModel = 0;
                    while (test) {
                        try {
                            System.out.println("Enter Model Year (Max 2021): ");
                            carModel = input.nextInt();
                            if (carModel < 2010 || carModel > 2021) {
                                System.out.println((carModel < 2010) ? "Sorry! we don't take cars below model 2010: " : "Oops! looks like you have entered an invalid Model");
                                test = true;
                            } else {
                                test = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Only Numbers can be entered as Car model: ");
                            input.nextLine();
                            test = true;
                        }
                    }


                    int carCondition = 0;
                    boolean con = true;
                    while (con) {
                        System.out.println("Enter condition (1-10): ");
                        carCondition = input.nextInt();
                        input.nextLine();
                        if (carCondition <= 0 || carCondition > 10) {
                            System.out.println("Invalid condition Enter between 1 and 10: ");
                            con = true;
                        } else {
                            con = false;
                        }
                    }
                    boolean checkIt = true;
                    do {
                        System.out.println("Enter category (Hatchback, Sedan, Suv, CrossOver): ");
                        String category = input.nextLine().toUpperCase(Locale.ROOT);
                        if (category.equals("HATCHBACK") && carCondition >= 7 && carModel >= 2017) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (15k-20k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 15 && carPrice <= 20) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }

                                }


                            }
                            checkIt = false;
                        } else if (category.equals("HATCHBACK") && carCondition >= 5 && carModel >= 2013) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (13k-16k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 13 && carPrice <= 16) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;

                        } else if (category.equals("HATCHBACK") && carCondition >= 2 && carModel >= 2010) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (10k-14k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 10 && carPrice <= 14) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;
                        } else if (category.equals("SEDAN") && carCondition >= 7 && carModel >= 2017) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (20k-25k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 20 && carPrice <= 25) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;
                        } else if (category.equals("SEDAN") && carCondition >= 5 && carModel >= 2013) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (16k-19k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 16 && carPrice <= 19) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;
                        } else if (category.equals("SEDAN") && carCondition >= 2 && carModel >= 2010) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (13k-15k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 13 && carPrice <= 15) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;
                        } else if (category.equals("SUV") && carCondition >= 7 && carModel >= 2017) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (60k-65k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 60 && carPrice <= 65) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;
                        } else if (category.equals("SUV") && carCondition >= 5 && carModel >= 2013) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (55k-60k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 55 && carPrice <= 60) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;
                        } else if (category.equals("SUV") && carCondition >= 2 && carModel >= 2010) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (50k-55k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 50 && carPrice <= 55) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;
                        } else if (category.equals("CROSSOVER") && carCondition >= 7 && carModel >= 2017) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (45k-48k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 45 && carPrice <= 48) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;
                        } else if (category.equals("CROSSOVER") && carCondition >= 5 && carModel >= 2013) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (37k-41k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 37 && carPrice <= 41) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;
                        } else if (category.equals("CROSSOVER") && carCondition >= 2 && carModel >= 2010) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (27k-30k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 27 && carPrice <= 30) {
                                    System.out.println("Congrats! Mr/Miss " + name + " We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new LocalCar(carName, category, carPrice, carModel, carCondition);
                                    oldLocalCars.add(a);
                                    totalBudget = totalBudget - carPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    bargain = false;
                                } else {
                                    System.out.println("Sorry! We can't buy this car at this price. be fair. Enter 0 to bargain again\nEnter 1 to quit");
                                    System.out.println("Enter choice: ");
                                    int keyy = input.nextInt();
                                    input.nextLine();
                                    if (keyy == 0) {
                                        startIt = false;
                                    } else if (keyy == 1) {
                                        bargain = false;
                                    }
                                }
                            }
                            checkIt = false;
                        } else {
                            System.out.println("Oops! Looks like you have entered anonymous category\nTry Again");

                            checkIt = true;


                        }

                    } while (checkIt);

                } else if (key == 1) {
                    System.out.println("We can display your Car at our Showroom and we will sell it to a Genuine buyer.");
                    System.out.println("Commission will be charged according to the category of car: ");
                    System.out.println();
                    boolean test = true;
                    do {
                        System.out.println("Enter Category/Type (HatchBack, Sedan, Crossover, SUV): ");
                        String carType = input.nextLine().toUpperCase(Locale.ROOT);
                        if (carType.equals("HATCHBACK")) {
                            System.out.println("Commission for Hatchback will be 15k: ");
                            System.out.println("Do you want to Display car or not \nType Y for Yes and N for No: ");
                            String choice = input.nextLine().toUpperCase(Locale.ROOT);
                            switch (choice) {
                                case "Y" -> {
                                    System.out.println("You can display your car at Mj Motors: ");
                                    totalBudget = totalBudget + 15;
                                }
                                case "N" -> System.out.println("Sorry we cannot display car at any lower commission: ");
                            }
                            test = false;

                        } else if (carType.equals("SEDAN")) {
                            System.out.println("Commission for Sedan will be 20k: ");
                            System.out.println("Do you want to Display car or not \nType Y for Yes and N for No: ");
                            String choice = input.nextLine().toUpperCase(Locale.ROOT);
                            switch (choice) {
                                case "Y" -> {
                                    System.out.println("You can display your car at Mj Motors: ");
                                    totalBudget = totalBudget + 20;
                                }
                                case "N" -> {
                                    System.out.println("Sorry we cannot display car at any lower commission: ");
                                }
                            }
                            test = false;
                        } else if (carType.equals("SUV")) {
                            System.out.println("Commission for SUV will be 30k: ");
                            System.out.println("Do you want to Display car or not \nType Y for Yes and N for No: ");
                            String choice = input.nextLine().toUpperCase(Locale.ROOT);
                            switch (choice) {
                                case "Y" -> {
                                    System.out.println("You can display your car at Mj Motors: ");
                                    totalBudget = totalBudget + 30;
                                }
                                case "N" -> {
                                    System.out.println("Sorry we cannot display car at any lower commission: ");
                                }
                            }
                            test = false;
                        } else if (carType.equals("CROSSOVER")) {
                            System.out.println("Commission for Crossover will be 25k: ");
                            System.out.println("Do you want to Display car or not \nType Y for Yes and N for No: ");
                            String choice = input.nextLine().toUpperCase(Locale.ROOT);
                            switch (choice) {
                                case "Y" -> {
                                    System.out.println("You can display your car at Mj Motors: ");
                                    totalBudget = totalBudget + 25;
                                }
                                case "N" -> {
                                    System.out.println("Sorry we cannot display car at any lower commission: ");
                                }
                            }
                            test = false;
                        } else {
                            System.out.println("Sorry! We can't recognize this category. Re-enter again");
                            test = true;
                        }

                    } while (test);


                } else if (key == 2) {
                    startIt = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("plz enter valid  keys");
                input.reset();
                input.next();
                startIt = true;
            }

        }
        while (startIt);
    }


    @Override
    public void lastPurchaseDeed() {
        System.out.println("Enter P is you have Purchased the car OR Enter S if you have Sold the Car: ");
        String check = input.nextLine().toUpperCase(Locale.ROOT);
        switch (check) {
            case "P":
                ShowRoomCars lastPurchasedCar = null;
                if (!soldLocalCars.isEmpty()){
                    System.out.println("      Congratulations on your new Car! Here are your Keys!         ");
                    System.out.println("Purchase Details of a Car sold to a Customer by MJ Motors: ");
                    for(int i =0 ; i<soldLocalCars.size() ; i++){

                        lastPurchasedCar = soldLocalCars.get(soldLocalCars.size()-1);
                    }
                    System.out.println("Customer has purchased a car from MJ Motors on date " + calendar.getTime() + ". " +
                            "The Name of the car Purchased is " + lastPurchasedCar.carName + ". Model of Car is " + lastPurchasedCar.carModel +
                            ". Type/Category of car is: " + lastPurchasedCar.carType +
                            ". Customer has purchased this car from MJ Motors in Rupees " + lastPurchasedCar.carPrice + ". The condition of" +
                            " car at the time of Purchase is " + lastPurchasedCar.carCondition + "/0. This purchase deed is for the reason that " +
                            "from this day onwards the responsibility of the car belongs to the new owner and all the documents of car are" +
                            " provided to the customer. In case of any accident or any other mishap MJ Motors will not be responsible " +
                            "as the customer has bought the car after his full satisfaction.");

                }else {
                    System.out.println("No purchase has been done yet");
                    break;


                }

                break;
            case "S":
                ShowRoomCars lastSoldCar = null;
                if (!oldLocalCars.isEmpty()){
                    System.out.println("    You Have Sold your car to MJ Motors!     ");
                    System.out.println("Purchase Details of a Car sold to MJ Motors by Customer: ");
                    for(int i =0 ; i<oldLocalCars.size() ; i++){

                        lastSoldCar = oldLocalCars.get(oldLocalCars.size()-1);
                    }
                    System.out.println("MJ Motors has purchased a car from Customer on date " + calendar.getTime() + ". " +
                            "The Name of the car Purchased is " + lastSoldCar.carName + ". Model of Car is " + lastSoldCar.carModel +
                            ". Type/Category of car is: " + lastSoldCar.carType +
                            ". MJ Motors has purchased this car from Customer in Rupees " + lastSoldCar.carPrice + ". The condition of" +
                            " car at the time of Purchase is " + lastSoldCar.carCondition + "/0. This purchase deed is for the reason that " +
                            "from this day onwards the responsibility of the car belongs to the Mj Motors until next sold and all the documents of car are" +
                            " provided to the MJ Motors by the Customer.");

                }else {
                    System.out.println("No sold record found");
                    break;

                }

                break;

        }

    }
    @Override
    public void managerShowRoomDetails() {
        System.out.println("ShowRoom Details related to Local Cars Are as Follows: ");
        System.out.println("Remaining Budget of Show Room is: " + totalBudget + " Rupees. ");
        System.out.println("List of New Local Cars that are available is: ");
        if (!newLocalCars.isEmpty()){
            for (ShowRoomCars e : newLocalCars) {
                System.out.println("Car Name: " + e.carName + "\nCarType: " + e.carType + "\nCarPrice: " + e.carPrice +
                        "\nCar Condition: " + e.carCondition);
            }

        }
        else {
            System.out.println("Stock is empty for local new Cars. Go back to menu to add more cars");
        }

        if (!oldLocalCars.isEmpty()){
            System.out.println("\nList of Used Local Cars available is: ");
            for (ShowRoomCars e : oldLocalCars) {
                System.out.println("Car Name: " + e.carName + "\nCarType: " + e.carType + "\nCarPrice: " + e.carPrice +
                        "\nCar Condition: " + e.carCondition);
            }

        }
        else {
            System.out.println("Stock is empty local old Cars. Go back to menu to add more cars");
        }

    }


    @Override
    public void customerShowRoomDetails() {
        localNewCarDetail();
        localOldCarsDetail();

//        if (!newLocalCars.isEmpty()){
//            System.out.println("ShowRoom Details related to Local Cars Are as Follows: ");
//            System.out.println("List of New Local Cars that are available is: ");
//
//            for (ShowRoomCars e : newLocalCars) {
//                System.out.println("Car Name: " + e.carName + "\nCarType: " + e.carType + "\nCarPrice: " + e.carPrice +
//                        "\nCar Condition: " + e.carCondition);
//            }
//
//        }
//        else {
//            System.out.println("Stock is empty.");
//        }
//        if (!newLocalCars.isEmpty()){
//            System.out.println("\nList of Used Local Cars available is: ");
//            for (ShowRoomCars e : newLocalCars) {
//                System.out.println("Car Name: " + e.carName + "\nCarType: " + e.carType + "\nCarPrice: " + e.carPrice +
//                        "\nCar Condition: " + e.carCondition);
//            }
//
//        }
//        else {
//            System.out.println("Stock is empty.");
//        }
//
//

    }

    private void localNewCarDetail(){
        ArrayList localNewCars = null;

        try {
            FileInputStream fileOutputStream = new FileInputStream("tn.txt");
            ObjectInputStream ois= new ObjectInputStream(fileOutputStream);
            localNewCars = (ArrayList<ShowRoomCars>) ois.readObject();
            if (!localNewCars.isEmpty()){
                System.out.println("ShowRoom Details related to Local Cars Are as Follows: ");
                System.out.println("List of New Local Cars that are available is: ");

                for(int i =0; i<localNewCars.size() ;i++){
                    ShowRoomCars s =(ShowRoomCars) localNewCars.get(i);
                    System.out.println("Car name: "+s.carName+ " car type: " + s.carType + " Car price: " + s.carPrice + " Car Model: " + s.carModel);
                }

            }
            else {
                System.out.println("No new cars available yet");

            }
            ois.close();



        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    private void localOldCarsDetail(){

        try {
            FileInputStream fileOutputStream = new FileInputStream("to.txt");
            ObjectInputStream ois= new ObjectInputStream(fileOutputStream);
            ArrayList localOldCars = (ArrayList<ShowRoomCars>) ois.readObject();
            if (!localOldCars.isEmpty()){
                System.out.println("ShowRoom Details related to Old Cars Are as Follows: ");
                System.out.println("List of old Local Cars that are available is: ");

                for(int i =0; i<localOldCars.size() ;i++){
                    ShowRoomCars s =(ShowRoomCars) localOldCars.get(i);
                    System.out.println("Car name: "+s.carName+ " car type: " + s.carType + " Car price: " + s.carPrice + " Car Model: " + s.carModel + " Car Condition: " + s.carCondition);
                }
            }
            else {
                System.out.println("No old cars available yet");
            }
            ois.close();

        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }


    }


}
