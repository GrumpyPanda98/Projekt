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

   
 
    
    /**
     * Initializes the root layout.
     *
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
    public void showSearchView() {
    try {
        // Load person overview.
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/SearchView.fxml"));
        AnchorPane SearchView = (AnchorPane) loader.load();
        
        rootLayout.setCenter(SearchView);
    } catch (IOException e) {
        e.printStackTrace();
    }
} 
 */
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
