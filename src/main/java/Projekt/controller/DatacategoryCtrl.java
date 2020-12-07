package Projekt.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


import java.net.URL;
import java.util.ResourceBundle;

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
    private TableView<?> results;

    @FXML
    private Label notes;

    @FXML
    private Label adress;

    @FXML
    void bmiPressed(ActionEvent event) {

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
        if (SummaryCtrl.hospital==true){
            adress.setText("Hospital");
        }  

        else {
            adress.setText("Praksis");
        }
    }

}
