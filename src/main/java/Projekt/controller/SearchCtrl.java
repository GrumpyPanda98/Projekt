package Projekt.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import Projekt.model.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class SearchCtrl implements Queryable {
    private static String cprNumber;

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
    String SearchPressed(ActionEvent event) {
        cprNumber = cprTextfield.getText();

        return cprNumber;

    }

    @Override
    public void processResultSet(ResultSet rs) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public String returnSqlQuery() {
        String sqlStatement = "SELECT FirstName, LastName FROM Patients WHERE Patients.CPRnumber=" + Patient.getCprNumber();
        return sqlStatement;
    }

    @Override
    public String returnSqlUpdate() {
        // TODO Auto-generated method stub
        return null;
    }

}

