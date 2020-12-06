package Projekt.controller;

import java.net.URL;
import java.util.ResourceBundle;

import Projekt.model.PatientHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SummaryCtrl {

    @FXML
    private static Label fornavn;

    @FXML
    private Label efternavn;

    @FXML
    private static Label addresse;

    @FXML
    private Button laegeKnap;

    @FXML
    private Button sygehusKnap;

    @FXML
    private static Label CPR;
    /*
    @FXML
    public void initialize(){
    fornavn.setText(PatientHandler.tempName);
        CPR.setText(PatientHandler.newCPR);
        addresse.setText(PatientHandler.newAddress);
    }
    */
    @FXML
    void lageKnapTrykket(ActionEvent event) {

    }

    @FXML
    void sygehusKnapTrykket(ActionEvent event) {

    }
	
    
    
    


}