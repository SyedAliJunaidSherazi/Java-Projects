package org.djbros;

import javax.swing.*;
import java.io.Serializable;
import java.util.*;

public abstract class ShowRoomCars extends JFrame  implements ShowRoomFunctions , Serializable  {
    protected static double totalBudget = 20_000;
    protected transient Scanner input = new Scanner(System.in);
    public String carName;
    public String carType;
    public double carPrice;
    public int carCondition;
    public int carModel;
    public int yearOfImport;
    public double gradeAtTimeOfImport;
    public boolean auctionSheet;
    public static  ArrayList<ShowRoomCars> newLocalCars = new ArrayList();
    public static  ArrayList<ShowRoomCars> oldLocalCars = new ArrayList();
    public static  ArrayList<ShowRoomCars> newImportedCars = new ArrayList();
    public static  ArrayList<ShowRoomCars> oldImportedCars = new ArrayList();
    public static  ArrayList<ShowRoomCars> soldLocalCars = new ArrayList();
    public static  ArrayList<ShowRoomCars> soldImportedCars = new ArrayList();
    protected final transient Calendar calendar = Calendar.getInstance();


    // resolve the bug of quiting in purchase both cases plus checkout for other bugs


    protected ShowRoomCars(){
//        this.setDefaultCloseOperation(ShowRoomCars.EXIT_ON_CLOSE);
//        this.setSize(750 , 750);
//        this.setVisible(true);
//        this.setLayout(null);



    }

    protected ShowRoomCars(String carName, String carType, double carPrice, int carModel) {
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
        this.carModel = carModel;

    }

    protected ShowRoomCars(String carName, String carType, double carPrice, int carModel, int carCondition , int yearOfImport , double gradeAtTimeOfImport, boolean auctionSheet) {
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
        this.carModel = carModel;
        this.carCondition = carCondition;
        this.yearOfImport = yearOfImport;
        this.gradeAtTimeOfImport = gradeAtTimeOfImport;
        this.auctionSheet = auctionSheet;


    }
    protected ShowRoomCars(String carName, String carType, double carPrice, int carModel, int carCondition) {
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
        this.carModel = carModel;
        this.carCondition = carCondition;


    }


    protected ShowRoomCars(String carName, String carType, double carPrice) {
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;

    }




    public  ArrayList<ShowRoomCars> getNewImportedCars() {
        return newImportedCars;
    }

    public  ArrayList<ShowRoomCars> getNewLocalCars() {
        return newLocalCars;
    }

    public ArrayList<ShowRoomCars> getOldImportedCars() {
        return oldImportedCars;
    }

    public ArrayList<ShowRoomCars> getSoldImportedCars() {
        return soldImportedCars;
    }

    public ArrayList<ShowRoomCars> getOldLocalCars() {
        return oldLocalCars;
    }

    @Override
    public void lastPurchaseDeed() {

    }

    @Override
    public void purchaseCar() {

    }

    @Override
    public String toString() {
        return "Nothing in the stock";
    }

    @Override
    public void saleCar() {

    }

    @Override
    public void customerShowRoomDetails() {

    }

    @Override
    public void managerShowRoomDetails() {

    }


    public String getCarType() {
        return carType;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarModel() {
        return carModel;
    }

    public double getCarPrice() {
        return carPrice;
    }
}


