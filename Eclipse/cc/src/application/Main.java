package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			Button twoTimes = new Button();
			Image x2 = new Image("x2.png", 50, 50, false, false);
			twoTimes.setGraphic(new ImageView(x2));
			twoTimes.setLayoutX(25);
			twoTimes.setLayoutY(100);
			twoTimes.setVisible(true);
			root.getChildren().add(twoTimes);
			
			primaryStage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	

		
	}
}
