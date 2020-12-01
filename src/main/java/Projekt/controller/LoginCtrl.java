package Projekt.controller;

import java.io.IOException;
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

    @FXML
    void loginPressed(ActionEvent event) throws IOException {
        
          if (username.getText().equals("e") && password.getText().equals("e")) {
     
           FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("/SearchView.fxml")); // Ny loader som henter "SearchView"
           
           Parent root1 = (Parent) fxmlloader.load(); 
           Stage stage = new Stage();
           stage.setScene(new Scene(root1));
           stage.show();

          }
          else {
              //System.out.println("");
              Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText("Du har indtastet de forkerte login-oplysniger");
                alert.showAndWait();
          }
    }


}



