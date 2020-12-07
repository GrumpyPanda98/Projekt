package Projekt.controller;

import java.net.URL;
import java.util.ResourceBundle;

import Projekt.model.PatientHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SummaryCtrl implements Initializable {

    @FXML
    private Label fornavn;

    @FXML
    private Label efternavn;

    @FXML
    private Label addresse;

    @FXML
    private Button doctorButton;

    @FXML
    private Button hospitalButton;

    @FXML
    private Label CPR;

    @FXML
    void doctorButtonPressed(ActionEvent event) {

    }

    @FXML
    void hospitalButtonPressed(ActionEvent event) {

    }

  
    @Override
    public void initialize(URL location, ResourceBundle resources) {
                fornavn.setText(PatientHandler.tempName);
                CPR.setText(PatientHandler.newCPR);
                addresse.setText(PatientHandler.newAddress);
            }

    }

  
    


