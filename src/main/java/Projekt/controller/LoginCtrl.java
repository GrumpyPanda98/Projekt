package Projekt.controller;

import java.io.IOException;
import Projekt.model.HealthPerson;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import Projekt.MainApp;


public class LoginCtrl {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginButton;

    HealthPerson loggedInUser = null;  
    
    @FXML
    void password_enter(KeyEvent event) throws IOException {
        if(event.getCode().equals(KeyCode.ENTER)) {
            checkLogin();
       }
    }

    @FXML
    void username_enter(KeyEvent event) throws IOException {
        if(event.getCode().equals(KeyCode.ENTER)) {
            checkLogin();
       }
    }
    @FXML
    void loginPressed(ActionEvent event) throws IOException {
        checkLogin();
    
  

}
   void checkLogin() throws IOException {
    /*Tilføj sundhedspersoner*/
    List<HealthPerson> listOfHealthPersons = new ArrayList<>(); //Laver en array liste hvor healthperson kan smides ind.
    listOfHealthPersons.add(new HealthPerson("u1", "p1", "Lars Pilgaard", "Lungeafdelingen, Randers hospital"));
    listOfHealthPersons.add(new HealthPerson("u2", "p2", "Hans Pillegaard", "Roevafdelingen, Aalborg hospital"));
         
     for (HealthPerson healthperson : listOfHealthPersons)  //Loop der kører hele listen igennem
     {
         if (username.getText().equals(healthperson.getUsername())) // Sammenligner brugernavn med det der står i textfield
         {
             if (password.getText().equals(healthperson.getPassword())) //Sammenligner password med det der står i passwordfield
             {
                 loggedInUser = healthperson ;
 
                 break;
             }
             
         }
     }
         
     
     if (loggedInUser!=null)
         {
             MainApp.closeWindow(); //Lukker login vindue
             FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("/SearchView.fxml")); // Ny loader som henter "SearchView"
            Parent root1 = (Parent) fxmlloader.load(); 
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
            stage.setTitle("SmartHealthShare");
         }
         else
         {
     
         Alert alert = new Alert(AlertType.ERROR); //Fejldiaglogboks loades hvis loginoplysningerne er forkerte.
           alert.setHeaderText("Du har indtastet de forkerte login-oplysninger"); 
           alert.showAndWait();
         }
        }
 }        







