package org.djbros;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Locale;


public class ImportedCar extends ShowRoomCars {
    ImportedCar() {
        super();
    }


    ImportedCar(String carName, String carType, double carPrice, int carModel) {
        super(carName, carType, carPrice, carModel);

    }

    ImportedCar(String carName, String carType, double carPrice, int carModel, int carCondition) {
        super(carName, carType, carPrice, carModel, carCondition);

    }

    protected ImportedCar(String carName, String carType, double carPrice, int carModel, int carCondition
            , int yearOfImport, double gradeAtTimeOfImport, boolean auctionSheet) {
        super(carName, carType, carPrice, carModel, carCondition, yearOfImport, gradeAtTimeOfImport, auctionSheet);
    }

    @Override
    public String toString() {
        String returnValue = " Car name: " + super.carName + "  Car Type: " + super.carType + "  Car price: " + super.carPrice + "  Car Model: " + super.carModel + " Car Condition: " + super.carCondition + " Year of import: " + super.yearOfImport + " GradeAtTimeOfImport: " + super.gradeAtTimeOfImport + " Auction Sheet: " + super.auctionSheet + "\n";
        return returnValue;
    }

    //
//    @Override
//    public void purchaseCar() {
//        int year = Calendar.getInstance().get(Calendar.YEAR);
//        boolean startIt;
//
//        do {
//
//            try {
//
//                System.out.println("\nEnter 0 for to checkout new Imported Cars\nEnter 1 to checkout used Imported Cars\nEnter any other key to quit ");
//                System.out.println("Enter your choice: ");
//                int key = input.nextInt();
//                input.nextLine();
////                if (key < 0 || key > 1 ) {
////                    System.out.println("Please choose between 0 and 1");
////                    continue;
////                }
//
//                startIt = false;
//                if (key == 0) {
//                    for (ShowRoomCars e : newImportedCars) {
//                        System.out.println(e.carName + "\n" + e.carType + "\n" + e.carPrice + "\n" + e.carModel);
//
//                    }
//                    System.out.println("Enter your name");
//                    String userName = input.nextLine().toUpperCase(Locale.ROOT);
//                    System.out.println("Enter car name you want to buy from the provided given list");
//                    String carName = input.nextLine().toUpperCase(Locale.ROOT);
//                    System.out.println("Enter Car Model:(For imported cars, the Car Model should be 3 times less than the current Year Model according to  the rule ");
//                    int carModel = input.nextInt();
//                    input.nextLine();
//                    for (ShowRoomCars newCar : newImportedCars) {
//
//                        if (carName.equals(newCar.carName) && carModel == newCar.carModel && carModel <= (year - 3)) {
//                            String fixedPrice = "";
//                            if (newCar.carModel == 2010) {
//                                fixedPrice = "(8k-15k)";
//
//                            } else if (newCar.carModel == 2011) {
//                                fixedPrice = "(8k-15k)";
//
//                            } else if (newCar.carModel == 2012) {
//                                fixedPrice = "(8k-15k)";
//
//                            } else if (newCar.carModel == 2013) {
//                                fixedPrice = "(8k-15k)";
//
//                            } else if (newCar.carModel == 2014) {
//                                fixedPrice = "(8k-15k)";
//
//                            } else if (newCar.carModel == 2015) {
//                                fixedPrice = "(8k-15k)";
//
//                            } else if (newCar.carModel == 2016) {
//                                fixedPrice = "(8k-15k)";
//
//                            } else if (newCar.carModel == 2017) {
//                                fixedPrice = "(8k-15k)";
//
//                            } else if (newCar.carModel == 2018) {
//                                fixedPrice = "(8k-15k)";
//
//                            } else if (newCar.carModel == 2019) {
//                                fixedPrice = "(8k-15k)";
//
//                            }
//
//
//                            boolean discusion = true;
//                            while (discusion) {
//
//                                System.out.println("lets have a fair deal!\nPrice of" + carName + " is: " + fixedPrice);
//                                System.out.println("Pay the price for this car: ");
//                                int userPrice = input.nextInt();
//                                input.nextLine();
//                                if (newCar.carModel == 2010 && userPrice == newCar.carPrice) {
//
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + newCar.carName + "\nCar Type: " + newCar.carType + "\nCar Model: " + newCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    newImportedCars.remove(newCar);
//                                    discusion = false;
//                                    purchaseCar();
//
//
//                                } else if (newCar.carModel == 2011 && userPrice >= 8 && userPrice <= 50) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + newCar.carName + "\nCar Type: " + newCar.carType + "\nCar Model: " + newCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    newImportedCars.remove(newCar);
//                                    discusion = false;
//                                    purchaseCar();
//
//
//                                } else if (newCar.carModel == 2012 && userPrice >= 8 && userPrice <= 50) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + newCar.carName + "\nCar Type: " + newCar.carType + "\nCar Model: " + newCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    newImportedCars.remove(newCar);
//                                    discusion = false;
//                                    purchaseCar();
//
//
//                                } else if (newCar.carModel == 2013 && userPrice >= 8 && userPrice <= 50) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + newCar.carName + "\nCar Type: " + newCar.carType + "\nCar Model: " + newCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    newImportedCars.remove(newCar);
//                                    discusion = false;
//                                    purchaseCar();
//
//
//                                } else if (newCar.carModel == 2014 && userPrice >= 8 && userPrice <= 50) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + newCar.carName + "\nCar Type: " + newCar.carType + "\nCar Model: " + newCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    newImportedCars.remove(newCar);
//                                    discusion = false;
//                                    purchaseCar();
//
//
//                                } else if (newCar.carModel == 2015 && userPrice >= 8 && userPrice <= 50) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + newCar.carName + "\nCar Type: " + newCar.carType + "\nCar Model: " + newCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    newImportedCars.remove(newCar);
//                                    discusion = false;
//                                    purchaseCar();
//
//
//                                } else if (newCar.carModel == 2016 && userPrice >= 8 && userPrice <= 50) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + newCar.carName + "\nCar Type: " + newCar.carType + "\nCar Model: " + newCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    newImportedCars.remove(newCar);
//                                    discusion = false;
//                                    purchaseCar();
//
//
//                                } else if (newCar.carModel == 2017 && userPrice >= 8 && userPrice <= 50) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + newCar.carName + "\nCar Type: " + newCar.carType + "\nCar Model: " + newCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    newImportedCars.remove(newCar);
//                                    discusion = false;
//                                    purchaseCar();
//
//
//                                } else if (newCar.carModel == 2018 && userPrice >= 8 && userPrice <= 50) {
//                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                    System.out.println(carName + " Specifications");
//                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + newCar.carName + "\nCar Type: " + newCar.carType + "\nCar Model: " + newCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                    newImportedCars.remove(newCar);
//                                    discusion = false;
//                                    purchaseCar();
//
//
//                                } else {
//                                    System.out.println("Sorry! The prices are fixed. We can't bargain for Imported Cars. Enter 0 If you want to pay for it\nEnter 1 to quit");
//                                    System.out.println("Enter Your choice: ");
//                                    int keyy = input.nextInt();
//                                    input.nextLine();
//                                    if (keyy == 0) {
//                                        startIt = false;
//                                        continue;
//                                    } else if (keyy == 1) {
//                                        discusion = false;
//                                        purchaseCar();
//                                    }
//
//
//                                }
//
//
//                            }
//
//
//                        } else {
//                            System.out.println("Sorry! this Car or Model is not available Or you have entered Models like 2019,2020 or 2021. Do you want to buy any other car ?\nEnter 0 for checking out new imported Cars/used Imported Cars in your range\nEnter1 to reject offer");
//                            int enteredKey = input.nextInt();
//                            input.nextLine();
//                            if (enteredKey == 0) {
//
//                                purchaseCar();
//
//                            } else {
//                                System.out.println("Thanks for your coming !");
//                                // here user will go back to option of Local or Imported
//                                startIt = false;
//                            }
//
//                        }
//
//                    }
//                } else if (key == 1) {
//                    if (oldImportedCars.isEmpty()) {
//                        System.out.println("Sorry! No old cars are available yet at our showRoom");
//                        purchaseCar();
//                    } else {
//                        for (ShowRoomCars e : oldImportedCars) {
//                            System.out.println(e.carName + "\n" + e.carType + "\n" + e.carPrice + "\n" + e.carModel);
//                        }
//                        System.out.println("Enter your name");
//                        String userName = input.nextLine().toUpperCase(Locale.ROOT);
//                        System.out.println("Enter car name you want to buy");
//                        String carName = input.nextLine().toUpperCase(Locale.ROOT);
//                        System.out.println("Enter Car Model: ");
//                        int carModel = input.nextInt();
//                        input.nextLine();
//                        for (ShowRoomCars oldCar : oldImportedCars) {
//
//                            if (oldCar.carModel == carModel) {
//                                String fixedPrice = "";
//                                if (oldCar.carModel == 2010) {
//                                    fixedPrice = "(8k-15k)";
//
//                                } else if (oldCar.carModel == 2011) {
//                                    fixedPrice = "(8k-15k)";
//
//                                } else if (oldCar.carModel == 2012) {
//                                    fixedPrice = "(8k-15k)";
//
//                                } else if (oldCar.carModel == 2013) {
//                                    fixedPrice = "(8k-15k)";
//
//                                } else if (oldCar.carModel == 2014) {
//                                    fixedPrice = "(8k-15k)";
//
//                                } else if (oldCar.carModel == 2015) {
//                                    fixedPrice = "(8k-15k)";
//
//                                } else if (oldCar.carModel == 2016) {
//                                    fixedPrice = "(8k-15k)";
//
//                                } else if (oldCar.carModel == 2017) {
//                                    fixedPrice = "(8k-15k)";
//
//                                } else if (oldCar.carModel == 2018) {
//                                    fixedPrice = "(8k-15k)";
//
//                                }
//
//
//                                boolean deal = true;
//                                while (deal) {
//
//                                    System.out.println("lets have a fair deal!\nPrice range of" + carName + " is: " + fixedPrice);
//                                    System.out.println("Enter your price for this car: ");
//                                    int userPrice = input.nextInt();
//                                    input.nextLine();
//                                    if (oldCar.carModel == 2010 && userPrice >= 8 && userPrice <= 50) {
//
//                                        System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                        System.out.println(carName + " Specifications");
//                                        System.out.println("Customer Name:" + userName + "\nCar Name: " + oldCar.carName + "\nCar Type: " + oldCar.carType + "\nCar Model: " + oldCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                        deal = false;
//                                        purchaseCar();
//
//                                    } else if (oldCar.carModel == 2011 && userPrice >= 8 && userPrice <= 50) {
//                                        System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                        System.out.println(carName + " Specifications");
//                                        System.out.println("Customer Name:" + userName + "\nCar Name: " + oldCar.carName + "\nCar Type: " + oldCar.carType + "\nCar Model: " + oldCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                        deal = false;
//                                        purchaseCar();
//
//
//                                    } else if (oldCar.carModel == 2012 && userPrice >= 8 && userPrice <= 50) {
//                                        System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                        System.out.println(carName + " Specifications");
//                                        System.out.println("Customer Name:" + userName + "\nCar Name: " + oldCar.carName + "\nCar Type: " + oldCar.carType + "\nCar Model: " + oldCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                        deal = false;
//                                        purchaseCar();
//
//                                    } else if (oldCar.carModel == 2013 && userPrice >= 8 && userPrice <= 50) {
//                                        System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                        System.out.println(carName + " Specifications");
//                                        System.out.println("Customer Name:" + userName + "\nCar Name: " + oldCar.carName + "\nCar Type: " + oldCar.carType + "\nCar Model: " + oldCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                        deal = false;
//                                        purchaseCar();
//
//                                    } else if (oldCar.carModel == 2014 && userPrice >= 8 && userPrice <= 50) {
//                                        System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                        System.out.println(carName + " Specifications");
//                                        System.out.println("Customer Name:" + userName + "\nCar Name: " + oldCar.carName + "\nCar Type: " + oldCar.carType + "\nCar Model: " + oldCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                        deal = false;
//                                        purchaseCar();
//
//                                    } else if (oldCar.carModel == 2015 && userPrice >= 8 && userPrice <= 50) {
//                                        System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                        System.out.println(carName + " Specifications");
//                                        System.out.println("Customer Name:" + userName + "\nCar Name: " + oldCar.carName + "\nCar Type: " + oldCar.carType + "\nCar Model: " + oldCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                        deal = false;
//                                        purchaseCar();
//
//                                    } else if (oldCar.carModel == 2016 && userPrice >= 8 && userPrice <= 50) {
//                                        System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                        System.out.println(carName + " Specifications");
//                                        System.out.println("Customer Name:" + userName + "\nCar Name: " + oldCar.carName + "\nCar Type: " + oldCar.carType + "\nCar Model: " + oldCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                        deal = false;
//                                        purchaseCar();
//
//                                    } else if (oldCar.carModel == 2017 && userPrice >= 8 && userPrice <= 50) {
//                                        System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                        System.out.println(carName + " Specifications");
//                                        System.out.println("Customer Name:" + userName + "\nCar Name: " + oldCar.carName + "\nCar Type: " + oldCar.carType + "\nCar Model: " + oldCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                        deal = false;
//                                        purchaseCar();
//
//                                    } else if (oldCar.carModel == 2018 && userPrice >= 8 && userPrice <= 50) {
//                                        System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
//                                        System.out.println(carName + " Specifications");
//                                        System.out.println("Customer Name:" + userName + "\nCar Name: " + oldCar.carName + "\nCar Type: " + oldCar.carType + "\nCar Model: " + oldCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
//                                        deal = false;
//                                        purchaseCar();
//
//                                    } else {
//                                        System.out.println("Sorry! We can't sell this car at loss. be fair. Enter 0 to deal again\nEnter 1 to quit");
//                                        System.out.println("Enter choice: ");
//                                        int keyy = input.nextInt();
//                                        input.nextLine();
//                                        if (keyy == 0) {
//                                            startIt = false;
//                                            continue;
//                                        } else if (keyy == 1) {
//                                            deal = false;
//                                            purchaseCar();
//                                        }
//
//
//                                    }
//
//
//                                }
//
//
//                            }
//
//                        }
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
//
//
//    }


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
                    if (newImportedCars.isEmpty()) {
                        System.out.println("Sorry! No new cars are available yet at our showRoom");
                        purchaseCar();

                    } else {
                        for (ShowRoomCars e : newImportedCars) {
                            System.out.println(e.carName + "\n" + e.carType + "\n" + e.carPrice + "\n" +
                                    e.carModel + "\n" + e.gradeAtTimeOfImport + "\n" + e.auctionSheet);

                        }
                        System.out.println("Enter your name");
                        String userName = input.nextLine().toUpperCase(Locale.ROOT);
                        System.out.println("Enter car name you want to buy");
                        String carName = input.nextLine().toUpperCase(Locale.ROOT);


                        System.out.println("Enter Car Type (Hatchback, Sedan, SUV, CrossOver, Sports): ");
                        String carType = input.nextLine().toUpperCase(Locale.ROOT);

                        ShowRoomCars foundCar = null;
                        boolean found = false;

                        for (int i = 0; i < newImportedCars.size(); i++) {
                            if (newImportedCars.get(i).carName.equals(carName) && newImportedCars.get(i).carType.equalsIgnoreCase(carType)) {
                                foundCar = newImportedCars.get(i);
                                found = true;

                            }
                        }

                        if (found) {
                            String priceRange = "";
                            if (foundCar.carType.equalsIgnoreCase("HATCHBACK")) {
                                priceRange = "(20k-25k)";

                            } else if (foundCar.carType.equalsIgnoreCase("SEDAN")) {
                                priceRange = "(28k-35k)";

                            } else if (foundCar.carType.equalsIgnoreCase("CROSSOVER")) {
                                priceRange = "(46k-56k)";

                            } else if (foundCar.carType.equalsIgnoreCase("SUV")) {
                                priceRange = "(78k-98k)";

                            } else if (foundCar.carType.equalsIgnoreCase("SPORTS")) {
                                priceRange = "(110k-125k)";
                            }


                            boolean bargain = true;
                            while (bargain) {

                                System.out.println("lets have a fair deal!\nPrice range of" + carName + " is: " + priceRange);
                                System.out.println("Enter your price for this car: ");
                                int userPrice = input.nextInt();
                                input.nextLine();
                                if (foundCar.carType.equals("SPORTS") && userPrice >= 110 && userPrice <= 125
                                        || foundCar.carType.equals("SUV") && userPrice >= 78 && userPrice <= 98
                                        || foundCar.carType.equals("CROSSOVER") && userPrice >= 46 && userPrice <= 56
                                        || foundCar.carType.equals("SEDAN") && userPrice >= 28 && userPrice <= 35
                                        || foundCar.carType.equals("HATCHBACK") && userPrice >= 20 && userPrice <= 25) {

                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
                                    System.out.println(carName + " Specifications");

                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundCar.carName + "\nCar Type: " + foundCar.carType + "\nCar Model: " + foundCar.carModel +
                                            "\nCar Grade at Time of Import: " + foundCar.gradeAtTimeOfImport + "\nAuction Sheet: " + foundCar.auctionSheet
                                            + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
                                    soldImportedCars.add(foundCar);
                                    newImportedCars.remove(foundCar);
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
                            System.out.println("Sorry! this Car or Model is not available. Do you want us to import it for you?\nEnter 0 for Import\nEnter1 to reject offer");
                            int enteredKey = input.nextInt();
                            input.nextLine();
                            boolean choice = true;
                            int carModel = 0;
                            while (choice) {
                                try {
                                    System.out.println("Enter Car Model you want to Import (MAX 2018 & MIN 2006): ");
                                    carModel = input.nextInt();
                                    if (carModel > 2018 || carModel < 2006) {
                                        System.out.println("These models cannot be imported! Yor can Import between 2006 and 2018: ");
                                        choice = true;
                                    } else {
                                        choice = false;
                                    }
                                } catch (Exception e) {
                                    System.out.println("Only numbers can be entered as car model: ");
                                    input.nextLine();
                                    choice = true;
                                }

                            }
                            if (enteredKey == 0) {
                                System.out.println("Car" + carName + " of Model: " + carModel + " has been requested for import for you!.Stay tuned with us");


                            } else {
                                System.out.println("Thanks for your coming !");
                                startIt = false;

                            }
                            purchaseCar();

                        }

                    }


                } else if (key == 1) {
                    if (oldImportedCars.isEmpty()) {
                        System.out.println("Sorry! No old cars are available yet at our showRoom");
                        purchaseCar();
                    } else {
                        for (ShowRoomCars e : oldImportedCars) {
                            System.out.println(e.carName + "\n" + e.carType + "\n" + e.carModel + "\n" +
                                    e.yearOfImport + "\n" + e.gradeAtTimeOfImport + "\n" +
                                    e.auctionSheet + "\n" + e.carPrice);
                        }
                        System.out.println("Enter your name");
                        String userName = input.nextLine().toUpperCase(Locale.ROOT);
                        System.out.println("Enter car name you want to buy");
                        String carName = input.nextLine().toUpperCase(Locale.ROOT);
                        boolean choice = true;
                        int carModel = -1;
                        while (choice) {
                            try {
                                System.out.println("Enter Car Model(MAX 2018 & MIN 2006): ");
                                carModel = input.nextInt();
                                if (carModel > 2018 || carModel < 2006) {
                                    System.out.println("These models cannot be imported Only available models are between 2006 and 2018: ");
                                    choice = true;

                                } else {
                                    choice = false;

                                }
                            } catch (Exception e) {
                                System.out.println("Only numbers can be entered as car model: ");
                                input.nextLine();
                                choice = true;
                            }

                        }
                        boolean choice_1 = true;
                        int yearOfImport = 0;
                        while (choice_1) {
                            try {
                                System.out.println("Enter Car Import Year(MAX 2021 & MIN 2010): ");
                                yearOfImport = input.nextInt();
                                if (yearOfImport > 2021 || yearOfImport < 2010) {
                                    System.out.println("These models cannot be imported Only available models are between 2010 and 2021: ");
                                    choice_1 = true;
                                } else {
                                    choice_1 = false;
                                }
                            } catch (Exception e) {
                                System.out.println("Only numbers can be entered as car import year: ");
                                input.nextLine();
                                choice_1 = true;
                            }

                        }
                        System.out.println("Enter Type (Hatchback, Sedan, Crossover, SUV, Sports): ");
                        String carType = input.nextLine().toUpperCase(Locale.ROOT);
                        input.nextLine();

                        ShowRoomCars foundUsedCar = null;
                        boolean foundCar = false;
                        for (int i = 0; i < oldImportedCars.size(); i++) {
                            if (oldImportedCars.get(i).carName.equalsIgnoreCase(carName)) {
                                foundUsedCar = oldImportedCars.get(i);
                                foundCar = true;

                            }

                        }
                        if (foundCar) {

                            String priceRange = "";
                            if (foundUsedCar.carModel >= 2006 && foundUsedCar.carModel <= 2010 && foundUsedCar.carType.equals("HATCHBACK")) {
                                if (foundUsedCar.yearOfImport >= 2010 && foundUsedCar.yearOfImport <= 2013 || foundUsedCar.yearOfImport >= 2014
                                        && foundUsedCar.yearOfImport <= 2017){
                                    priceRange = "(7k-12k)";
                                }

                            } else if (foundUsedCar.carModel >= 2011 && foundUsedCar.carModel <= 2014 && foundUsedCar.carType.equals("HATCHBACK")) {
                                if (foundUsedCar.yearOfImport >= 2014 && foundUsedCar.yearOfImport <= 2017 || foundUsedCar.yearOfImport >= 2018
                                        && foundUsedCar.yearOfImport <= 2021){
                                    priceRange = "(12k-17k)";
                                }


                            } else if (foundUsedCar.carModel >= 2015 && foundUsedCar.carModel <= 2018 && foundUsedCar.carType.equals("HATCHBACK")) {
                                if (foundUsedCar.yearOfImport >= 2015 && foundUsedCar.yearOfImport <= 2017 || foundUsedCar.yearOfImport >= 2018
                                        && foundUsedCar.yearOfImport <= 2021){
                                    priceRange = "(17k-21k)";
                                }

                            } else if (foundUsedCar.carModel >= 2006 && foundUsedCar.carModel <= 2010 && foundUsedCar.carType.equals("SEDAN")) {
                                if (foundUsedCar.yearOfImport >= 2010 && foundUsedCar.yearOfImport <= 2013 || foundUsedCar.yearOfImport >= 2014
                                        && foundUsedCar.yearOfImport <= 2017){
                                    priceRange = "(10k-15k)";
                                }

                            } else if (foundUsedCar.carModel >= 2011 && foundUsedCar.carModel <= 2014 && foundUsedCar.carType.equals("SEDAN")) {
                                if (foundUsedCar.yearOfImport >= 2014 && foundUsedCar.yearOfImport <= 2017 || foundUsedCar.yearOfImport >= 2018
                                        && foundUsedCar.yearOfImport <= 2021){
                                    priceRange = "(16k-20k)";
                                }

                            } else if (foundUsedCar.carModel >= 2015 && foundUsedCar.carModel <= 2018 && foundUsedCar.carType.equals("SEDAN")) {
                                if (foundUsedCar.yearOfImport >= 2015 && foundUsedCar.yearOfImport <= 2017 || foundUsedCar.yearOfImport >= 2018
                                        && foundUsedCar.yearOfImport <= 2021){
                                    priceRange = "(23k-30k)";
                                }
                            } else if (foundUsedCar.carModel >= 2006 && foundUsedCar.carModel <= 2010 && foundUsedCar.carType.equals("CROSSOVER")) {
                                if (foundUsedCar.yearOfImport >= 2010 && foundUsedCar.yearOfImport <= 2013 || foundUsedCar.yearOfImport >= 2014
                                        && foundUsedCar.yearOfImport <= 2017){
                                    priceRange = "(28k-31k)";
                                }
                            } else if (foundUsedCar.carModel >= 2011 && foundUsedCar.carModel <= 2014 && foundUsedCar.carType.equals("CROSSOVER")) {
                                if (foundUsedCar.yearOfImport >= 2014 && foundUsedCar.yearOfImport <= 2017 || foundUsedCar.yearOfImport >= 2018
                                        && foundUsedCar.yearOfImport <= 2021){
                                    priceRange = "(32k-37k)";
                                }

                            } else if (foundUsedCar.carModel >= 2015 && foundUsedCar.carModel <= 2018 && foundUsedCar.carType.equals("CROSSOVER")) {
                                if (foundUsedCar.yearOfImport >= 2015 && foundUsedCar.yearOfImport <= 2017 || foundUsedCar.yearOfImport >= 2018
                                        && foundUsedCar.yearOfImport <= 2021){
                                    priceRange = "(39k-48k)";
                                }

                            } else if (foundUsedCar.carModel >= 2006 && foundUsedCar.carModel <= 2010 && foundUsedCar.carType.equals("SUV")) {
                                if (foundUsedCar.yearOfImport >= 2010 && foundUsedCar.yearOfImport <= 2013 || foundUsedCar.yearOfImport >= 2014
                                        && foundUsedCar.yearOfImport <= 2017){
                                    priceRange = "(47k-59k)";
                                }

                            } else if (foundUsedCar.carModel >= 2011 && foundUsedCar.carModel <= 2014 && foundUsedCar.carType.equals("SUV")) {
                                if (foundUsedCar.yearOfImport >= 2014 && foundUsedCar.yearOfImport <= 2017 || foundUsedCar.yearOfImport >= 2018
                                        && foundUsedCar.yearOfImport <= 2021){
                                    priceRange = "(60k-68k)";
                                }

                            } else if (foundUsedCar.carModel >= 2015 && foundUsedCar.carModel <= 2018 && foundUsedCar.carType.equals("SUV")) {
                                if (foundUsedCar.yearOfImport >= 2015 && foundUsedCar.yearOfImport <= 2017 || foundUsedCar.yearOfImport >= 2018
                                        && foundUsedCar.yearOfImport <= 2021){
                                    priceRange = "(70k-90k)";
                                }
                            } else if (foundUsedCar.carModel >= 2006 && foundUsedCar.carModel <= 2010 && foundUsedCar.carType.equals("SPORTS")) {
                                if (foundUsedCar.yearOfImport >= 2010 && foundUsedCar.yearOfImport <= 2013 || foundUsedCar.yearOfImport >= 2014
                                        && foundUsedCar.yearOfImport <= 2017){
                                    priceRange = "(67k-77k)";
                                }
                            } else if (foundUsedCar.carModel >= 2011 && foundUsedCar.carModel <= 2014 && foundUsedCar.carType.equals("SPORTS")) {
                                if (foundUsedCar.yearOfImport >= 2014 && foundUsedCar.yearOfImport <= 2017 || foundUsedCar.yearOfImport >= 2018
                                        && foundUsedCar.yearOfImport <= 2021){
                                    priceRange = "(85k-95k)";
                                }

                            } else if (foundUsedCar.carModel >= 2015 && foundUsedCar.carModel <= 2018 && foundUsedCar.carType.equals("SPORTS")) {
                                if (foundUsedCar.yearOfImport >= 2015 && foundUsedCar.yearOfImport <= 2017 || foundUsedCar.yearOfImport >= 2018
                                        && foundUsedCar.yearOfImport <= 2021){
                                    priceRange = "(105k-115k)";
                                }

                            }

                            boolean bargain = true;
                            while (bargain) {

                                System.out.println("lets have a fair deal!\nPrice range of" + carName + " is: " + priceRange);
                                System.out.println("Enter your price for this car according to car model : ");
                                int userPrice = input.nextInt();
                                input.nextLine();
                                if (foundUsedCar.carModel >= 2006 && foundUsedCar.carModel <= 2010 && foundUsedCar.carType.equals("SPORTS")
                                        && userPrice >= 67 && userPrice <= 77
                                        || foundUsedCar.carModel >= 2011 && foundUsedCar.carModel <= 2014 && foundUsedCar.carType.equals("SPORTS")
                                        && userPrice >= 85 && userPrice <= 95
                                        || foundUsedCar.carModel >= 2015 && foundUsedCar.carModel <= 2018 && foundUsedCar.carType.equals("SPORTS")
                                        && userPrice >= 105 && userPrice <= 115
                                        || foundUsedCar.carModel >= 2006 && foundUsedCar.carModel <= 2010 && foundUsedCar.carType.equals("SUV")
                                        && userPrice >= 47 && userPrice <= 59
                                        || foundUsedCar.carModel >= 2011 && foundUsedCar.carModel <= 2014 && foundUsedCar.carType.equals("SUV")
                                        && userPrice >= 60 && userPrice <= 68
                                        || foundUsedCar.carModel >= 2015 && foundUsedCar.carModel <= 2018 && foundUsedCar.carType.equals("SUV")
                                        && userPrice >= 70 && userPrice <= 90
                                        || foundUsedCar.carModel >= 2006 && foundUsedCar.carModel <= 2011 && foundUsedCar.carType.equals("CROSSOVER")
                                        && userPrice >= 28 && userPrice <= 31
                                        || foundUsedCar.carModel >= 2011 && foundUsedCar.carModel <= 2014 && foundUsedCar.carType.equals("CROSSOVER")
                                        && userPrice >= 32 && userPrice <= 37
                                        || foundUsedCar.carModel >= 2015 && foundUsedCar.carModel <= 2018 && foundUsedCar.carType.equals("CROSSOVER")
                                        && userPrice >= 39 && userPrice <= 48
                                        || foundUsedCar.carModel >= 2006 && foundUsedCar.carModel <= 2010 && foundUsedCar.carType.equals("SEDAN")
                                        && userPrice >= 10 && userPrice <= 15
                                        || foundUsedCar.carModel >= 2011 && foundUsedCar.carModel <= 2014 && foundUsedCar.carType.equals("SEDAN")
                                        && userPrice >= 16 && userPrice <= 20
                                        || foundUsedCar.carModel >= 2015 && foundUsedCar.carModel <= 2018 && foundUsedCar.carType.equals("SEDAN")
                                        && userPrice >= 23 && userPrice <= 30
                                        || foundUsedCar.carModel >= 2006 && foundUsedCar.carModel <= 2010 && foundUsedCar.carType.equals("HATCHBACK")
                                        && userPrice >= 7 && userPrice <= 12
                                        || foundUsedCar.carModel >= 2011 && foundUsedCar.carModel <= 2014 && foundUsedCar.carType.equals("HATCHBACK")
                                        && userPrice >= 12 && userPrice <= 17
                                        || foundUsedCar.carModel >= 2015 && foundUsedCar.carModel <= 2018 && foundUsedCar.carType.equals("HATCHBACK")
                                        && userPrice >= 17 && userPrice <= 21) {

                                    System.out.println("Congrats Buddy! You just made a purchase. Here's your key. No plate will issued in next 30 days. ");
                                    System.out.println(carName + " Specifications");
                                    System.out.println("Customer Name:" + userName + "\nCar Name: " + foundUsedCar.carName + "\nCar Type: " + foundUsedCar.carType +
                                            "\nCar YearOf Import: " + foundUsedCar.yearOfImport + "\nCar Grade: " + foundUsedCar.gradeAtTimeOfImport +
                                            "\nCar Auction Sheet: " + foundUsedCar.auctionSheet + "\nCar Model: " + foundUsedCar.carModel + "\nSold for: " + userPrice + "K" + " Date of purchase: " + calendar.getTime());
                                    soldImportedCars.add(foundUsedCar);
                                    oldImportedCars.remove(foundUsedCar);
                                    totalBudget += userPrice;
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
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

    }

    @Override
    public void saleCar() {
        boolean startIt = true;
        do {
            try {
                System.out.println("Welcome to Imported Car Sell Section: ");
                System.out.println("Note: Price of equal condition imported and local car will differ by almost 10 lack: ");
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
                    boolean test_1 = false;


                    int carModel = -1;
                    while (test) {
                        try {

                            System.out.println("Enter Model Year (Min 2006 - Max 2018): ");
                            carModel = input.nextInt();
                            if (carModel < 2006 || carModel > 2018) {
                                System.out.println((carModel < 2006) ? "Sorry! we don't take cars below model 2006 " : "Sorry! we don't take cars below model above 2018");

                                test = true;

                            } else {
                                test = false;
                                test_1 = true;

                            }
                        } catch (Exception e) {
                            System.out.println("Only Numbers can be entered as Car model: ");
                            input.nextLine();
                            test = true;
                        }
                    }
                    int yearOfImport = -1;
                    while (test_1) {
                        try {
                            System.out.println("Enter Import Year (Max 2021): ");
                            yearOfImport = input.nextInt();

                            if (yearOfImport < 2010 || yearOfImport > 2021) {
                                System.out.println((yearOfImport < 2010) ? "Sorry! we don't take cars imported before 2010: " : "Oops! looks like you have entered an invalid year");
                                test_1 = true;
                            } else {
                                test_1 = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Only Numbers can be entered as Car model: ");
                            input.nextLine();
                            test_1 = true;
                        }
                    }

                    int carCondition = -1;
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

                    double gradeAtTimeOfImport = -1;
                    boolean conn = true;
                    while (conn) {
                        System.out.println("Enter Your Car Grades at the time of Import (MAX 5): ");
                        gradeAtTimeOfImport = input.nextDouble();
                        input.nextLine();

                        if (gradeAtTimeOfImport <= 0 || gradeAtTimeOfImport > 5) {
                            System.out.println("Invalid condition Enter between 1 and 10: ");
                            conn = true;
                        } else {
                            conn = false;
                        }
                    }


                    System.out.println("Enter YES if Auction sheet Available Enter No If Not Available: ");
                    String checker = input.nextLine();
                    boolean control = true;
                    do {
                        if (checker.equalsIgnoreCase("YES") || checker.equalsIgnoreCase("NO")) {
                            switch (checker) {
                                case "YES" -> auctionSheet = true;
                                case "NO" -> auctionSheet = false;
                            }
                            control = false;
                        } else {
                            System.out.println("Can't recognize. Retype again");
                            input.reset();
                            input.next();
                        }
                    } while (control);

                    boolean doIt;
                    do {
                        System.out.println("Enter Category/Type (Hatchback, Sedan, Suv, CrossOver, Sports): ");
                        String carType = input.nextLine().toUpperCase(Locale.ROOT);
                        if (carType.equals("SPORTS") && carCondition >= 7 && carModel >= 2015 && gradeAtTimeOfImport >= 4.0
                                && yearOfImport >= 2018) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (110k-125k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 110 && carPrice <= 125) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("SPORTS") && carCondition >= 5 && carModel >= 2010 && gradeAtTimeOfImport >= 2.5
                                && yearOfImport >= 2015) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (105k-115k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 105 && carPrice <= 115) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("SPORTS") && gradeAtTimeOfImport >= 2 && carModel >= 2006 && gradeAtTimeOfImport >= 1.0
                                && yearOfImport >= 2012) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (90k-110k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 90 && carPrice <= 110) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("HATCHBACK") && carCondition >= 7 && carModel >= 2015 && gradeAtTimeOfImport >= 4.0
                                && yearOfImport >= 2018) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (17k-22k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 17 && carPrice <= 22) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("HATCHBACK") && gradeAtTimeOfImport >= 5 && carModel >= 2010 && gradeAtTimeOfImport >= 2.5
                                && yearOfImport >= 2015) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (12k-17k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 12 && carPrice <= 17) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;

                        } else if (carType.equals("HATCHBACK") && gradeAtTimeOfImport >= 2 && carModel >= 2006 && gradeAtTimeOfImport >= 1.0
                                && yearOfImport >= 2012) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (9k-15k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 9 && carPrice <= 15) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("SEDAN") && carCondition >= 7 && carModel >= 2015 && gradeAtTimeOfImport >= 4.0
                                && yearOfImport >= 2018) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (30k-35k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 30 && carPrice <= 35) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("SEDAN") && gradeAtTimeOfImport >= 5 && carModel >= 2010 && gradeAtTimeOfImport >= 2.5
                                && yearOfImport >= 2015) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (23k-27k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 23 && carPrice <= 27) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("SEDAN") && gradeAtTimeOfImport >= 2 && carModel >= 2006 && gradeAtTimeOfImport >= 1.0
                                && yearOfImport >= 2012) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (17k-20k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 17 && carPrice <= 20) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("SUV") && carCondition >= 7 && carModel >= 2015 && gradeAtTimeOfImport >= 4.0
                                && yearOfImport >= 2018) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (70k-75k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 70 && carPrice <= 75) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("SUV") && gradeAtTimeOfImport >= 5 && carModel >= 2010 && gradeAtTimeOfImport >= 2.5
                                && yearOfImport >= 2015) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (62k-67k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 62 && carPrice <= 67) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("SUV") && gradeAtTimeOfImport >= 2 && carModel >= 2006 && gradeAtTimeOfImport >= 1.0
                                && yearOfImport >= 2012) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (57k-61k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 57 && carPrice <= 61) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("CROSSOVER") && carCondition >= 7 && carModel >= 2015 && gradeAtTimeOfImport >= 4.0
                                && yearOfImport >= 2018) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (48k-55k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 48 && carPrice <= 55) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("CROSSOVER") && gradeAtTimeOfImport >= 5 && carModel >= 2010 && gradeAtTimeOfImport >= 2.5
                                && yearOfImport >= 2015) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (42k-46k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 42 && carPrice <= 46) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else if (carType.equals("CROSSOVER") && gradeAtTimeOfImport >= 2 && carModel >= 2006 && gradeAtTimeOfImport >= 1.0
                                && yearOfImport >= 2012) {
                            boolean bargain = true;
                            while (bargain) {
                                System.out.println("Price range of this Car is (37k-40k):");
                                System.out.println("Enter your price: ");
                                int carPrice = input.nextInt();
                                input.nextLine();
                                if (carPrice >= 37 && carPrice <= 40) {
                                    System.out.println("Congrats! We are going to buy this car from you in " + carPrice);
                                    ShowRoomCars a = new ImportedCar(carName, carType, carPrice, carModel, carCondition,
                                            yearOfImport, gradeAtTimeOfImport, auctionSheet);
                                    oldImportedCars.add(a);
                                    boolean a_0 = true;
                                    do{
                                        lastPurchaseDeed();
                                        a_0 = false;
                                        startIt = true;
                                    }
                                    while (a_0);
                                    totalBudget = totalBudget - carPrice;
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
                            doIt = false;
                        } else {
                            System.out.println("Oops! Looks like you have entered anonymous category\nTry Again");

                            doIt = true;

                        }


                    } while (doIt);


                } else if (key == 1) {
                    System.out.println("We can display your Car at our Showroom and we will sell it to a Genuine buyer.");
                    System.out.println("Note: Commission on imported cars will be 5k more on equivalent condition car: ");
                    System.out.println("Commission will be charged according to the category of car: ");
                    System.out.println();
                    boolean doIt = true;
                    do {
                        System.out.println("Enter Category/Type (HatchBack, Sedan, Crossover, SUV, Sports): ");
                        String carType = input.nextLine().toUpperCase(Locale.ROOT);
                        if (carType.equals("SPORTS")) {
                            System.out.println("Commission for Hatchback will be 45k: ");
                            System.out.println("Do you want to Display car or not \nType Y for Yes and N for No: ");
                            String choice = input.nextLine().toUpperCase(Locale.ROOT);
                            switch (choice) {
                                case "Y" -> {
                                    System.out.println("You can display your car at Mj Motors: ");
                                    lastPurchaseDeed();
                                    totalBudget = totalBudget + 45;
                                }
                                case "N" -> System.out.println("Sorry we cannot display car at any lower commission: ");
                            }
                            doIt = false;

                        } else if (carType.equals("SUV")) {
                            System.out.println("Commission for Hatchback will be 35k: ");
                            System.out.println("Do you want to Display car or not \nType Y for Yes and N for No: ");
                            String choice = input.nextLine().toUpperCase(Locale.ROOT);
                            switch (choice) {
                                case "Y" -> {
                                    System.out.println("You can display your car at Mj Motors: ");
                                    lastPurchaseDeed();
                                    totalBudget = totalBudget + 35;
                                }
                                case "N" -> {
                                    System.out.println("Sorry we cannot display car at any lower commission: ");
                                }
                            }
                            doIt = false;
                        } else if (carType.equals("CROSSOVER")) {
                            System.out.println("Commission for Hatchback will be 30k: ");
                            System.out.println("Do you want to Display car or not \nType Y for Yes and N for No: ");
                            String choice = input.nextLine().toUpperCase(Locale.ROOT);
                            switch (choice) {
                                case "Y" -> {
                                    System.out.println("You can display your car at Mj Motors: ");
                                    lastPurchaseDeed();
                                    totalBudget = totalBudget + 30;
                                }
                                case "N" -> {
                                    System.out.println("Sorry we cannot display car at any lower commission: ");
                                }
                            }
                            doIt = false;
                        } else if (carType.equals("SEDAN")) {
                            System.out.println("Commission for Hatchback will be 25k: ");
                            System.out.println("Do you want to Display car or not \nType Y for Yes and N for No: ");
                            String choice = input.nextLine().toUpperCase(Locale.ROOT);
                            switch (choice) {
                                case "Y" -> {
                                    System.out.println("You can display your car at Mj Motors: ");
                                    lastPurchaseDeed();
                                    totalBudget = totalBudget + 25;
                                }
                                case "N" -> {
                                    System.out.println("Sorry we cannot display car at any lower commission: ");
                                }
                            }
                            doIt = false;
                        } else if (carType.equals("HATCHBACK")) {
                            System.out.println("Commission for Hatchback will be 20k: ");
                            System.out.println("Do you want to Display car or not \nType Y for Yes and N for No: ");
                            String choice = input.nextLine().toUpperCase(Locale.ROOT);
                            switch (choice) {
                                case "Y" -> {
                                    System.out.println("You can display your car at Mj Motors: ");
                                    lastPurchaseDeed();
                                    totalBudget = totalBudget + 20;
                                }
                                case "N" -> System.out.println("Sorry we cannot display car at any lower commission: ");
                            }
                            doIt = false;
                        } else {
                            System.out.println("Oops! Looks like you have entered anonymous category\nTry Again");
                            doIt = true;

                        }

                    } while (doIt);


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
            case "P" -> {
                ShowRoomCars lastPurchasedCar = null;

                System.out.println("      Congratulations on your new Car! Here are your Keys!         ");
                System.out.println("Purchase Details of a Car sold to a Customer by MJ Motors: ");
                if (!soldImportedCars.isEmpty()) {
                    for (int i = 0; i < soldImportedCars.size(); i++) {

                        lastPurchasedCar = soldImportedCars.get(soldImportedCars.size() - 1);
                    }
                    System.out.println("Customer has purchased a car from MJ Motors on date " + calendar.getTime() + ". " +
                            "The Name of the car Purchased is " + lastPurchasedCar.carName + ". Model of Car is " + lastPurchasedCar.carModel +
                            ". Import Year of car is: " + lastPurchasedCar.yearOfImport +
                            ". Grade At import Time of car were: " + lastPurchasedCar.gradeAtTimeOfImport +
                            ". Auction sheet is available: " + lastPurchasedCar.auctionSheet +
                            ". Type/Category of car is: " + lastPurchasedCar.carType +
                            ". Customer has purchased this car from MJ Motors in Rupees " + lastPurchasedCar.carPrice + ". The condition of" +
                            " car at the time of Purchase is " + lastPurchasedCar.carCondition + "/0. This purchase deed is for the reason that " +
                            "from this day onwards the responsibility of the car belongs to the new owner and all the documents of car are" +
                            " provided to the customer. In case of any accident or any other mishap MJ Motors will not be responsible " +
                            "as the customer has bought the car after his full satisfaction.");

                } else {
                    System.out.println("No purchase has been done yet");
                    break;


                }

            }
            case "S" -> {
                ShowRoomCars lastSoldCar = null;
                System.out.println("    You Have Sold your car to MJ Motors!     ");
                System.out.println("Purchase Details of a Car sold to MJ Motors by Customer: ");
                if (!oldImportedCars.isEmpty()) {
                    for (int i = 0; i < oldImportedCars.size(); i++) {

                        lastSoldCar = oldImportedCars.get(oldImportedCars.size() - 1);
                    }
                    System.out.println("MJ Motors has purchased a car from Customer on date " + calendar.getTime() + ". " +
                            "The Name of the car Purchased is " + lastSoldCar.carName + ". Model of Car is " + lastSoldCar.carModel +
                            ". Import Year of car is: " + lastSoldCar.yearOfImport +
                            ". Grade At import Time of car were: " + lastSoldCar.gradeAtTimeOfImport +
                            ". Auction sheet is available: " + lastSoldCar.auctionSheet +
                            ". Type/Category of car is: " + lastSoldCar.carType +
                            ". MJ Motors has purchased this car from Customer in Rupees " + lastSoldCar.carPrice + ". The condition of" +
                            " car at the time of Purchase is " + lastSoldCar.carCondition + "/0. This purchase deed is for the reason that " +
                            "from this day onwards the responsibility of the car belongs to the Mj Motors until next sold and all the documents of car are" +
                            " provided to the MJ Motors by the Customer.");

                } else {
                    System.out.println("No sold record found");
                    break;

                }

            }
        }

    }
//    @Override
//    public void customerShowRoomDetails() {
//        System.out.println("ShowRoom Details related to Imported Cars Are as Follows: ");
//        System.out.println("List of New Imported Cars that are available is: ");
//        for (ShowRoomCars e: newImportedCars)
//        {
//            System.out.println("Car Name: " + e.carName + "\nCarType: " + e.carType + "\nCarPrice: " + e.carPrice +
//                    "\nCar Condition: " + e.carCondition);
//        }
//
//        System.out.println("\nList of Used Imported Cars available is: ");
//        for (ShowRoomCars e: oldImportedCars)
//        {
//            System.out.println("Car Name: " + e.carName + "\nCar Model: " + e.carModel + "\nCarType: " + e.carType + "\nCarPrice: " + e.carPrice +
//                    "\nCar Condition: " + e.carCondition);
//        }
//
//    }

    @Override
    public void managerShowRoomDetails() {

        System.out.println("ShowRoom Details related to Imported Cars Are as Follows: ");
        System.out.println("Remaining Budget of Show Room is: " + totalBudget + " Rupees. ");
        System.out.println("List of New Imported Cars that are available is: ");

        if (!newImportedCars.isEmpty()) {
            for (ShowRoomCars e : newImportedCars) {
                System.out.println("Car Name: " + e.carName + "\nCarType: " + e.carType + "\nCarPrice: " + e.carPrice +
                        "\nCar Condition: " + e.carCondition);
            }

        } else {
            System.out.println("Stock is empty. Go back to menu to add more cars");
        }

        if (!oldImportedCars.isEmpty()) {
            System.out.println("\nList of Used Local Cars available is: ");
            for (ShowRoomCars e : oldImportedCars) {
                System.out.println("Car Name: " + e.carName + "\nCarType: " + e.carType + "\nCarPrice: " + e.carPrice +
                        "\nCar Condition: " + e.carCondition);
            }

        } else {
            System.out.println("Stock is empty. Go back to menu to add more cars");
        }
        System.out.println("Total no of new LocalCars at showroom: " + newImportedCars.size());
        System.out.println("Total no of old LocalCars at showroom: " + oldImportedCars.size());


    }

    @Override
    public void customerShowRoomDetails() {
        importedNewCarsDetails();
        importedOldCarsDetails();


//        try {
//            FileInputStream fileOutputStream = new FileInputStream("y.txt");
//            ObjectInputStream ois= new ObjectInputStream(fileOutputStream);
//            ArrayList importedNewCars = (ArrayList<ShowRoomCars>) ois.readObject();
//            if (!importedNewCars.isEmpty()){
//                System.out.println("ShowRoom Details related to Local Cars Are as Follows: ");
//                System.out.println("List of New Local Cars that are available is: ");
//                System.out.println(importedNewCars);
//
//            }else {
//                System.out.println("Stock is empty");
//            }
//            ois.close();
//
//
//
//        }catch (IOException |ClassNotFoundException e){
//            e.printStackTrace();
//        }
//


    }

    private void importedNewCarsDetails(){
        try {
            FileInputStream fileOutputStream = new FileInputStream("y.txt");
            ObjectInputStream ois= new ObjectInputStream(fileOutputStream);
            ArrayList importedNewCars = (ArrayList<ShowRoomCars>) ois.readObject();
            if (!importedNewCars.isEmpty()){
                System.out.println("ShowRoom Details related to Local Cars Are as Follows: ");
                System.out.println("List of New Imported Cars that are available is: ");

                for(int i =0; i<importedNewCars.size() ;i++){
                    ShowRoomCars s =(ShowRoomCars) importedNewCars.get(i);
                    System.out.println("Car name: "+s.carName+ " car type: " + s.carType + " Car price: " + s.carPrice + " Car Model: " + s.carModel+ " Car Condition: "+s.carCondition + " Car year of Import: "+ s.yearOfImport+ " Car grade at time of import: "+ s.gradeAtTimeOfImport+ " Car auction sheet available? " + s.auctionSheet);
                }

            }
            else {
                System.out.println("No new cars are available yet");
            }
            ois.close();


        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    private void importedOldCarsDetails(){

        try {
            FileInputStream fileOutputStream = new FileInputStream("io.txt");
            ObjectInputStream ois= new ObjectInputStream(fileOutputStream);
            ArrayList importedOldCars = (ArrayList<ShowRoomCars>) ois.readObject();
            if (!importedOldCars.isEmpty()){
                System.out.println("ShowRoom Details related to Old Cars Are as Follows: ");
                System.out.println("List of old Imported Cars that are available is: ");

                for(int i =0; i<importedOldCars.size() ;i++){
                    ShowRoomCars s =(ShowRoomCars) importedOldCars.get(i);
                    System.out.println("Car name: "+s.carName+ " car type: " + s.carType + " Car price: " + s.carPrice + " Car Model: " + s.carModel+ " Car Condition: "+s.carCondition + " Car year of Import: "+ s.yearOfImport+ " Car grade at time of import: "+ s.gradeAtTimeOfImport+ " Car auction sheet available? " + s.auctionSheet);
                }
            }
            else{
                System.out.println("No old cars are available yet");

            }
            ois.close();

        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}






