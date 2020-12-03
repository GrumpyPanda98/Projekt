package Projekt.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import Projekt.database.DatabaseManipulator;
import Projekt.database.Queryable;
import Projekt.model.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class SearchCtrl implements Queryable {

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
    void SearchPressed(ActionEvent event) {

        try {   // succes kriterie
            Patient.setCprNumber(cprTextfield.getText());
            System.out.println(Patient.getcprNumber());
            Patient pa = new Patient();
            Patient.getHealthCaredata(cprNumber); 
        } 
        catch (Exception e) {
            // forkert format grundet tegn og/eller bogstaver
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Ugyldigt CPR-nummer format");
            alert.setHeaderText("CPR-nummeret skal være 10 tal.");
            alert.setContentText("CPR-nummeret skal have formatet 10 tal.\nIngen bogstaver, tegn eller mellemrum. ");
            alert.showAndWait();
            
        }   
        




    }

    @Override
    public void processResultSet(ResultSet rs) throws SQLException {
            while(rs.next()){
             Patient patient = new Patient(rs.getString("navn"));
             System.out.println(patient.name);
         }

    }

    @Override
    public String returnSqlQuery() {
     
       String sqlStatement = "SELECT `navn` FROM `Patientinfo` WHERE `CPR` =" + Patient.getcprNumber();
       System.out.println(sqlStatement);
        return sqlStatement;
    }

    @Override
    public String returnSqlUpdate() {
        // TODO Auto-generated method stub
        return null;
    }


}


