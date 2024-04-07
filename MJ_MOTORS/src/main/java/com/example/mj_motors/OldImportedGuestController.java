package com.example.mj_motors;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class OldImportedGuestController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    TextField searchOld;
    @FXML
    TableView<Cars> oldImportedTable;
    @FXML
    TableColumn<Cars , Integer> carId;
    @FXML
    TableColumn<Cars , String> carName;

    @FXML
    TableColumn<Cars , Integer> carPrice;
    @FXML
    TableColumn<Cars , Integer> carModel;
    @FXML
    TableColumn<Cars , Integer> carCondition;
    @FXML
    TableColumn<Cars , String> carType;
    @FXML
    TableColumn<Cars , Integer> carYOI;
    @FXML
    TableColumn<Cars , Integer> carGrade;
    @FXML
    TableColumn<Cars , String> carAuction;

    ObservableList<Cars> oldImportedList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            Connection connection = Db_Connection.provideConnection();
            ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM OLDIMPORTEDCARS");
            while (rs.next()) {

                oldImportedList.add(new Cars(rs.getInt("CAR_ID"), rs.getInt("CAR_CONDITION"),
                        rs.getString("CAR_NAME"), rs.getInt("CAR_MODEL"), rs.getInt("CAR_PRICE"), rs.getString("CAR_TYPE")

                        , rs.getInt("CAR_YEAROFIMPORT") , rs.getString("CAR_AUCTIONSHEET"), rs.getInt("CAR_GRADE")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        carId.setCellValueFactory(new PropertyValueFactory<>("carId"));
        carName.setCellValueFactory(new PropertyValueFactory<>("carName"));
        carPrice.setCellValueFactory(new PropertyValueFactory<>("carPrice"));
        carModel.setCellValueFactory(new PropertyValueFactory<>("carModel"));
        carCondition.setCellValueFactory(new PropertyValueFactory<>("carCondition"));
        carType.setCellValueFactory(new PropertyValueFactory<>("carType"));
        carYOI.setCellValueFactory(new PropertyValueFactory<>("carImportYear"));
        carAuction.setCellValueFactory(new PropertyValueFactory<>("carAuction"));
        carGrade.setCellValueFactory(new PropertyValueFactory<>("carGrade"));

        oldImportedTable.setItems(oldImportedList);

        FilteredList<Cars> searchedCar = new FilteredList<>(oldImportedList, b -> true);
        searchOld.textProperty().addListener((observable, oldValue, newValue) -> {

            searchedCar.setPredicate(Cars -> {

                if (newValue.isEmpty() || newValue.isBlank() || newValue == null) {

                    return true;

                }
                String searchval = newValue.toLowerCase(Locale.ROOT);
                if (Cars.getCarName().toLowerCase(Locale.ROOT).indexOf(searchval) > -1) {
                    return true;

                } else {
                    return false;
                }

            });


        });
        SortedList<Cars> sortedSearch = new SortedList<>(searchedCar);
        sortedSearch.comparatorProperty().bind(oldImportedTable.comparatorProperty());
        oldImportedTable.setItems(sortedSearch);


    }
    @FXML
    protected void back(ActionEvent actionEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("checkoutMenuImported.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
