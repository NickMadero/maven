/**
 * 
 */
package main;

import javafx.application.Preloader;
import javafx.application.Preloader.StateChangeNotification.Type;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * A preloader that displays the the logo while the application starts
 * @author Marcus Tangradi
 *
 */
public class SpashScreenPreloader extends Preloader {

    private Stage preloaderStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.preloaderStage = primaryStage;

        VBox loading = new VBox(20);
        Image image = new Image(getClass().getResourceAsStream("/resources/images/james.jpg"));
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setFitHeight(640);
        imageView.setFitWidth(800);

        loading.getChildren().add(imageView);

        BorderPane root = new BorderPane(loading);
        Scene scene = new Scene(root);


//        primaryStage.setWidth(800);
//        primaryStage.setHeight(600);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handleStateChangeNotification(StateChangeNotification stateChangeNotification) {
        if (stateChangeNotification.getType() == Type.BEFORE_START) {
            preloaderStage.hide();
        }
    }
}