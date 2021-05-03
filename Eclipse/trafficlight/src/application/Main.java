package application;
	
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,200,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			Rectangle box = new Rectangle(0,0,200,600);
			box.setFill(Color.BLACK);
			root.getChildren().add(box);
			
			Circle light = new Circle (100);
			light.setFill(Color.RED);
			light.setCenterX(100);
			root.getChildren().add(light);
			
			KeyValue redY = new KeyValue(light.translateYProperty(),100, Interpolator.DISCRETE);
			KeyValue redColor = new KeyValue(light.fillProperty(), Color.RED, Interpolator.DISCRETE);
			KeyFrame redFrame = new KeyFrame(Duration.ZERO, redY, redColor);
			
			KeyValue yellowY = new KeyValue(light.translateYProperty(),300, Interpolator.DISCRETE);
			KeyValue yellowColor = new KeyValue(light.fillProperty(), Color.YELLOW, Interpolator.DISCRETE);
			KeyFrame yellowFrame = new KeyFrame(new Duration (1700), yellowY, yellowColor);
			
			KeyValue greenY = new KeyValue(light.translateYProperty(),500, Interpolator.DISCRETE);
			KeyValue greenColor = new KeyValue(light.fillProperty(), Color.GREEN, Interpolator.DISCRETE);
			KeyFrame greenFrame = new KeyFrame(new Duration (1000), greenY, greenColor);
			
			KeyFrame redFrame2 = new KeyFrame(new Duration(2000), redY, redColor);
			
			Timeline timeline = new Timeline();
			timeline.getKeyFrames().addAll(redFrame, greenFrame, yellowFrame, redFrame2);
			timeline.setCycleCount(Timeline.INDEFINITE);
			timeline.play();
			
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
