package com.example.mj_motors;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Locale;
import java.util.ResourceBundle;

import static java.lang.Integer.lowestOneBit;
import static java.lang.Integer.parseInt;

public class NewLocalSectionController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public int value;

    @FXML
    AnchorPane paneNew1, paneNew2, pane1, pane2;
    @FXML
    TableView<Cars> newCarlocal;
    @FXML
    TableColumn<Cars, Integer> carId;
    @FXML
    TableColumn<Cars, String> carName;
    @FXML
    TableColumn<Cars, Integer> carPrice;
    @FXML
    TableColumn<Cars, String> carType;
    @FXML
    TableColumn<Cars, Integer> carModel;
    @FXML
    TableColumn<Cars, Integer> carCondition;
    @FXML
    TextField searchNew, carIdUserNew, userPrice;
    @FXML
    Label price, priceDeneWala, idDeneWala;
    public boolean check = false;



    ObservableList<Cars> list = FXCollections.observableArrayList();
    ObservableList<Cars> searchList = FXCollections.observableArrayList();
    ObservableList<Cars> selectedItem = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        try {
            Connection connection = Db_Connection.provideConnection();
            ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM NEWLOCALCARS");
            while (rs.next()) {
                list.add(new Cars(rs.getInt("CAR_ID"), rs.getInt("CAR_CONDITION"),
                        rs.getString("CAR_NAME"), rs.getInt("CAR_MODEL"), rs.getInt("CAR_PRICE"), rs.getString("CAR_TYPE")));
            }

            carId.setCellValueFactory(new PropertyValueFactory<>("carId"));
            carName.setCellValueFactory(new PropertyValueFactory<>("carName"));
            carPrice.setCellValueFactory(new PropertyValueFactory<>("carPrice"));
            carModel.setCellValueFactory(new PropertyValueFactory<>("carModel"));
            carCondition.setCellValueFactory(new PropertyValueFactory<>("carCondition"));
            carType.setCellValueFactory(new PropertyValueFactory<>("carType"));

            newCarlocal.setItems(list);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void buyNewCar(ActionEvent actionEvent) throws IOException, SQLException {


        System.out.println(selectedItem.get(0).carPrice);
        Connection connection = Db_Connection.provideConnection();
        ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM NEWLOCALCARS");
        int car_id = 0;
//        String sqlTbl = "INSERT INTO CARID (CAR_ID , CAR_PRICE)";
//        String sqlVal = "VALUES ('" + parseInt(carIdUserNew.getText()) + selectedItem.get(0).carPrice + "')";
//        String sql = sqlTbl + sqlVal;
//        Statement statement = connection.createStatement();
//        int rows = statement.executeUpdate(sql);
//        if (rows > 0) {
//            System.out.println(" Car id added successfully");
//            statement.close();
//        }
        while (rs.next()) {
            car_id = rs.getInt(1);
            if (carIdUserNew.getText().isEmpty()) {
                invalidCarDialog();
            } else if (parseInt(carIdUserNew.getText()) == car_id) {
                value = parseInt(carIdUserNew.getText());
                idDeneWala.setText(carIdUserNew.getText());

                FXMLLoader loader = new FXMLLoader(getClass().getResource("buyNewCar.fxml"));
                root = loader.load();
//            root = FXMLLoader.load(getClass().getResource(""));
                stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                // price retrun to be called her

            }
        }
//        if (carIdUserNew.getText().isEmpty()) {
//            invalidCarDialog();
//        } else if (parseInt(carIdUserNew.getText()) == car_id) {
//            value = parseInt(carIdUserNew.getText());
//            System.out.println(value);
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("buyNewCar.fxml"));
//            root = loader.load();
////            root = FXMLLoader.load(getClass().getResource(""));
//            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//            // price retrun to be called her
//
//        } else {
//            carsNotFoundDialog();
//
//
//        }

    }

    @FXML
    protected void searchOtherNewCar() {
        paneNew2.setVisible(false);
        paneNew1.setVisible(true);
        searchNew.clear();
        newCarlocal.setItems(list);
        selectedItem  = FXCollections.observableArrayList();

    }

    @FXML
    protected void proceedNew(ActionEvent actionEvent) throws IOException ,SQLException {

        paneNew1.setVisible(false);
        paneNew2.setVisible(true);
        System.out.println(carIdUserNew.getText());
        selectedItem.add(newCarlocal.getSelectionModel().getSelectedItem());
        Connection connection = Db_Connection.provideConnection();
        String sqlTbl = "INSERT INTO PRICE (CAR_PRICE)";
        String sqlVal = "VALUES ('" + selectedItem.get(0).carPrice + "')";
        String sql = sqlTbl + sqlVal;
        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(sql);
        if (rows > 0) {
            System.out.println(" Car price added successfully");
            statement.close();
        }
        String sqlTbl1 = "INSERT INTO ID (CAR_ID)";
        String sqlVal1 = "VALUES ('" + selectedItem.get(0).carId + "')";
        String sql1 = sqlTbl1 + sqlVal1;
        Statement statement1 = connection.createStatement();
        int rows1 = statement1.executeUpdate(sql1);
        if (rows1 > 0) {
            System.out.println(" Car id added successfully");
            statement.close();
        }



        for(int i = 0 ; i<selectedItem.size() ; i++){
            System.out.println(selectedItem.get(i).carId);
        }
        System.out.println(selectedItem.get(0).carId);


    }

    @FXML
    protected void search(ActionEvent actionEvent) throws IOException, SQLException {

        Connection connection = Db_Connection.provideConnection();
        ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM NEWLOCALCARS WHERE CAR_NAME = '" + searchNew.getText() + "'");
        if (searchNew.getText().isEmpty()) {
            carsEmptyCredentialsDialog();
        }

        while (rs.next()) {

            searchList = FXCollections.observableArrayList();
            searchList.add(new Cars(rs.getInt("CAR_ID"), rs.getInt("CAR_PRICE"),
                    rs.getString("CAR_NAME"), rs.getInt("CAR_MODEL"), rs.getInt("CAR_CONDITION"), rs.getString("CAR_TYPE")));


        }
        newCarlocal.setItems(searchList);
    }

    @FXML
    protected void carsNotFoundDialog() {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Message");
            alert.setContentText("Car Not Found! Please check your input text");
            alert.showAndWait();
            newCarlocal.setItems(list);
        });

    }

    @FXML
    protected void carsEmptyCredentialsDialog() {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Message");
            alert.setContentText("Please fill the required Credentials");
            alert.showAndWait();
            newCarlocal.setItems(list);
        });

    }

    @FXML
    protected Boolean isSearched() {
        Boolean choice = true;

        return choice;

    }

    @FXML
    protected void invalidCarDialog() {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Message");
            alert.setContentText("Invalid Car Id. Try Again ");
            alert.showAndWait();
        });

    }

    @FXML
    protected void sorryDialog() {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Message");
            alert.setContentText("We Cannot Sell This Car for this price ");
            alert.showAndWait();
        });

    }

    @FXML
    protected void successDialog() {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Message");
            alert.setContentText("Congratulation You have Purchased this Car");
            alert.showAndWait();
        });

    }

    @FXML
    protected void backToMenu(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("localCarsSection.fxml"));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    protected void confirmPurchase() {
        int labelPrice = parseInt(price.toString());
        int priceOfUser = parseInt(userPrice.getText());
        if (labelPrice >= priceOfUser) {
            successDialog();
//            pane1.setVisible(false);
//            pane2.setVisible(true);
            userPrice.clear();
        } else if (priceOfUser + 100000 < labelPrice) {
            sorryDialog();
            userPrice.clear();
        }

    }

//    public int returnPrice() {
//        int car_price = 0;
//
////        try {
////            Connection connection = Db_Connection.provideConnection();
////            ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM NEWLOCALCARS");
////            while (rs.next()) {
////                list.add(new Cars(rs.getInt("CAR_ID"), rs.getInt("CAR_CONDITION"),
////                        rs.getString("CAR_NAME"), rs.getInt("CAR_MODEL"), rs.getInt("CAR_PRICE"), rs.getString("CAR_TYPE")));
////            }
////
////
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////
////
////        for(int i = 0  ;i<list.size() ; i++){
////            System.out.println(list.get(i).carId);
////
////        }
////        System.out.println(priceDeneWala.getText());
////
////
////
////
//
//        try {
//            Connection connection = Db_Connection.provideConnection();
//            ResultSet rs1 = connection.createStatement().executeQuery("SELECT * FROM CARID");
//            ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM NEWLOCALCARS");
//            while (rs.next()) {
//                if(rs1.getInt(1)==rs.getInt(4)){
//                    car_price = rs.getInt(4);
//                }
//
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//        return car_price;
//
//    }

    public int custID(){

        int car_id = 0;
        try {
            Connection connection = Db_Connection.provideConnection();
            ResultSet rs1 = connection.createStatement().executeQuery("SELECT * FROM ID");
            ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM NEWLOCALCARS");
            while (rs.next()) {
                if(rs1.getInt(1)==rs.getInt(1)){
                    car_id = rs.getInt(1);

                }


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return car_id;
    }



}
