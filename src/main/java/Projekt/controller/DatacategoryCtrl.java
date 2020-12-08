package Projekt.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import Projekt.model.BMI;
import Projekt.model.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Label dato1;

    @FXML
    private Label resultat1;

    @FXML
    private Label dato2;

    @FXML
    private Label resultat2;

    @FXML
    private Label dato3;

    @FXML
    private Label resultat3;

    @FXML
    private Label dato4;

    @FXML
    private Label resultat4;

    @FXML
    private Label dato5;

    @FXML
    private Label resultat5;

    @FXML
    private Label dato6;

    @FXML
    private Label resultat6;

    @FXML
    private Label dato7;

    @FXML
    private Label resultat7;

    @FXML
    private Label dato8;

    @FXML
    private Label resultat8;

    @FXML
    private Label dato9;

    @FXML
    private Label resultat9;

    @FXML
    private Label dato10;

    @FXML
    private Label resultat10;

    @FXML
    private Label dato11;

    @FXML
    private Label resultat11;

    @FXML
    private Label dato12;

    @FXML
    private Label resultat12;

    @FXML
    private Label dato13;

    @FXML
    private Label resultat13;

    @FXML
    private Label dato14;

    @FXML
    private Label resultat14;

    @FXML
    private Label dato15;

    @FXML
    private Label resultat15;

    @FXML
    private Label dato16;

    @FXML
    private Label resultat16;

    @FXML
    private Label adress;

    @FXML
    private Label notes;

    @FXML
    void bmiPressed(ActionEvent event) {
       // listOfBMI.getHealthCaredata(PatientHandler.newCPR);

    //     for (int i = 0; i < 16; i++) {
    //         if (BmiHandler.getListOfBMI().get(i).date.isEmpty()) {
    //             BmiHandler.getListOfBMI().get(i).date = "-";
    //         }
    //         if (BmiHandler.getListOfBMI().get(i).result.isEmpty()){
    //                 BmiHandler.getListOfBMI().get(i).result = "-";
    //         }
    //    }
      //  dato1.setText(BmiHandler.getListOfBMI().get(0).date);
       // dato2.setText(BmiHandler.getListOfBMI().get(1).date);
        // dato3.setText(BmiHandler.getListOfBMI().get(2).date);
        // dato4.setText(BmiHandler.getListOfBMI().get(3).date);
        // dato5.setText(BmiHandler.getListOfBMI().get(4).date);
        // dato6.setText(BmiHandler.getListOfBMI().get(5).date);
        // dato7.setText(BmiHandler.getListOfBMI().get(6).date);
        // dato8.setText(BmiHandler.getListOfBMI().get(7).date);
        // dato9.setText(BmiHandler.getListOfBMI().get(8).date);
        // dato10.setText(BmiHandler.getListOfBMI().get(9).date);
        // dato11.setText(BmiHandler.getListOfBMI().get(10).date);
        // dato12.setText(BmiHandler.getListOfBMI().get(11).date);
        // dato13.setText(BmiHandler.getListOfBMI().get(12).date);
        // dato14.setText(BmiHandler.getListOfBMI().get(13).date);
        // dato15.setText(BmiHandler.getListOfBMI().get(14).date);
        // dato16.setText(BmiHandler.getListOfBMI().get(15).date);

      //  resultat1.setText(BmiHandler.getListOfBMI().get(0).result);
       // resultat2.setText(BmiHandler.getListOfBMI().get(1).result);
        // resultat3.setText(BmiHandler.getListOfBMI().get(2).result);
        // resultat4.setText(BmiHandler.getListOfBMI().get(3).result);
        // resultat5.setText(BmiHandler.getListOfBMI().get(4).result);
        // resultat6.setText(BmiHandler.getListOfBMI().get(5).result);
        // resultat7.setText(BmiHandler.getListOfBMI().get(6).result);
        // resultat8.setText(BmiHandler.getListOfBMI().get(7).result);
        // resultat9.setText(BmiHandler.getListOfBMI().get(8).result);
        // resultat10.setText(BmiHandler.getListOfBMI().get(9).result);
        // resultat11.setText(BmiHandler.getListOfBMI().get(10).result);
        // resultat12.setText(BmiHandler.getListOfBMI().get(11).result);
        // resultat13.setText(BmiHandler.getListOfBMI().get(12).result);
        // resultat14.setText(BmiHandler.getListOfBMI().get(13).result);
        // resultat15.setText(BmiHandler.getListOfBMI().get(14).result);
        // resultat16.setText(BmiHandler.getListOfBMI().get(15).result);
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

    }


}
