/**
 * 
 */
package main;


import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Nick Madero
 *
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

    	  // Create a Label with some text
        Label label = new Label("Hello, World!");

        // Create a StackPane layout and add the Label to it
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a Scene with the StackPane as its root
        Scene scene = new Scene(root, 400, 300);

        // Set the title of the Stage
       stage.setTitle("My JavaFX Application");

        // Set the Scene of the Stage
        stage.setScene(scene);

        // Show the Stage
       stage.show();
    	
    	
    	
        // gets the fxml and loads
      //  StageAndScene.getInstance();

     //   stage = StageAndScene.getInstance().getActiveStage();
     //   stage.show();

        // loads inital settings from file to current instance
      //  SettingsControls.applySettings();


    }

    @Override
    public void init() throws Exception {


        Font.loadFont("../resources/fonts/cambria/cambria.ttc", 16);

   //     Settings.getInstance();

//        System.out.println(Settings.getInstance().getSettings().get("size").getProperties());

    }

}