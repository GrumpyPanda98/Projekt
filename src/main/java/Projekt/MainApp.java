package Projekt;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MainApp extends Application {

   
   
   
  private static Stage primaryStage;
   // public BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        MainApp.primaryStage = primaryStage;
        MainApp.primaryStage.setTitle("SmartDataShare");

    

        showLoginView();
    

        
    }

    public void showLoginView() {
        try {
            
            // Load View
            FXMLLoader loader = new FXMLLoader();
            
            loader.setLocation(MainApp.class.getResource("/LoginView.fxml"));
            AnchorPane LoginView = (AnchorPane) loader.load();
            
            // Show the scene containing the root layout.
            Scene sceneLoginView = new Scene(LoginView);
            primaryStage.setScene(sceneLoginView);
            // ReferralCtrl controller = loader.getController();
            primaryStage.show();
            
                      
        } catch (IOException e) {
            
            e.printStackTrace();
        }   
        
    }

    public static void closeWindow() {
        primaryStage.close();
    }


    public static void main(String[] args) {
        
        launch(args);
    }
}
