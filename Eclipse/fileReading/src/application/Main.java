package application;
	
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
	int max;
	int nextMax;
	int nextNextMax;
	int nextMin;
	int min;
	int []scores= new int[5];
	String [] names = new String[5];
	String name ="";
	int score =7;
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = new Pane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			TextField textbox = new TextField();
			textbox.setTranslateX(150);
			root.getChildren().add(textbox);
			
			String file = "filepractice.txt";
			FileWriter fwAppend = new FileWriter(file, true);
			BufferedReader br= new BufferedReader(new FileReader(file));
			textbox.setOnKeyPressed(new EventHandler<KeyEvent>() {
			    @Override
			    public void handle(KeyEvent keyEvent) {
			        if (keyEvent.getCode() == KeyCode.ENTER)  {
			            try {
			            	name = textbox.getText();
			            	textbox.setText("");
			            	score=5;
			            	scores[0]=score;
			            	names[0]=name;
			            	for(int i =1; i<scores.length;i++) {
			            		if(br.readLine()!= null) {
			            			scores[i] = Integer.valueOf(br.readLine());
			            		}
			            		names[i]=name;
			            	}
			            	fwAppend.write(String.valueOf(score));
							fwAppend.close();
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
;			        }
			    }
			});
			
			
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
