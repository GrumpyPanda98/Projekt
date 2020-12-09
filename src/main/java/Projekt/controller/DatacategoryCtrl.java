package Projekt.controller;

import java.net.URL;

import java.util.ResourceBundle;
import Projekt.model.Datacategory;
import Projekt.model.FEV1;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
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
    private Button weight;

    @FXML
    private Button bmi;

    @FXML
    private Button mrc;

    @FXML
    private Button fev1;

    @FXML
    private Button fvc;

    @FXML
    private Button sixmwt;


    private ObservableList<Datacategory> dataList = FXCollections.observableArrayList();

    @FXML
    public TableView<Datacategory> tabDataView;
    
    @FXML
    public TableColumn<Datacategory, String> colDate;

    @FXML
    public TableColumn<Datacategory, String> colResult;

    @FXML
    private Label adress;

    @FXML
    private Label notes;

    @FXML
    void bmiPressed(ActionEvent event) {
        
        dataList.clear();
        BmiHandler bmi = new BmiHandler(PatientHandler.newCPR);
               
        dataList.addAll(bmi.getListOfBMI());
        tabDataView.setItems(dataList);
    }

    
    @FXML
    void fev1Pressed(ActionEvent event) {
        dataList.clear();
        FEV1Handler fev1 = new FEV1Handler(PatientHandler.newCPR);
               
        dataList.addAll(fev1.getListOfFEV1());
        tabDataView.setItems(dataList);
    }

    @FXML
    void fvcPressed(ActionEvent event) {
        dataList.clear();
        FvcHandler fvc = new FvcHandler(PatientHandler.newCPR);
               
        dataList.addAll(fvc.getListOfFVC());
        tabDataView.setItems(dataList);
    }
    

    @FXML
    void mrcPressed(ActionEvent event) {
        dataList.clear();
        MrcHandler mrc = new MrcHandler(PatientHandler.newCPR);
               
        dataList.addAll(mrc.getListOfMrc());
        tabDataView.setItems(dataList);

    }

    @FXML
    void sixmwtPressed(ActionEvent event) {
        dataList.clear();
        SixMwtHandler sixmwt = new SixMwtHandler(PatientHandler.newCPR);
               
        dataList.addAll(sixmwt.getListOfSixMwt());
        tabDataView.setItems(dataList);
    }

    @FXML
    void smokestatusPressed(ActionEvent event) {

    }

    @FXML
    void weightPressed(ActionEvent event) {
        dataList.clear();
        WeightChangeHandler weightChange = new WeightChangeHandler(PatientHandler.newCPR);
               
        dataList.addAll(weightChange.getListOfWeight());
        tabDataView.setItems(dataList);
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


    
    tabDataView.setRowFactory( tv -> {
        TableRow<Datacategory> row = new TableRow<>();
        row.setOnMouseClicked(event -> {
            if (event.getClickCount() == 1 && (! row.isEmpty()) ) {
                Datacategory rowData = row.getItem();
                notes.setText(rowData.notes);
                adress.setText("Sted:" + rowData.doneBy);
            }
        });
        return row ;
    });
    
    }

    
}
