package Projekt.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SearchCtrl {

    @FXML
    private TextField cprTextfield;

    @FXML
    private Button SearchButton;

    @FXML
    void SearchPressed(ActionEvent event) {
        System.out.println(cprTextfield.getText()); 
    }

}
