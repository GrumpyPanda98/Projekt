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
import javafx.stage.Stage;


public class LoginCtrl {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginButton;

    HealthPerson loggedInUser = null;  

    @FXML
    void loginPressed(ActionEvent event) throws IOException {
    
   /*Tilføj sundhedspersoner*/
   List<HealthPerson> listOfHealthPersons = new ArrayList<>();
   listOfHealthPersons.add(new HealthPerson("u1", "p1", "Lars Pilgaard", "Lungeafdelingen, Randers hospital"));
   listOfHealthPersons.add(new HealthPerson("u2", "p2", "Hans Pillegaard", "Roevafdelingen, Aalborg hospital"));
        
    for (HealthPerson healthperson : listOfHealthPersons) 
    {
        if (username.getText().equals(healthperson.getUsername()))
        {
            if (password.getText().equals(healthperson.getPassword()))
            {
                loggedInUser = healthperson ;

                break;
            }
            
        }
    }
        
    
    if (loggedInUser!=null)
        {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("/SearchView.fxml")); // Ny loader som henter "SearchView"
           Parent root1 = (Parent) fxmlloader.load(); 
           Stage stage = new Stage();
           stage.setScene(new Scene(root1));
           stage.show();
        }
        else
        {
    
        Alert alert = new Alert(AlertType.ERROR);
          alert.setTitle("Error Message");
          alert.setHeaderText("Du har indtastet de forkerte login-oplysniger");
          alert.showAndWait();
        }
} 

}
    
          
    






