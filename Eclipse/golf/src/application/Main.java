package application;
	
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			//grass
			Rectangle grass = new Rectangle (0,60,120, 20);
			grass.setFill(Color.DARKGREEN);
			root.getChildren().add(grass);
			
			//line
			Line line = new Line (120, 10, 120, 80);
			line.setStroke(Color.BLACK);
			root.getChildren().add(line);
			
			//ball
			Circle ball = new Circle (15, 55, 5);
			ball.setFill(Color.PURPLE);
			root.getChildren().add(ball);
			
			//flag
			Polygon flag = new Polygon(100, 30, 120, 10, 120, 30);
			flag.setFill(Color.AQUA);
			root.getChildren().add(flag);
			
			//path
			
			QuadCurveTo arcPath = new QuadCurveTo();
			arcPath.setControlX(80);
			arcPath.setControlY(25);
			arcPath.setX(115);
			arcPath.setY(55);
			
			Path ballpathforward = new Path();
			ballpathforward.getElements().add(new MoveTo(15,55)); //sets the end position
			ballpathforward.getElements().add(arcPath); //moves the ball in an arc to end position
			PathTransition ballAnimation = new PathTransition(); //sets animation as ballAnimation
			ballAnimation.setDuration(Duration.seconds(1)); //sets length it takes to animate
			ballAnimation.setPath(ballpathforward); //moves animation along path
			ballAnimation.setNode(ball); //makes animation affect ball
			ballAnimation.play();	//plays the animation
					
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
