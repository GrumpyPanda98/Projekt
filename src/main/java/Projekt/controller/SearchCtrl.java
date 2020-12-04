package Projekt.controller;

import java.io.IOException;
import java.util.Optional;
import Projekt.model.Patient;
import Projekt.model.PatientHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class SearchCtrl {

    private String cprNumber;
    private Stage dialogStage;

    @FXML
    private TextField cprTextfield;

    @FXML
    private Button SearchButton;

    @FXML
    void MaxTextField(KeyEvent event) {

        final int maxLength = 10;

        cprTextfield.setOnKeyTyped(t -> {

            if (cprTextfield.getText().length() > maxLength) {
                int pos = cprTextfield.getCaretPosition();
                cprTextfield.setText(cprTextfield.getText(0, maxLength));
                cprTextfield.positionCaret(pos); // To reposition caret since setText sets it at the beginning by
                                                 // default
            }

        });

    }

    @FXML
    void SearchPressed(ActionEvent event) throws IOException {

            Patient.setCprNumber(cprTextfield.getText());
            Patient.getHealthCaredata(cprNumber);  
            if (!PatientHandler.tempName.equals("fejl")) {

            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("Den kommende side viser oplysninger om: " + PatientHandler.tempName + "                                             ");
            alert.setContentText("Ved at trykker 'OK' bekraefter du, at du har samtykke fra patienten, og at det er den rigtige patient?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
    // ... user chose OK
                FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("/SummaryView.fxml")); // Ny loader som henter "SummaryView"
                Parent root1 = (Parent) fxmlloader.load(); 
                Stage stage = new Stage(); //Vi laver en ny stage
                stage.setScene(new Scene(root1));
                stage.show(); //Vi viser den nye stage
                
                cprTextfield.clear(); // Clear cpr nummeret efter der er klikket ok
                
                } 
                else {
    // ... user chose CANCEL or closed the dialog
                 cprTextfield.clear(); // clear cpr nummeret hvis det er den forkerte patient
            }
        }
        else {
            // forkert format grundet tegn og/eller bogstaver
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Ugyldigt CPR-nummer format");
            alert.setHeaderText("CPR-nummeret skal være 10 tal.");
            alert.setContentText("CPR-nummeret skal have formatet 10 tal.\nIngen bogstaver, tegn eller mellemrum. ");
            alert.showAndWait();
        
            
        }   

        

        
        




    }

    


}


