/**
 * 
 */
package weather;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

/**
 * @author Admin
 *
 */
public class OptionsScreenController {

	private OptionsScreenView view;
	private OptionsScreenModel model;
	private Stage primaryStage;
	
	/**
	 * @param oModel, Stage stage 
	 * @param oView 
	 * 
	 */
	public OptionsScreenController(OptionsScreenView oView, OptionsScreenModel oModel, Stage stage) {
		this.model = oModel;
		this.view = oView;
		setStage(stage);
	}
	
	 /*
     * sets the stage object in this class
     */
    public void setStage(Stage primaryStage){
    	this.primaryStage = primaryStage;
    }
    
    /*
     * returns the stage object
     */
    public Stage getStage(){
    	return this.primaryStage;
    }
	
	
    /*
	 * Event listener for the Settings button.  If pressed will transition to Settings screen.
	 * @return Returns a handler object
	 */
	public EventHandler<ActionEvent> getSetListener(){
		EventHandler handler = new EventHandler<Event>(){
			Stage primaryStage = getStage();
			ScreenController sController = new ScreenController(primaryStage);
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				sController.showOptionsScreen(primaryStage);
			}
			
		};
		return handler;
	}
	/*
	 * Event listener for the Back button.  If pressed will transition to previous screen.
	 * @return Returns a handler object
	 */
	public EventHandler<ActionEvent> getBackListener(Stage stagePrev, Scene scenePrev){
		EventHandler handler = new EventHandler<Event>(){
			
			public void handle(Event event){
				stagePrev.setScene(scenePrev);
				stagePrev.show();
			}
		};
		return handler;
	}
	
}