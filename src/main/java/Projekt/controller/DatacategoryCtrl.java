package Projekt.controller;

import java.net.URL;

import java.util.ResourceBundle;
import Projekt.model.Datacategory;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import Projekt.Handler.*;

public class DatacategoryCtrl implements Initializable {

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private Button smokestatus;

    @FXML
    private Button fev1;

    @FXML
    private Button mwt;

    @FXML
    private Button bmi;

    @FXML
    private Button fvc;

    @FXML
    private Button weight;

    @FXML
    private Button mrc;

    @FXML
    private Label adress;

    @FXML
    private Label notes;


    private ObservableList<Datacategory> dataList = FXCollections.observableArrayList();

    @FXML
    public TableView<Datacategory> tabDataView;
    
    @FXML
    public TableColumn<Datacategory, String> colDate;

    @FXML
    public TableColumn<Datacategory, String> colResult;

    @FXML
    void bmiPressed(ActionEvent event) {
        BmiHandler pp = new BmiHandler(PatientHandler.newCPR);
               
        dataList.addAll(pp.getListOfBMI());
        tabDataView.setItems(dataList);
    }

    @FXML
    void fev1Pressed(ActionEvent event) {

    }

    @FXML
    void fvcPressed(ActionEvent event) {

    }

    @FXML
    void mrcPressed(ActionEvent event) {

    }

    @FXML
    void mwtPressed(ActionEvent event) {

    }

    @FXML
    void smokestatusPressed(ActionEvent event) {

    }

    @FXML
    void weightPressed(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (SummaryCtrl.hospital == true) {
            adress.setText("Hospital");
        }

        else {
            adress.setText("Praksis");
        }
        // Initialize table with the two columns.
        colDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDate()));
        colResult.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getResult()));
    }


}
