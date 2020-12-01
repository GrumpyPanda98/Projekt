package Projekt.controller;

import java.sql.SQLException;

import Projekt.controller.DatabaseCtrl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class SearchCtrl extends DatabaseCtrl {

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
    void SearchPressed(ActionEvent event) throws SQLException {
        DatabaseHanddlerCtrl("SELECT `navn` FROM `Patientinfo` WHERE `CPR` = 1111111111");
                    
        }

    }



