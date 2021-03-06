package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	BorderPane root;
	int count = 0; int incr=0; int decr=0;
	Boolean timesTwoActive = false;
	Boolean timesFourActive = false;
	Boolean timesEightActive=false;
	//start code from https://stackoverflow.com/questions/20472802/custom-javafx-button-shapes
	String c = "https://eleventhstack.files.wordpress.com/2013/06/chocolate_chip_cookies.jpg";
	//end code from https://stackoverflow.com/questions/20472802/custom-javafx-button-shapes
	Image smallCookieImage = new Image(c, 50, 50, false, false);
	Text counter = new Text(150, 25, "Cookies: ");
	String name;
	String file = "leaderboard.txt";
	int [] scores =new int[5];
	String [] names = new String[5];
	String score =String.valueOf(count);
	int temp=0;
	String info ="";
	private Label scoreReport;
	FileWriter fw;
	int idx;
	int topScore;
	String top;
	Button resetButton = new Button("Reset");
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			//start code from https://stackoverflow.com/questions/27894945/how-do-i-resize-an-imageview-image-in-javafx
			Image cookie = new Image(c, 100, 100, false, false);
			Image clickedcookie = new Image(c, 98, 98, false, false);
			//end code from https://stackoverflow.com/questions/27894945/how-do-i-resize-an-imageview-image-in-javafx
			
			Pane popup = new Pane();
			Scene popupScene = new Scene(popup, 400,400);
			popupScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Label label = new Label("Enter your name and push enter");
			TextField textbox = new TextField();
			textbox.setPrefSize(100,25);
			textbox.setTranslateX(250);
			label.setTranslateX(50);
			popup.getChildren().addAll(textbox, label);
			
			Label scoreReportLabel = new Label("Your score is: ");
			scoreReportLabel.setTranslateX(150);
			scoreReportLabel.setTranslateY(75);
			popup.getChildren().add(scoreReportLabel);
			Label scoreReport = new Label("Your Score Here");
			Label topScoreLabel = new Label("The number 1 score is:");
			topScoreLabel.setTranslateX(150);
			topScoreLabel.setTranslateY(175);
			popup.getChildren().add(topScoreLabel);
			Label topScoreReport = new Label();
			topScoreReport.setTranslateX(150);
			topScoreReport.setTranslateY(200);
			popup.getChildren().add(topScoreReport);
			
			scoreReport.setTranslateY(100);
			scoreReport.setTranslateX(150);
			popup.getChildren().add(scoreReport);

			BufferedReader br = new BufferedReader(new FileReader(file));
			
			textbox.setOnKeyPressed(new EventHandler<KeyEvent>() {
			    @Override
			    public void handle(KeyEvent keyEvent) {
			        if (keyEvent.getCode() == KeyCode.ENTER)  {
			        	
			        	try {
							name =textbox.getText();
							textbox.setText("");
							scoreReport.setText(score+",\t"+name);
							br.mark(15);
							top = String.valueOf(br.readLine());
							idx= top.indexOf(",");
							topScore = Integer.valueOf(top.substring(0,idx));
							fw = new FileWriter(file);
							fw.write("");
							fw.close();
							
							fw = new FileWriter(file, true);
							if(count>=topScore) {
								top=score+",\t"+name;
								fw.write(top);
								topScoreReport.setText(top);
							}
							else {
								fw.write(String.valueOf(top));
							}
							fw.close();
							topScoreReport.setText(String.valueOf(top));
							resetButton.setVisible(true);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			        }
			    }
			});

			
			//start cookie button
			Button clicker = new Button();
			clicker.setGraphic(new ImageView(cookie));
			clicker.setPrefSize(100, 100);
			clicker.setLayoutY(200);
			clicker.setLayoutX(200);	
			root.getChildren().add(clicker);
			//end cookie button
			
			
			resetButton.setPrefSize(100, 50);
			resetButton.setVisible(false);
			resetButton.setTranslateX(300);
			resetButton.setTranslateY(350);
			popup.getChildren().add(resetButton);
			resetButton.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	reset();
			    	primaryStage.setScene(scene);
			    	primaryStage.show();
			    	topScore=0;
			    	idx=0;
			    	name="";
			    	resetButton.setVisible(false);
			    	try {
						br.reset();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    }
			});
			
			Button endButton= new Button("End");
			endButton.setPrefSize(100, 50);
			endButton.setVisible(true);
			root.setTop(endButton);
			endButton.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	primaryStage.setScene(popupScene);
			    	primaryStage.show();
			    	textbox.setVisible(true);
			    	textbox.requestFocus();
		            label.setVisible(true);
			    }
			});
			
			Button twoTimes = new Button();
			Image x2 = new Image("x2.png", 50, 50, false, false);
			twoTimes.setGraphic(new ImageView(x2));
			twoTimes.setLayoutX(25);
			twoTimes.setLayoutY(100);
			twoTimes.setVisible(false);
			root.getChildren().add(twoTimes);
			
			Button fourTimes = new Button();
			Image x4 = new Image("x4.png", 50, 50, false, false);
			fourTimes.setGraphic(new ImageView(x4));
			fourTimes.setLayoutX(25);
			fourTimes.setLayoutY(150);
			fourTimes.setVisible(false);
			root.getChildren().add(fourTimes);
			
			Button eightTimes = new Button();
			Image x8 = new Image("x8.png", 50, 50, false, false);
			eightTimes.setGraphic(new ImageView(x8));
			eightTimes.setLayoutX(25);
			eightTimes.setLayoutY(200);
			eightTimes.setVisible(false);
			root.getChildren().add(eightTimes);
			
			//start code from https://docs.oracle.com/javafx/2/ui_controls/button.htm
			twoTimes.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override public void handle(MouseEvent e) {
					//end code from https://docs.oracle.com/javafx/2/ui_controls/button.htm
					multi(-1,100);
					timesTwoActive=true;
					twoTimes.setVisible(false);
					scfalling(120, true);
				}
			});
			fourTimes.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override public void handle(MouseEvent e) {
					multi(-1,200);
					timesFourActive=true;
					fourTimes.setVisible(false);
					scfalling(275, true);
				}
			});
			eightTimes.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override public void handle(MouseEvent e) {
					multi(-1,500);
					timesEightActive=true;	
					eightTimes.setVisible(false);
					scfalling(350, true);
				}
			});	
			
			//start counter
			root.getChildren().add(counter); 
			
			//start code from https://docs.oracle.com/javafx/2/ui_controls/button.htm
			clicker.setOnMousePressed(new EventHandler<MouseEvent>() {
				@Override public void handle(MouseEvent e) {
					//end code from https://docs.oracle.com/javafx/2/ui_controls/button.htm
			    	clicker.setGraphic(new ImageView(clickedcookie));
			    	clicker.setOnMouseReleased(new EventHandler<MouseEvent>() {
						@Override public void handle(MouseEvent e) {
							clicker.setGraphic(new ImageView(cookie));
						}
			    	});
					if (timesTwoActive==false){
						multi(0,0);
					}
					if (timesTwoActive == true) {
						twoTimes.setVisible(false);
						multi(1,0);
					}
					if (timesFourActive == true) {
						fourTimes.setVisible(false);
						multi(2,0);
					}
					if (timesEightActive == true) {
						eightTimes.setVisible(false);
						multi(3,0);
					}
					if((count>=100)&&(timesTwoActive==false)){
						twoTimes.setVisible(true);
					}	
					if((count>=200)&&(timesFourActive==false)){
						fourTimes.setVisible(true);
					}
					if((count>=500)&&(timesEightActive==false)){
						eightTimes.setVisible(true);	
					}
				}
			});
			String scount = String.valueOf(count);
			counter.setText("Cookies: " + scount);
			//end counter
			
			
			
			primaryStage.show();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void multi(int x, int y) {
		incr=0;
		if (x==-1) {
			incr = 0;
		}
		if (x==0) {
			incr=(int) Math.pow(2, x);
		}
		else {
			incr=(int) Math.pow(2, x);
		}
		decr=y; //100
		count = count + incr-decr; //100+0-100
		String scount = String.valueOf(count);
		counter.setText("Cookies: " + scount);
		score=String.valueOf(count);
	}
	private void scfalling(int x, Boolean tf) {
		Circle y = new Circle(25);
		y.setCenterX(25);
		y.setFill(new ImagePattern(smallCookieImage));
		y.setVisible(tf);
		root.getChildren().add(y);
		
		
		Path p = new Path();
		p.getElements().add(new MoveTo(x, -25));
		//start code from https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/CubicCurveTo.html
		p.getElements().add(new CubicCurveTo(x-50, 100, x+50, 300, x, 425));
		//end code from https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/CubicCurveTo.html
		PathTransition f = new PathTransition();
		f.setDuration(Duration.seconds(5)); //sets length it takes to animate
		f.setPath(p); //moves animation down
		//start code from https://docs.oracle.com/javafx/2/animations/basics.htm
		f.setCycleCount(Timeline.INDEFINITE);
		//end code from https://docs.oracle.com/javafx/2/animations/basics.htm
		f.setNode(y); //makes animation affect small cookies
		f.play();
		final PathTransition onClickf = f;
		final Circle onClicky=y;
		
		y.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				multi(6,0);		
				onClickf.stop();
				onClicky.setVisible(false);
			}
		});
	}
	private void reset()
	{
		count=0;
		String scount = String.valueOf(count);
		counter.setText("Cookies: " + scount);
		timesTwoActive = false;
		timesFourActive = false;
		timesEightActive = false;
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
}


/*Turning in 
 * move project to folder
 * compress to zip
 * name MWFLinseyStokes
 * */
