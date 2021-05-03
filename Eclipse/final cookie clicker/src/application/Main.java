package application;
	
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
			primaryStage.show();
			
			String c ="https://lh6.ggpht.com/0O-HefMHNwemt4gnJ4YfNq3xFaTBaiFcwIRiUpzDZ1KObI8ptEMgoHOSDiy_tumRWexz=w300";
			Image cookie = new Image(c);
			
			Cookie mainCookie = new Cookie(100, 200, true);
			mainCookie.setImage(cookie);
			root.setCenter(mainCookie);
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
