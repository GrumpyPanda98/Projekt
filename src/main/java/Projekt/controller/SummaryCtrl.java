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
    private Button laegeKnap;

    @FXML
    private Button sygehusKnap;

    @FXML
    private Label CPR;

    @FXML
    void lageKnapTrykket(ActionEvent event) {

    }

    @FXML
    void sygehusKnapTrykket(ActionEvent event) {

    }

    @FXML
    private URL location;
    @FXML
    private ResourceBundle resources;
/*
    @FXML
    public void initialize()
    {
        fornavn.setText("afdsafasd");
        CPR.setText("fdsafsda");
        addresse.setText("fdsa");
    }
}
	*/
    @Override
    public void initialize(URL location, ResourceBundle resources) {
                fornavn.setText(PatientHandler.tempName);
                CPR.setText(PatientHandler.newCPR);
                addresse.setText(PatientHandler.newAddress);
            }

    }

  

    


