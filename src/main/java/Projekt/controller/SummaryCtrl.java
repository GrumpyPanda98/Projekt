package Projekt.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Projekt.Handler.PatientHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class SummaryCtrl implements Initializable {
public static boolean hospital;

    @FXML
    private Label fornavn;

    @FXML
    private Label addresse;

    @FXML
    private Button doctorButton;

    @FXML
    private Button hospitalButton;

    @FXML
    private Label CPR;

    @FXML
    void doctorButtonPressed(ActionEvent event) throws IOException {
        hospital = false;
        FXMLLoader fxmlloader = new FXMLLoader(); // Ny loader som henter "DatacategoryView"
        fxmlloader.setLocation(getClass().getResource("/DatacategoryView.fxml"));
       // Parent root1 = (Parent) fxmlloader.load(); 
        final Parent root = fxmlloader.load();
        Stage stage = new Stage(); //Vi laver en ny stage
        stage.setScene(new Scene(root));
        stage.show(); //Vi viser den nye stage
        stage.setTitle("SmartHealthShare");
    }

    @FXML
    void hospitalButtonPressed(ActionEvent event) throws IOException {
        hospital = true;
        FXMLLoader fxmlloader = new FXMLLoader(); // Ny loader som henter "DatacategoryView"
        fxmlloader.setLocation(getClass().getResource("/DatacategoryView.fxml"));
       // Parent root1 = (Parent) fxmlloader.load(); 
        final Parent root = fxmlloader.load();
        Stage stage = new Stage(); //Vi laver en ny stage
        stage.setScene(new Scene(root));
        stage.show(); //Vi viser den nye stage
        stage.setTitle("SmartHealthShare");
        
    }

  
    @Override
    public void initialize(URL location, ResourceBundle resources) {
                fornavn.setText(PatientHandler.tempName);
                CPR.setText(PatientHandler.newCPR);
                addresse.setText(PatientHandler.newAddress);
            }

    }

  
    


