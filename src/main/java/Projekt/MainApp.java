package Projekt;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import Projekt.model.*;

public class MainApp extends Application {
 /**
  * Tilføj sundhedspersoner
  */
  HealthPerson Lars = new HealthPerson("username", "password", "Lars Pilgaard", "Lungeafdelingen, Randers hospital");

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showLoginView();
    }
    
    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    /**
     * Shows the person overview inside the root layout.
     */
    public void showLoginView() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/LoginView.fxml"));
            AnchorPane LoginView = (AnchorPane) loader.load();
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(LoginView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	/**
	 * Returns the main stage.
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

    public static void main(String[] args) {
        
        launch(args);
    }
}