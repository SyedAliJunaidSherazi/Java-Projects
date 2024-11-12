package org.djbros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        menu();

//        new ShowRoomCars();
//
//        JFrame j = new JFrame();
//        j.setTitle("MJ SHOWROOM MANAGEMENT SYSTEM");
//        j.setBackground(Color.GREEN);
//        JButton b = new JButton();
//        JLabel l = new JLabel();
//        l.setSize(200 , 200);
//        l.setBackground(Color.GRAY);
//        l.add(b);
//        l.setVisible(true);
//        j.add(l);
//
//
//        b.setText("Press 1");
//
//        j.setSize(750 , 750);
//
//        j.setVisible(true);
//        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//        LocalCar car1 = new LocalCar("B" , "SUV" , 50 , 2016);
//        car1.newLocalCars.add(car1);
//
//        LocalCar car2 = new LocalCar("L" , "t" , 50 , 2019);
//        car2.newLocalCars.add(car2);
//
//        LocalCar car3 = new LocalCar("A" , "suv" , 50 , 2020);
//        car3.newLocalCars.add(car3);
//        ShowRoomCars.oldLocalCars.add(car1);
//
//        LocalCar car4 = new LocalCar("G" , "SEDAN" , 50 , 2021);
//        car1.newLocalCars.add(car4);
//        ShowRoomCars.oldLocalCars.add(car4);
////        car1.saleCar();
//        car1.purchaseCar();
//        ArrayList<ShowRoomCars> b = new ArrayList<>();
//        b.add(car1);
//        b.add(car2);
//        b.add(car3);
//        b.add(car4);
//////
//
////
//        try{

//            ArrayList<ShowRoomCars> d =new ArrayList<>();
//
//            ArrayList<ShowRoomCars> b = ShowRoomCars.newLocalCars;
//
//
//
//            FileOutputStream writeData = new FileOutputStream("MFile.txt");
//            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
//
//            writeStream.writeObject(b);
//            writeStream.flush();
//            writeStream.close();
//
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//        try{
//            FileInputStream readData = new FileInputStream("MFile.txt");
//            ObjectInputStream readStream = new ObjectInputStream(readData);
//
//            ArrayList m = (ArrayList<ShowRoomCars>) readStream.readObject();
////            m.remove(2);
////            m.set(1 , car4);
////            System.out.println(m.size());
//
////            for (int i = 0 ; i< m.size()  ; i++){
//                System.out.print(m.toString() );
//                readStream.close();
////            }
//        }catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        try{
////            ShowRoomCars c = new ShowRoomCars();
////            ArrayList<ShowRoomCars> d = c.getNewLocalCars();
//            FileOutputStream writeData = new FileOutputStream("localNewCars.txt");
//            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
//
//            writeStream.writeObject(d);
//            writeStream.flush();
//            writeStream.close();
//
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//


//
//        ImportedCar car1 = new ImportedCar("B", "SUV", 50, 2010);
//        car1.newImportedCars.add(car1);
//        car1 = new ImportedCar("L", "SPORTS", 50, 2019);
//        car1.newImportedCars.add(car1);
//        car1 = new ImportedCar("A", "SEDAN", 50, 2020);
//        car1.newImportedCars.add(car1);
//
//        ImportedCar car4 = new ImportedCar("Carnival", "CROSSOVER", 50, 2017 , 5 , 2018 , 3 , true);
//        car1.oldImportedCars.add(car4);
//
//        ImportedCar car5 = new ImportedCar("Carnival", "CROSSOVER", 50, 2010, 5, 2018 , 5 , true);
//        car1.oldImportedCars.add(car5);
//
//        ImportedCar car6 = new ImportedCar("WagonR", "HATCHBACK", 50, 2014 , 5 , 2018 , 4 , false);
//        car1.oldImportedCars.add(car6);
////        car1.purchaseCar();
////
//
//        car1.saleCar();
//        int year = Calendar.getInstance().get(Calendar.YEAR);
//        System.out.println(year);
//        for(int i = 0 ; i<ShowRoomCars.newImportedCars.size() ;i++){
//            System.out.println(ShowRoomCars.newImportedCars.get(i).carName +" " +ShowRoomCars.newImportedCars.get(i).carModel);
//        }
//        System.out.println("Enter car name:");
//        String name = input.nextLine();
//        System.out.println("Enter Car Model:");
//        int model = input.nextInt();
//        input.nextLine();
//        boolean go = true;
//
//        for(int i = 0 ; i<ShowRoomCars.newImportedCars.size() ;i++){
//            if(ShowRoomCars.newImportedCars.get(i).carName.equals(name) && ShowRoomCars.newImportedCars.get(i).carModel==model){
//                ShowRoomCars.newImportedCars.remove(i);
//                go  = false;
//            }
//
//        }
//        System.out.println((!go) ? "found": "not found");
//        for(int i = 0 ; i<ShowRoomCars.newImportedCars.size() ;i++){
//            System.out.println(ShowRoomCars.newImportedCars.get(i).carName +" " +ShowRoomCars.newImportedCars.get(i).carModel);
//        }


//        car1.purchaseCar();


        // if he wants to buy
        //purchaseCar();


    }


    public static void menu() {
        boolean go = true;

        do {
            try {
                System.out.println("  MJ MOTORS  ");
                System.out.println("Enter 1 if you are a showRoom manager\nEnter 2 if you are a customer\nEnter 3 to quit");
                int choice = input.nextInt();
                input.nextLine();
                if (choice != 1 && choice != 2 && choice != 3) {
                    System.out.println("Oops! looks like you have entered invalid number key. retype again.\nPlz retype again");
                    continue;
                }
                go = false;

                switch (choice) {
                    case 1:
                        boolean start = true;
                        do {
                            try {
                                System.out.println(" Welcome Manager ");
                                System.out.println("Press 1 to go to Local Cars section\nPress 2 to go to Imported Cars Section\nPress 3 to go back to menu");
                                int key = input.nextInt();
                                input.nextLine();
                                if (key != 1 && key != 2 && key != 3) {
                                    System.out.println("Oops! looks like you have entered invalid number key. retype again.\nPlz retype again");
                                    continue;
                                }
                                start = false;

                                switch (key) {
                                    case 1:
                                        boolean goo = true;
                                        do {
                                            try {
                                                System.out.println("Press 1 to go for new local cars\nPress 2 to go for used local cars\nPress 3 to go back to  menu");
                                                int choose = input.nextInt();
                                                input.nextLine();
                                                if (choose != 1 && choose != 2 && choose != 3) {
                                                    System.out.println("Oops! looks like you have entered invalid number key. retype again.\nPlz retype again");
                                                    continue;
                                                }
                                                goo = false;
                                                switch (choose) {
                                                    case 1:
                                                        boolean check = true;
                                                        do {
                                                            try {
                                                                System.out.println("Enter 1 to add new local car\nEnter 2 to update new local car\nEnter 3 to remove car\nEnter 4 to go back to menu");
                                                                int choicee = input.nextInt();
                                                                input.nextLine();
                                                                check = false;
                                                                if (choicee != 1 && choicee != 2 && choicee != 3 && choicee != 4) {
                                                                    System.out.println("Oops! looks like you have entered invalid number key. retype again.\nPlz retype again");
                                                                    continue;
                                                                }
                                                                switch (choicee) {
                                                                    case 1:
                                                                        boolean per = true;
                                                                        do {
                                                                            System.out.println("Enter a car with details: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase();
                                                                            boolean checkIt = true;
                                                                            int price = 0;
                                                                            int model = 0;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car price: ");
                                                                                    int carPrice = input.nextInt();
                                                                                    price = carPrice;
                                                                                    input.nextLine();
                                                                                    checkIt = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid price format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIt);
                                                                            boolean checkIn = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model (2010-2021): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);

                                                                            LocalCar car = new LocalCar(carName, carType, price, model);
                                                                            car.getNewLocalCars().add(car);
                                                                            try {
                                                                                ArrayList<ShowRoomCars> newLocalCarsRecord = car.getNewLocalCars();
                                                                                FileOutputStream fos = new FileOutputStream("tn.txt");
                                                                                ObjectOutputStream obj = new ObjectOutputStream(fos);
                                                                                obj.writeObject(newLocalCarsRecord);
                                                                                obj.flush();
                                                                                obj.close();

                                                                            } catch (IOException e) {
                                                                                e.printStackTrace();

                                                                            }

                                                                            System.out.println("Do you want add more cars?\nPress 1 to add more cars\nEnter 2 to exit");
                                                                            int press = input.nextInt();
                                                                            input.nextLine();
                                                                            if (press == 1) {
                                                                                per = true;
                                                                            } else if (press == 2) {
                                                                                System.out.println("Exiting----");
                                                                                per = false;
                                                                                check = true;

                                                                            }

                                                                        } while (per);
                                                                        break;
                                                                    case 2:
                                                                        boolean perr = true;
                                                                        do {
                                                                            System.out.println("Enter a car with you want to update with: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car you want to add: ");
                                                                            System.out.println("Enter car name:");
                                                                            String addCar = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type you want to add ");
                                                                            String addCarType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            boolean checkIt = true;

                                                                            int price = 0;
                                                                            int model = 0;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car price: ");
                                                                                    int carPrice = input.nextInt();
                                                                                    price = carPrice;
                                                                                    input.nextLine();
                                                                                    checkIt = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid price format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIt);
                                                                            boolean checkIn = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model (2010-2021): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);

                                                                            boolean foundCar = false;
                                                                            int index = 0;
                                                                            for (int i = 0; i < ShowRoomCars.newLocalCars.size(); i++) {
                                                                                if (ShowRoomCars.newLocalCars.get(i).carName.equalsIgnoreCase(carName) && ShowRoomCars.newLocalCars.get(i).carType.equalsIgnoreCase(carType)) {
                                                                                    index = i;
                                                                                    foundCar = true;

                                                                                }
                                                                            }
                                                                            if (foundCar) {
                                                                                LocalCar car = new LocalCar(addCar, addCarType, price, model);
                                                                                ShowRoomCars.newLocalCars.set(index, car);

                                                                                try {
                                                                                    FileInputStream fis = new FileInputStream("tn.txt");
                                                                                    ObjectInputStream ois = new ObjectInputStream(fis);
                                                                                    ArrayList checkForUpdate = (ArrayList<ShowRoomCars>) ois.readObject();
                                                                                    checkForUpdate.set(index, car);
                                                                                    ois.close();
                                                                                    FileOutputStream fos = new FileOutputStream("tn.txt");
                                                                                    ObjectOutputStream o = new ObjectOutputStream(fos);
                                                                                    o.writeObject(checkForUpdate);
                                                                                    o.flush();
                                                                                    o.close();
//


                                                                                } catch (IOException | ClassNotFoundException e) {
                                                                                    e.printStackTrace();

                                                                                }


                                                                                System.out.println("Updated successfully");
                                                                                for (ShowRoomCars e : ShowRoomCars.newLocalCars) {
                                                                                    System.out.println(e.carName + " " + e.carType + " " + e.carPrice + " " + e.carModel);
                                                                                }
                                                                                System.out.println("Do you want update more cars?\nPress 1 to update more cars\nEnter 2 to exit");
                                                                                int press = input.nextInt();
                                                                                input.nextLine();
                                                                                if (press == 1) {
                                                                                    perr = true;
                                                                                } else if (press == 2) {
                                                                                    System.out.println("Exiting----");
                                                                                    perr = false;
                                                                                    check = true;

                                                                                }


                                                                            } else {
                                                                                System.out.println("NO such car is present in the record");
                                                                                perr = false;
                                                                                check = true;

                                                                            }

                                                                        } while (perr);


                                                                        break;
                                                                    case 3:
                                                                        boolean rem = true;
                                                                        do {
                                                                            System.out.println("Enter a car with you want to remove: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            int model = 0;
                                                                            boolean checkIn = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model: ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);

                                                                            boolean foundCar = false;
                                                                            ShowRoomCars found = null;
                                                                            int index = 0;

                                                                            for (int i = 0; i < ShowRoomCars.newLocalCars.size(); i++) {
                                                                                if (ShowRoomCars.newLocalCars.get(i).carName.equalsIgnoreCase(carName) && ShowRoomCars.newLocalCars.get(i).carType.equalsIgnoreCase(carType) && ShowRoomCars.newLocalCars.get(i).carModel == model) {
                                                                                    found = ShowRoomCars.newLocalCars.get(i);
                                                                                    index = i;

                                                                                    foundCar = true;
                                                                                }
                                                                            }

                                                                            if (foundCar) {
                                                                                ShowRoomCars.newLocalCars.remove(found);
                                                                                try {
                                                                                    FileInputStream fis = new FileInputStream("tn.txt");
                                                                                    ObjectInputStream ois = new ObjectInputStream(fis);
                                                                                    ArrayList checkForRemoval = (ArrayList<ShowRoomCars>) ois.readObject();
                                                                                    checkForRemoval.remove(index);
                                                                                    ois.close();
                                                                                    FileOutputStream fos = new FileOutputStream("tn.txt");
                                                                                    ObjectOutputStream o = new ObjectOutputStream(fos);
                                                                                    o.writeObject(checkForRemoval);
                                                                                    o.flush();
                                                                                    o.close();

                                                                                } catch (IOException | ClassNotFoundException e) {
                                                                                    e.printStackTrace();

                                                                                }

                                                                                System.out.println("Removed successfully");

                                                                                System.out.println("Do you want remove more cars?\nPress 1 to remove more cars\nEnter 2 to exit");
                                                                                int press = input.nextInt();
                                                                                input.nextLine();
                                                                                if (press == 1) {
                                                                                    rem = true;
                                                                                } else if (press == 2) {
                                                                                    System.out.println("Exiting----");
                                                                                    rem = false;
                                                                                    check = true;

                                                                                }


                                                                            } else {
                                                                                System.out.println("NO such car is present in the record");
                                                                                rem = false;
                                                                                check = true;

                                                                            }


                                                                        } while (rem);

                                                                        break;
                                                                    case 4:
                                                                        System.out.println("Getting back to menu");
                                                                        check = false;
                                                                        goo = true;


                                                                        break;

                                                                }

                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Invalid input.Retype again");
                                                                input.reset();
                                                                input.next();

                                                            }


                                                        } while (check);

                                                        break;
                                                    case 2:
                                                        boolean check_1 = true;
                                                        do {
                                                            try {
                                                                System.out.println("Enter 1 to add old Local car\nEnter 2 to update Old Local car\nEnter 3 to remove Local car\nEnter 4 to go back to menu");
                                                                int choicee_1 = input.nextInt();
                                                                input.nextLine();
                                                                check_1 = false;
                                                                if (choicee_1 != 1 && choicee_1 != 2 && choicee_1 != 3 && choicee_1 != 4) {
                                                                    System.out.println("Oops! looks like you have entered invalid number key. retype again.\nPlz retype again");
                                                                    continue;
                                                                }
                                                                switch (choicee_1) {
                                                                    case 1:
                                                                        boolean per = true;
                                                                        do {
                                                                            System.out.println("Enter a car with details: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            boolean checkIt = true;
                                                                            int price = 0;
                                                                            int model = 0;
                                                                            int condition = 0;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car price: ");
                                                                                    int carPrice = input.nextInt();
                                                                                    price = carPrice;
                                                                                    input.nextLine();
                                                                                    checkIt = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid price format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIt);
                                                                            boolean checkIn = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model (2010-2021): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);
                                                                            boolean checkIn_1 = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Condition: ");
                                                                                    int carCondition = input.nextInt();
                                                                                    condition = carCondition;
                                                                                    if (carCondition > 10 || carCondition < 1) {
                                                                                        System.out.println("Invalid Input: Enter between 1 and 10: ");
                                                                                        continue;
                                                                                    }
                                                                                    input.nextLine();
                                                                                    checkIn_1 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Condition format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_1);

                                                                            LocalCar car = new LocalCar(carName, carType, price, model, condition);
                                                                            car.getOldLocalCars().add(car);
                                                                            try {
                                                                                ArrayList<ShowRoomCars> oldLocalCarsRecord = car.getOldLocalCars();
                                                                                FileOutputStream fos = new FileOutputStream("to.txt");
                                                                                ObjectOutputStream obj = new ObjectOutputStream(fos);
                                                                                obj.writeObject(oldLocalCarsRecord);
                                                                                obj.flush();
                                                                                obj.close();

                                                                            } catch (IOException e) {
                                                                                e.printStackTrace();

                                                                            }
                                                                            System.out.println("Do you want add more cars?\nPress 1 to add more cars\nEnter 2 to exit");
                                                                            int press = input.nextInt();
                                                                            input.nextLine();
                                                                            if (press == 1) {
                                                                                per = true;
                                                                            } else if (press == 2) {
                                                                                System.out.println("Exiting----");
                                                                                per = false;
                                                                                check_1 = true;

                                                                            }

                                                                        } while (per);
                                                                        break;
                                                                    case 2:
                                                                        boolean perr = true;
                                                                        do {
                                                                            System.out.println("Enter a car with you want to update with: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car you want to add: ");
                                                                            System.out.println("Enter car name:");
                                                                            String addCar = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type you want to add  ");
                                                                            String addCarType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            boolean checkIt = true;
                                                                            int price = 0;
                                                                            int model = 0;
                                                                            int condition = 0;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car price: ");
                                                                                    int carPrice = input.nextInt();
                                                                                    price = carPrice;
                                                                                    input.nextLine();
                                                                                    checkIt = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid price format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIt);
                                                                            boolean checkIn = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model (2010-2021): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);
                                                                            boolean checkIn_1 = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Condition: ");
                                                                                    int carCondition = input.nextInt();
                                                                                    if (carCondition > 10 || carCondition < 1) {
                                                                                        System.out.println("Invalid Input: Enter between 1 and 10: ");
                                                                                        continue;
                                                                                    }
                                                                                    condition = carCondition;
                                                                                    input.nextLine();
                                                                                    checkIn_1 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Condition format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_1);

                                                                            boolean foundCar = false;
                                                                            int index = 0;
                                                                            for (int i = 0; i < ShowRoomCars.oldLocalCars.size(); i++) {
                                                                                if (ShowRoomCars.oldLocalCars.get(i).carName.equalsIgnoreCase(carName) && ShowRoomCars.oldLocalCars.get(i).carType.equalsIgnoreCase(carType)) {
                                                                                    index = i;
                                                                                    foundCar = true;
                                                                                }
                                                                            }
                                                                            if (foundCar) {
                                                                                LocalCar car = new LocalCar(addCar, addCarType, price, model, condition);
                                                                                ShowRoomCars.oldLocalCars.set(index, car);
                                                                                try {
                                                                                    FileInputStream fis = new FileInputStream("to.txt");
                                                                                    ObjectInputStream ois = new ObjectInputStream(fis);
                                                                                    ArrayList checkForUpdate = (ArrayList<ShowRoomCars>) ois.readObject();
                                                                                    checkForUpdate.set(index, car);
                                                                                    ois.close();
                                                                                    FileOutputStream fos = new FileOutputStream("to.txt");
                                                                                    ObjectOutputStream o = new ObjectOutputStream(fos);
                                                                                    o.writeObject(checkForUpdate);
                                                                                    o.flush();
                                                                                    o.close();
//


                                                                                } catch (IOException | ClassNotFoundException e) {
                                                                                    e.printStackTrace();

                                                                                }
                                                                                System.out.println("Do you want update more cars?\nPress 1 to update more cars\nEnter 2 to exist");
                                                                                int press = input.nextInt();
                                                                                input.nextLine();
                                                                                if (press == 1) {
                                                                                    perr = true;
                                                                                } else if (press == 2) {
                                                                                    System.out.println("Exiting----");
                                                                                    perr = false;
                                                                                    check_1 = true;

                                                                                }


                                                                            } else {
                                                                                System.out.println("NO such car is present in the record");
                                                                                perr = false;
                                                                                check_1 = true;

                                                                            }


                                                                        } while (perr);


                                                                        break;
                                                                    case 3:
                                                                        boolean rem = true;
                                                                        do {
                                                                            System.out.println("Enter a car with you want to remove : ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine();
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine();
                                                                            int model = 0;

                                                                            boolean checkIn = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model (2010-2021): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);

                                                                            boolean foundCar = false;
                                                                            int index = 0;
                                                                            ShowRoomCars found = null;

                                                                            for (int i = 0; i < ShowRoomCars.oldLocalCars.size(); i++) {
                                                                                if (ShowRoomCars.oldLocalCars.get(i).carName.equalsIgnoreCase(carName) && ShowRoomCars.oldLocalCars.get(i).carType.equalsIgnoreCase(carType) && ShowRoomCars.oldLocalCars.get(i).carModel == model) {
                                                                                    found = ShowRoomCars.oldLocalCars.get(i);
                                                                                    index = i;

                                                                                    foundCar = true;
                                                                                }
                                                                            }
                                                                            if (foundCar) {
                                                                                ShowRoomCars.oldLocalCars.remove(found);
                                                                                try {
                                                                                    FileInputStream fis = new FileInputStream("to.txt");
                                                                                    ObjectInputStream ois = new ObjectInputStream(fis);
                                                                                    ArrayList checkForRemoval = (ArrayList<ShowRoomCars>) ois.readObject();
                                                                                    checkForRemoval.remove(index);
                                                                                    ois.close();
                                                                                    FileOutputStream fos = new FileOutputStream("to.txt");
                                                                                    ObjectOutputStream o = new ObjectOutputStream(fos);
                                                                                    o.writeObject(checkForRemoval);
                                                                                    o.flush();
                                                                                    o.close();


                                                                                } catch (IOException | ClassNotFoundException e) {
                                                                                    e.printStackTrace();

                                                                                }
                                                                                System.out.println("Removed successfully");
                                                                                System.out.println("Do you want remove more cars?\nPress 1 to remove more cars\nEnter 2 to exit");
                                                                                int press = input.nextInt();
                                                                                input.nextLine();
                                                                                if (press == 1) {
                                                                                    rem = true;
                                                                                } else if (press == 2) {
                                                                                    System.out.println("Exiting----");
                                                                                    rem = false;
                                                                                    check_1 = true;

                                                                                }


                                                                            } else {
                                                                                System.out.println("NO such car is present in the record");
                                                                                rem = false;
                                                                                check_1 = true;

                                                                            }


                                                                        } while (rem);

                                                                        break;
                                                                    case 4:
                                                                        System.out.println("Getting back to menu");
                                                                        check_1 = false;
                                                                        goo = true;


                                                                        break;

                                                                }

                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Invalid input.Retype again");
                                                                input.reset();
                                                                input.next();

                                                            }


                                                        } while (check_1);
                                                        break;
                                                    case 3:
                                                        System.out.println("Going back to menu: ");
                                                        goo = false;
                                                        start = true;
                                                        break;


                                                }


                                            } catch (InputMismatchException e) {
                                                System.out.println("Invalid key. retype again");
                                                input.reset();
                                                input.next();


                                            }


                                        } while (goo);
                                        break;
                                    case 2:
                                        boolean test = true;
                                        do {
                                            try {
                                                System.out.println("Press 1 to go for new Imported cars\nPress 2 to go for used Imported cars\nPress 3 to go back to  menu");
                                                int choose = input.nextInt();
                                                input.nextLine();
                                                if (choose != 1 && choose != 2 && choose != 3) {
                                                    System.out.println("Oops! looks like you have entered invalid number key. retype again.\nPlz retype again");
                                                    continue;
                                                }
                                                test = false;
                                                switch (choose) {
                                                    case 1:
                                                        boolean check = true;
                                                        do {
                                                            try {
                                                                System.out.println("Enter 1 to add new Imported car\nEnter 2 to update new Imported car\nEnter 3 to remove car\nEnter 4 to go back to menu");
                                                                int choicee = input.nextInt();
                                                                input.nextLine();
                                                                check = false;
                                                                if (choicee != 1 && choicee != 2 && choicee != 3 && choicee != 4) {
                                                                    System.out.println("Oops! looks like you have entered invalid number key. retype again.\nPlz retype again");
                                                                    continue;
                                                                }
                                                                switch (choicee) {
                                                                    case 1:
                                                                        boolean per = true;
                                                                        do {
                                                                            System.out.println("Enter a car with details: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            boolean auctionSheet = false;
                                                                            boolean checker = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter Y if auction sheet is available N if not: ");
                                                                                    String tester = input.nextLine();
                                                                                    if (tester.equalsIgnoreCase("Y")) {
                                                                                        auctionSheet = true;
                                                                                    } else if (tester.equalsIgnoreCase("N")) {
                                                                                        auctionSheet = false;
                                                                                    }
                                                                                    checker = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid key. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checker);

                                                                            boolean checkIt = true;
                                                                            int price = 0;
                                                                            int model = 0;
                                                                            int carCondition = 0;
                                                                            int yearOfImport = 0;
                                                                            double gradesAtTimeOfImport = 0;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car price: ");
                                                                                    int carPrice = input.nextInt();
                                                                                    price = carPrice;
                                                                                    input.nextLine();
                                                                                    checkIt = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid price format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIt);
                                                                            boolean checkIn = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model (2006-2018): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);
                                                                            boolean chk = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car condition: ");
                                                                                    int condition = input.nextInt();
                                                                                    carCondition = condition;
                                                                                    if (condition < 1) {
                                                                                        System.out.println("Enter condition greater than 0");
                                                                                        continue;
                                                                                    }
                                                                                    input.nextLine();
                                                                                    chk = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid  format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (chk);
                                                                            boolean checkIn_1 = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Import Year (2010-2021): ");
                                                                                    int ImportYr = input.nextInt();
                                                                                    yearOfImport = ImportYr;
                                                                                    input.nextLine();
                                                                                    checkIn_1 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Import Year format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_1);
                                                                            boolean checkIn_2 = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Grades (MAX 5): ");
                                                                                    double grades = input.nextInt();
                                                                                    gradesAtTimeOfImport = grades;
                                                                                    input.nextLine();
                                                                                    checkIn_2 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Grades format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_2);

                                                                            ImportedCar car = new ImportedCar(carName, carType, price, model,
                                                                                    carCondition, yearOfImport, gradesAtTimeOfImport, auctionSheet);
                                                                            car.getNewImportedCars().add(car);
                                                                            try {
                                                                                ArrayList<ShowRoomCars> newImportedCarsRecord = car.getNewImportedCars();
                                                                                FileOutputStream fos = new FileOutputStream("y.txt");
                                                                                ObjectOutputStream obj = new ObjectOutputStream(fos);
                                                                                obj.writeObject(newImportedCarsRecord);
                                                                                obj.flush();
                                                                                obj.close();

                                                                            } catch (IOException e) {
                                                                                e.printStackTrace();

                                                                            }
                                                                            System.out.println("Do you want add more cars?\nPress 1 to add more cars\nEnter 2 to exit");
                                                                            int press = input.nextInt();
                                                                            input.nextLine();
                                                                            if (press == 1) {
                                                                                per = true;
                                                                            } else if (press == 2) {
                                                                                System.out.println("Exiting----");
                                                                                per = false;
                                                                                check = true;

                                                                            }

                                                                        } while (per);
                                                                        break;
                                                                    case 2:
                                                                        boolean perr = true;
                                                                        do {
                                                                            System.out.println("Enter a car with you want to update with: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car with you want to add: ");
                                                                            System.out.println("Enter car name:");
                                                                            String addCar = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String addCarType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            boolean auctionSheet = false;
                                                                            boolean checker = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter Y if auction sheet is available N if not: ");
                                                                                    String tester = input.nextLine();
                                                                                    if (tester.equalsIgnoreCase("Y")) {
                                                                                        auctionSheet = true;
                                                                                    } else if (tester.equalsIgnoreCase("N")) {
                                                                                        auctionSheet = false;
                                                                                    }
                                                                                    checker = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid key. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checker);

                                                                            boolean checkIt = true;
                                                                            int price = 0;
                                                                            int model = 0;
                                                                            int carCondition = 0;
                                                                            int yearOfImport = 0;
                                                                            double gradesAtTimeOfImport = 0;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car price: ");
                                                                                    int carPrice = input.nextInt();
                                                                                    price = carPrice;
                                                                                    input.nextLine();
                                                                                    checkIt = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid price format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIt);
                                                                            boolean checkIn = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model (2006-2018): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);
                                                                            boolean checkIn_1 = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Import Year (2010-2021): ");
                                                                                    int importYear = input.nextInt();
                                                                                    yearOfImport = importYear;
                                                                                    input.nextLine();
                                                                                    checkIn_1 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Year format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_1);
                                                                            boolean checkIn_2 = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Grades (MAX 5): ");
                                                                                    double grades = input.nextInt();
                                                                                    gradesAtTimeOfImport = grades;
                                                                                    input.nextLine();
                                                                                    checkIn_2 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Grades format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_2);

                                                                            boolean foundCar = false;
                                                                            int index = 0;
                                                                            for (int i = 0; i < ShowRoomCars.newImportedCars.size(); i++) {
                                                                                if (ShowRoomCars.newImportedCars.get(i).carName.equalsIgnoreCase(carName) && ShowRoomCars.newImportedCars.get(i).carType.equalsIgnoreCase(carType)) {
                                                                                    index = i;
                                                                                    foundCar = true;
                                                                                }
                                                                            }
                                                                            if (foundCar) {
                                                                                ImportedCar car = new ImportedCar(addCar, addCarType, price, model, carCondition,
                                                                                        yearOfImport, gradesAtTimeOfImport, auctionSheet);
                                                                                ShowRoomCars.newImportedCars.set(index, car);

                                                                                try {
                                                                                    FileInputStream fis = new FileInputStream("y.txt");
                                                                                    ObjectInputStream ois = new ObjectInputStream(fis);
                                                                                    ArrayList checkForUpdate = (ArrayList<ShowRoomCars>) ois.readObject();
                                                                                    checkForUpdate.set(index, car);
                                                                                    ois.close();
                                                                                    FileOutputStream fos = new FileOutputStream("y.txt");
                                                                                    ObjectOutputStream o = new ObjectOutputStream(fos);
                                                                                    o.writeObject(checkForUpdate);
                                                                                    o.flush();
                                                                                    o.close();


                                                                                } catch (IOException | ClassNotFoundException e) {
                                                                                    e.printStackTrace();

                                                                                }
                                                                                System.out.println("Updated successfully");
                                                                                for (ShowRoomCars e : ShowRoomCars.newImportedCars) {
                                                                                    System.out.println(e.carName + " " + e.carType + " " + e.carPrice + " " + e.carModel +
                                                                                            e.carCondition + " " + e.yearOfImport + " " + e.gradeAtTimeOfImport + " " +
                                                                                            e.auctionSheet);
                                                                                }
                                                                                System.out.println("Do you want update more cars?\nPress 1 to update more cars\nEnter 2 to exit");
                                                                                int press = input.nextInt();
                                                                                input.nextLine();
                                                                                if (press == 1) {
                                                                                    perr = true;
                                                                                } else if (press == 2) {
                                                                                    System.out.println("Exiting----");
                                                                                    perr = false;
                                                                                    check = true;

                                                                                }


                                                                            } else {
                                                                                System.out.println("NO such car is present in the record");
                                                                                perr = false;
                                                                                check = true;

                                                                            }


                                                                        } while (perr);


                                                                        break;
                                                                    case 3:
                                                                        boolean rem = true;
                                                                        do {
                                                                            System.out.println("Enter a car with you want to remove with: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            boolean auctionSheet = false;
                                                                            boolean checker = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter Y if auction sheet is available N if not: ");
                                                                                    String tester = input.nextLine();
                                                                                    if (tester.equalsIgnoreCase("Y")) {
                                                                                        auctionSheet = true;
                                                                                    } else if (tester.equalsIgnoreCase("N")) {
                                                                                        auctionSheet = false;
                                                                                    }
                                                                                    checker = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid key. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checker);
                                                                            boolean checkIt = true;
                                                                            int price = 0;
                                                                            int model = 0;
                                                                            int condition = 0;
                                                                            int yearOfImport = 0;
                                                                            double gradesAtTimeOfImport = 0;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car price: ");
                                                                                    int carPrice = input.nextInt();
                                                                                    price = carPrice;
                                                                                    input.nextLine();
                                                                                    checkIt = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid price format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIt);
                                                                            boolean checkIn = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model (2006-2018): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);
                                                                            boolean checkIn_1 = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Import Year (2010-2021): ");
                                                                                    int ImportYr = input.nextInt();
                                                                                    yearOfImport = ImportYr;
                                                                                    input.nextLine();
                                                                                    checkIn_1 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Import Year format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_1);
                                                                            boolean checkIn_2 = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Grades (MAX 5): ");
                                                                                    double grades = input.nextInt();
                                                                                    gradesAtTimeOfImport = grades;
                                                                                    input.nextLine();
                                                                                    checkIn_2 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Grades format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_2);

                                                                            boolean foundCar = false;
                                                                            ShowRoomCars found = null;
                                                                            int index = 0;

                                                                            for (int i = 0; i < ShowRoomCars.newImportedCars.size(); i++) {
                                                                                if (ShowRoomCars.newImportedCars.get(i).carName.equalsIgnoreCase(carName) && ShowRoomCars.newImportedCars.get(i).carType.equalsIgnoreCase(carType)) {
                                                                                    found = ShowRoomCars.newImportedCars.get(i);
                                                                                    index = i;
                                                                                    foundCar = true;
                                                                                }
                                                                            }
                                                                            if (foundCar) {
                                                                                ShowRoomCars.newImportedCars.remove(found);
                                                                                try {
                                                                                    FileInputStream fis = new FileInputStream("y.txt");
                                                                                    ObjectInputStream ois = new ObjectInputStream(fis);
                                                                                    ArrayList checkForRemoval = (ArrayList<ShowRoomCars>) ois.readObject();
                                                                                    checkForRemoval.remove(index);
                                                                                    ois.close();
                                                                                    FileOutputStream fos = new FileOutputStream("y.txt");
                                                                                    ObjectOutputStream o = new ObjectOutputStream(fos);
                                                                                    o.writeObject(checkForRemoval);
                                                                                    o.flush();
                                                                                    o.close();


                                                                                } catch (IOException | ClassNotFoundException e) {
                                                                                    e.printStackTrace();

                                                                                }
                                                                                System.out.println("Removed successfully");
                                                                                System.out.println("Do you want remove more cars?\nPress 1 to remove more cars\nEnter 2 to exit");
                                                                                int press = input.nextInt();
                                                                                input.nextLine();
                                                                                if (press == 1) {
                                                                                    rem = true;
                                                                                } else if (press == 2) {
                                                                                    System.out.println("Exiting----");
                                                                                    rem = false;
                                                                                    check = true;

                                                                                }


                                                                            } else {
                                                                                System.out.println("NO such car is present in the record");
                                                                                rem = false;
                                                                                check = true;

                                                                            }


                                                                        } while (rem);

                                                                        break;
                                                                    case 4:
                                                                        System.out.println("Getting back to menu");
                                                                        check = false;
                                                                        test = true;
                                                                        break;

                                                                }

                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Invalid input.Retype again");
                                                                input.reset();
                                                                input.next();

                                                            }


                                                        } while (check);
                                                        break;
                                                    case 2:
                                                        boolean check_1 = true;
                                                        do {
                                                            try {
                                                                System.out.println("Enter 1 to add old Imported car\nEnter 2 to update old Imported car\nEnter 3 to remove car\nEnter 4 to go back to menu");
                                                                int choicee = input.nextInt();
                                                                input.nextLine();
                                                                check_1 = false;
                                                                if (choicee != 1 && choicee != 2 && choicee != 3 && choicee != 4) {
                                                                    System.out.println("Oops! looks like you have entered invalid number key. retype again.\nPlz retype again");
                                                                    continue;
                                                                }
                                                                switch (choicee) {
                                                                    case 1:
                                                                        boolean per = true;
                                                                        do {
                                                                            System.out.println("Enter a car with details: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            boolean auctionSheet = false;
                                                                            boolean checker = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter Y if auction sheet is available N if not: ");
                                                                                    String tester = input.nextLine();
                                                                                    if (tester.equalsIgnoreCase("Y")) {
                                                                                        auctionSheet = true;
                                                                                    } else if (tester.equalsIgnoreCase("N")) {
                                                                                        auctionSheet = false;
                                                                                    }
                                                                                    checker = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid key. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checker);

                                                                            boolean checkIt = true;
                                                                            int price = 0;
                                                                            int model = 0;
                                                                            int carCondition = 0;
                                                                            int yearOfImport = 0;
                                                                            double gradesAtTimeOfImport = 0;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car price: ");
                                                                                    int carPrice = input.nextInt();
                                                                                    price = carPrice;
                                                                                    input.nextLine();
                                                                                    checkIt = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid price format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIt);
                                                                            boolean checkIn = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model(2006-2018): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);
                                                                            boolean checkIn_1 = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Import Year(2010-2021): ");
                                                                                    int ImportYr = input.nextInt();
                                                                                    yearOfImport = ImportYr;
                                                                                    input.nextLine();
                                                                                    checkIn_1 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Import Year format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_1);
                                                                            boolean checkIn_2 = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Grades (MAX 5): ");
                                                                                    double grades = input.nextInt();
                                                                                    gradesAtTimeOfImport = grades;
                                                                                    input.nextLine();
                                                                                    checkIn_2 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Grades format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_2);

                                                                            ImportedCar car = new ImportedCar(carName, carType, price, model,
                                                                                    carCondition, yearOfImport, gradesAtTimeOfImport, auctionSheet);
                                                                            car.getOldImportedCars().add(car);
                                                                            try {
                                                                                ArrayList<ShowRoomCars> oldImportedCarsRecord = car.getOldImportedCars();
                                                                                FileOutputStream fos = new FileOutputStream("io.txt");
                                                                                ObjectOutputStream obj = new ObjectOutputStream(fos);
                                                                                obj.writeObject(oldImportedCarsRecord);
                                                                                obj.flush();
                                                                                obj.close();

                                                                            } catch (IOException e) {
                                                                                e.printStackTrace();

                                                                            }
                                                                            System.out.println("Do you want add more cars?\nPress 1 to add more cars\nEnter 2 to exit");
                                                                            int press = input.nextInt();
                                                                            input.nextLine();
                                                                            if (press == 1) {
                                                                                per = true;
                                                                            } else if (press == 2) {
                                                                                System.out.println("Exiting----");
                                                                                per = false;
                                                                                check_1 = true;

                                                                            }

                                                                        } while (per);
                                                                        break;
                                                                    case 2:
                                                                        boolean perr = true;
                                                                        do {
                                                                            System.out.println("Enter a car with you want to update with: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car you want to  add: ");
                                                                            System.out.println("Enter car name:");
                                                                            String addCarName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String addCarType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            boolean auctionSheet = false;
                                                                            boolean checker = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter Y if auction sheet is available N if not: ");
                                                                                    String tester = input.nextLine();
                                                                                    if (tester.equalsIgnoreCase("Y")) {
                                                                                        auctionSheet = true;
                                                                                    } else if (tester.equalsIgnoreCase("N")) {
                                                                                        auctionSheet = false;
                                                                                    }
                                                                                    checker = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid key. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checker);

                                                                            boolean checkIt = true;
                                                                            int price = 0;
                                                                            int model = 0;
                                                                            int carCondition = 0;
                                                                            int yearOfImport = 0;
                                                                            double gradesAtTimeOfImport = 0;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car price: ");
                                                                                    int carPrice = input.nextInt();
                                                                                    price = carPrice;
                                                                                    input.nextLine();
                                                                                    checkIt = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid price format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIt);
                                                                            boolean checkIn = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model(2006-2018): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);
                                                                            boolean checkIn_1 = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Import Year(2010-2021): ");
                                                                                    int importYear = input.nextInt();
                                                                                    yearOfImport = importYear;
                                                                                    input.nextLine();
                                                                                    checkIn_1 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Year format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_1);
                                                                            boolean checkIn_2 = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Grades (MAX 5): ");
                                                                                    double grades = input.nextInt();
                                                                                    gradesAtTimeOfImport = grades;
                                                                                    input.nextLine();
                                                                                    checkIn_2 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Grades format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_2);

                                                                            boolean foundCar = false;
                                                                            int index = 0;
                                                                            for (int i = 0; i < ShowRoomCars.oldImportedCars.size(); i++) {
                                                                                if (ShowRoomCars.oldImportedCars.get(i).carName.equalsIgnoreCase(carName) && ShowRoomCars.oldLocalCars.get(i).carType.equalsIgnoreCase(carType)) {
                                                                                    index = i;
                                                                                    foundCar = true;

                                                                                }
                                                                            }
                                                                            if (foundCar) {
                                                                                ImportedCar car = new ImportedCar(addCarName, addCarType, price, model, carCondition,
                                                                                        yearOfImport, gradesAtTimeOfImport, auctionSheet);
                                                                                ShowRoomCars.oldImportedCars.set(index, car);
                                                                                try {
                                                                                    FileInputStream fis = new FileInputStream("io.txt");
                                                                                    ObjectInputStream ois = new ObjectInputStream(fis);
                                                                                    ArrayList checkForUpdate = (ArrayList<ShowRoomCars>) ois.readObject();
                                                                                    checkForUpdate.set(index, car);
                                                                                    ois.close();
                                                                                    FileOutputStream fos = new FileOutputStream("io.txt");
                                                                                    ObjectOutputStream o = new ObjectOutputStream(fos);
                                                                                    o.writeObject(checkForUpdate);
                                                                                    o.flush();
                                                                                    o.close();
//

                                                                                } catch (IOException | ClassNotFoundException e) {
                                                                                    e.printStackTrace();

                                                                                }

                                                                                System.out.println("Updated successfully");
                                                                                for (ShowRoomCars e : ShowRoomCars.oldImportedCars) {
                                                                                    System.out.println(e.carName + " " + e.carType + " " + e.carPrice + " " + e.carModel +
                                                                                            e.carCondition + " " + e.yearOfImport + " " + e.gradeAtTimeOfImport + " " +
                                                                                            e.auctionSheet);
                                                                                }
                                                                                System.out.println("Do you want update more cars?\nPress 1 to update more cars\nEnter 2 to exit");
                                                                                int press = input.nextInt();
                                                                                input.nextLine();
                                                                                if (press == 1) {
                                                                                    perr = true;
                                                                                } else if (press == 2) {
                                                                                    System.out.println("Exiting----");
                                                                                    perr = false;
                                                                                    check_1 = true;

                                                                                }


                                                                            } else {
                                                                                System.out.println("NO such car is present in the record");
                                                                                perr = false;
                                                                                check_1 = true;

                                                                            }


                                                                        } while (perr);


                                                                        break;
                                                                    case 3:
                                                                        boolean rem = true;
                                                                        do {
                                                                            System.out.println("Enter a car with you want to remove with: ");
                                                                            System.out.println("Enter car name:");
                                                                            String carName = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            System.out.println("Enter a car type  ");
                                                                            String carType = input.nextLine().toUpperCase(Locale.ROOT);
                                                                            boolean auctionSheet = false;
                                                                            boolean checker = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter Y if auction sheet is available N if not: ");
                                                                                    String tester = input.nextLine();
                                                                                    if (tester.equalsIgnoreCase("Y")) {
                                                                                        auctionSheet = true;
                                                                                    } else if (tester.equalsIgnoreCase("N")) {
                                                                                        auctionSheet = false;
                                                                                    }
                                                                                    checker = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid key. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checker);
                                                                            boolean checkIt = true;
                                                                            int price = 0;
                                                                            int model = 0;
                                                                            int condition = 0;
                                                                            int yearOfImport = 0;
                                                                            double gradesAtTimeOfImport = 0;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car price: ");
                                                                                    int carPrice = input.nextInt();
                                                                                    price = carPrice;
                                                                                    input.nextLine();
                                                                                    checkIt = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid price format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIt);
                                                                            boolean checkIn = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Model(2006-2018): ");
                                                                                    int carModel = input.nextInt();
                                                                                    model = carModel;
                                                                                    input.nextLine();
                                                                                    checkIn = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Model format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn);
                                                                            boolean checkIn_1 = true;

                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Import Year(2010-2021): ");
                                                                                    int ImportYr = input.nextInt();
                                                                                    yearOfImport = ImportYr;
                                                                                    input.nextLine();
                                                                                    checkIn_1 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Import Year format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_1);
                                                                            boolean checkIn_2 = true;
                                                                            do {
                                                                                try {
                                                                                    System.out.println("Enter car Grades (MAX 5): ");
                                                                                    double grades = input.nextInt();
                                                                                    gradesAtTimeOfImport = grades;
                                                                                    input.nextLine();
                                                                                    checkIn_2 = false;
                                                                                } catch (InputMismatchException e) {
                                                                                    System.out.println("Invalid car Grades format. re-enter again");
                                                                                    input.reset();
                                                                                    input.next();
                                                                                }
                                                                            } while (checkIn_2);

                                                                            boolean foundCar = false;
                                                                            ShowRoomCars found = null;
                                                                            int index = 0;

                                                                            for (int i = 0; i < ShowRoomCars.oldImportedCars.size(); i++) {
                                                                                if (ShowRoomCars.oldImportedCars.get(i).carName.equalsIgnoreCase(carName) && ShowRoomCars.oldImportedCars.get(i).carType.equalsIgnoreCase(carType)) {
                                                                                    found = ShowRoomCars.oldImportedCars.get(i);
                                                                                    index = i;
                                                                                    foundCar = true;

                                                                                }
                                                                            }
                                                                            if (foundCar) {
                                                                                ShowRoomCars.oldImportedCars.remove(found);
                                                                                try {
                                                                                    FileInputStream fis = new FileInputStream("io.txt");
                                                                                    ObjectInputStream ois = new ObjectInputStream(fis);
                                                                                    ArrayList checkForRemoval = (ArrayList<ShowRoomCars>) ois.readObject();
                                                                                    checkForRemoval.remove(index);
                                                                                    ois.close();
                                                                                    FileOutputStream fos = new FileOutputStream("io.txt");
                                                                                    ObjectOutputStream o = new ObjectOutputStream(fos);
                                                                                    o.writeObject(checkForRemoval);
                                                                                    o.flush();
                                                                                    o.close();


                                                                                } catch (IOException | ClassNotFoundException e) {
                                                                                    e.printStackTrace();

                                                                                }
                                                                                System.out.println("Removed successfully");
                                                                                System.out.println("Do you want remove more cars?\nPress 1 to remove more cars\nEnter 2 to exit");
                                                                                int press = input.nextInt();
                                                                                input.nextLine();
                                                                                if (press == 1) {
                                                                                    rem = true;
                                                                                } else if (press == 2) {
                                                                                    System.out.println("Exiting----");
                                                                                    rem = false;
                                                                                    check_1 = true;

                                                                                }


                                                                            } else {
                                                                                System.out.println("NO such car is present in the record");
                                                                                rem = false;
                                                                                check_1 = true;

                                                                            }


                                                                        } while (rem);

                                                                        break;
                                                                    case 4:
                                                                        System.out.println("Getting back to menu");
                                                                        check_1 = false;
                                                                        test = true;
                                                                        break;

                                                                }

                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Invalid input.Retype again");
                                                                input.reset();
                                                                input.next();

                                                            }


                                                        } while (check_1);
                                                        break;

                                                    case 3:
                                                        System.out.println("Going back to menu: ");
                                                        test = false;
                                                        start = true;
                                                        break;


                                                }


                                            } catch (InputMismatchException e) {
                                                System.out.println("Invalid key. retype again");
                                                input.reset();
                                                input.next();


                                            }


                                        } while (test);
                                        break;

                                    case 3:
                                        System.out.println();
                                        start = false;
                                        go = true;
                                        break;
                                }


                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. re-enter again");
                                input.reset();
                                input.next();
                            }


                        } while (start);
                        break;
                    case 2:
                        boolean checkCustomer = true;
                        do {
                            try {
                                System.out.println("Welcome Customer\nEnter 1 to checkout Local Car  section\nEnter 2 to checkout Imported car  Section\nEnter 3 to quit ");
                                System.out.println("Enter choice");
                                int key = input.nextInt();
                                if (key != 1 && key != 2 && key != 3) {
                                    System.out.println("Invalid key.Re-enter again");
                                    continue;
                                }
                                checkCustomer = false;
                                input.nextLine();
                                boolean doIt = true;
                                do {
                                    switch (key) {
                                        case 1:
                                            boolean setPurchase = true;
                                            do {
                                                try {
                                                    System.out.println("Enter 1 for Local Car purchase\nEnter 2 for Local Car sale\nEnter 3 to checkout Cars detail\nEnter 4 to quit");
                                                    System.out.println("Enter choice");
                                                    int choicee = input.nextInt();
                                                    input.nextLine();
                                                    setPurchase = false;
                                                    LocalCar localCar = new LocalCar();

                                                    switch (choicee) {
                                                        case 1:
                                                            localCar.purchaseCar();
                                                            doIt = false;
                                                            checkCustomer = true;
                                                            break;
                                                        case 2:
                                                            localCar.saleCar();
                                                            doIt = false;
                                                            checkCustomer = true;
                                                            break;

                                                        case 3:
                                                            localCar.customerShowRoomDetails();
                                                            System.out.println("fsds");
                                                            doIt = false;
                                                            checkCustomer = true;
                                                            break;

                                                        case 4:
                                                            System.out.println("Getting back");
                                                            doIt = false;
                                                            checkCustomer = true;
                                                            break;


                                                    }

                                                } catch (InputMismatchException e) {
                                                    System.out.println("Invalid input. re-enter again");
                                                    input.reset();
                                                    input.next();

                                                }


                                            } while (setPurchase);
                                            break;
                                        case 2:
                                            boolean checkImported = true;
                                            do {
                                                try {
                                                    System.out.println("Enter 1 for Imported Car purchase\nEnter 2 for Imported Car sale\nEnter 3 to checkout Imported Cars detail\nEnter 4 to quit");
                                                    System.out.println("Enter choice");
                                                    int choicee = input.nextInt();
                                                    input.nextLine();
                                                    checkImported = false;
                                                    ImportedCar importedCar = new ImportedCar();
                                                    switch (choicee) {
                                                        case 1:
                                                            importedCar.purchaseCar();
                                                            doIt = false;
                                                            checkCustomer = true;
                                                            break;
                                                        case 2:
                                                            importedCar.saleCar();
                                                            doIt = false;
                                                            checkCustomer = true;
                                                            break;
                                                        case 3:
                                                            importedCar.customerShowRoomDetails();
                                                            doIt = false;
                                                            checkCustomer = true;

                                                            break;
                                                        case 4:
                                                            System.out.println("Getting back to  menu");
                                                            doIt = false;
                                                            checkCustomer = true;
                                                            break;

                                                    }

                                                } catch (InputMismatchException e) {
                                                    System.out.println("Invalid input. re-enter again");
                                                    input.reset();
                                                    input.next();
                                                }

                                            } while (checkImported);

                                            break;
                                        case 3:
                                            System.out.println("Getting back to menu");
                                            doIt = false;
                                            go = true;

                                            break;

                                    }

                                } while (doIt);


                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. re-enter again");
                                input.reset();
                                input.next();


                            }

                        } while (checkCustomer);


                        break;
                    case 3:
//                        try {
//                            FileOutputStream fos = new FileOutputStream("in.txt");
//                            ObjectOutputStream obj = new ObjectOutputStream(fos);
//                            obj.reset();
//
//
//                        }catch (IOException e){
//                            e.printStackTrace();
//                        }

                        System.out.println("Quiting------");


                        break;


                }


            } catch (InputMismatchException e) {
                System.out.println("Invalid key. retype again");
                input.reset();
                input.next();
            }


        } while (go);

    }


    // Main menu
    // two option? are you an admin?(Login and registration , Add Cars(Add local new Cars, add local used cars) , (add imported new cars , add imported used cars)Remove Car((remove local new Cars, add local used cars) , (remove imported new cars , remove imported used cars))
    // Are you  a customer?((Option 1-purchase car(purchase local(purchase local new , purchase local used) , purchase imported(purchase imported new , purchase imported used)) ,
    //Option-2 sell car((sale local(sale local used car , let us sell local used car for you) , sell imported(sale used imported car , let us sell local used car for you ))
    //Option-3 just checking out cars at showRoom( local , imported (can also have a soft copy (read and write))
    //Option 4 (check your last purchase or sell( deed of agreement))(with additional func: do you want a soft copy of it? if yes read it from file. else return to main
    // Gui using both mouse and keyboard.


}


