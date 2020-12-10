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
import javafx.scene.control.TableRow;
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
    private TableView<Datacategory> tabDataView;

    @FXML
    private TableColumn<Datacategory, String> colDate;

    @FXML
    private TableColumn<Datacategory, String> colResult;

    @FXML
    private Label adress;

    @FXML
    private Label notes;

    void sortTable() {
        colDate.setSortType(TableColumn.SortType.DESCENDING);
        tabDataView.getSortOrder().add(colDate);
        tabDataView.sort();
    }

    @FXML
    void bmiPressed(ActionEvent event) {

        dataList.clear();
        BmiHandler bmi = new BmiHandler(PatientHandler.newCPR);
        dataList.addAll(bmi.getListOfBMI());
        tabDataView.setItems(dataList);

        sortTable();
    }

    @FXML
    void fev1Pressed(ActionEvent event) {
        dataList.clear();
        FEV1Handler fev1 = new FEV1Handler(PatientHandler.newCPR);

        dataList.addAll(fev1.getListOfFEV1());
        tabDataView.setItems(dataList);

        sortTable();
    }

    @FXML
    void fvcPressed(ActionEvent event) {
        dataList.clear();
        FvcHandler fvc = new FvcHandler(PatientHandler.newCPR);

        dataList.addAll(fvc.getListOfFVC());
        tabDataView.setItems(dataList);

        sortTable();
    }

    @FXML
    void mrcPressed(ActionEvent event) {
        dataList.clear();
        MrcHandler mrc = new MrcHandler(PatientHandler.newCPR);

        dataList.addAll(mrc.getListOfMrc());
        tabDataView.setItems(dataList);

        sortTable();

    }

    @FXML
    void sixmwtPressed(ActionEvent event) {
        dataList.clear();
        SixMwtHandler sixmwt = new SixMwtHandler(PatientHandler.newCPR);

        dataList.addAll(sixmwt.getListOfSixMwt());
        tabDataView.setItems(dataList);

        sortTable();
    }

    @FXML
    void smokestatusPressed(ActionEvent event) {
        dataList.clear();
        SmokeStatusHandler smokestatus = new SmokeStatusHandler(PatientHandler.newCPR);

        dataList.addAll(smokestatus.getListOfSmokeStatus());
        tabDataView.setItems(dataList);

        sortTable();

    }

    @FXML
    void weightPressed(ActionEvent event) {
        dataList.clear();
        WeightChangeHandler weightChange = new WeightChangeHandler(PatientHandler.newCPR);

        dataList.addAll(weightChange.getListOfWeight());
        tabDataView.setItems(dataList);

        sortTable();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (SummaryCtrl.hospital) {
            adress.setText("Hospital");
        }

        else {
            adress.setText("Praksis");
        }
        // Initialize table with the two columns.
        colDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDate()));
        colResult.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getResult()));

        tabDataView.setRowFactory(tv -> {
            TableRow<Datacategory> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 1 && (!row.isEmpty())) {
                    Datacategory rowData = row.getItem();
                    notes.setText(rowData.getNotes());
                    if (SummaryCtrl.hospital)
                        adress.setText("Hospital: " + rowData.getDoneBy());
                    else {
                        adress.setText("Praksis: " + rowData.getDoneBy());
                    }
                }
            });
            return row;
        });

    }

}
