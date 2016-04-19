package weather;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import model.LocationScreenModel;

public class MainApp extends Application {

    private Stage primaryStage;

    @Override
    /**
     * Launches application by calling on Screen Controller class
     */
    public void start(Stage primaryStage) {
    	
    ScreenController sController = new ScreenController(primaryStage);
    sController.showLocationScreen(primaryStage);
    		
    }
    
    /**
     * Returns primary stage
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
        String location = "78249";
        
        //Create an object to handle the data
        LoadAPI data = new LoadAPI(location);
     
    }
}
