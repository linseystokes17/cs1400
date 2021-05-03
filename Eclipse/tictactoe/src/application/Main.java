package application;
	

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	Button [] buttons;
	Image xImage;
	Image oImage;
	Image blankImage;
	ImageView xView;
	ImageView oView;
	ImageView blankView;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,360,360);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			xImage = new Image("X.png");
			oImage = new Image ("O.png");
			blankImage = new Image("blank.png");
			blankView = new ImageView(blankImage);
			xView= new ImageView(xImage);
			oView= new ImageView(oImage);
			
			buttons = new Button[9];
			for (int x = 0; x<3; x++) {
				for (int y=0; y<3; y++) {
					buttons[x*3 + y] = new Button();
					root.add(buttons[x*3+y],y,x);
					buttons[x*3+y].setPrefHeight(120);
					buttons[x*3+y].setPrefWidth(120);
					buttons[x*3+y].setGraphic(new ImageView(blankImage));
					buttons[x*3+y].setOnAction(new EventHandler<ActionEvent>(){
						public void handle (ActionEvent e)
						{
							Button clickedButton = (Button) e.getSource();
							if(((ImageView)clickedButton.getGraphic()).getImage().equals(blankView.getImage())) {
								clickedButton.setGraphic(new ImageView(xImage));
								if (checkWin(xView)) {
									Alert alert = new Alert(AlertType.INFORMATION);
									alert.setTitle("Winner");
									alert.setContentText("Congratulations, X won!");
									alert.show();
									reset();
								}
								for (int z=0; z<buttons.length;z++) {
									if (((ImageView)buttons[z].getGraphic()).getImage().equals(blankView.getImage())) {
										buttons[z].setGraphic(new ImageView(oImage));
										if (checkWin(oView)) {
											Alert alert = new Alert(AlertType.INFORMATION);
											alert.setTitle("Sorry");
											alert.setContentText("Unfortunately, O won!");
											alert.show();
											reset();
										}
										return;
										}
								
								}
							}
						}

						});
				}
			}

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void reset() {
		// TODO Auto-generated method stub
		for (int i=0;i<buttons.length; i++) {
			buttons[i].setGraphic(new ImageView(blankImage));
		}
	}
	
	public boolean checkWin(ImageView player) {
		int[][] wins = {{0,1,2},{3,4,5},{6,7,8},{0,4,8},{0,3,6},{1,4,7},{2,5,8},{2,5,8}};
		
		for (int i= 0; i<8;i++) {
			if (((ImageView)buttons[wins[i][0]].getGraphic()).getImage().equals(player.getImage()) && 
				((ImageView)buttons[wins[i][1]].getGraphic()).getImage().equals(player.getImage()) &&
				((ImageView)buttons[wins[i][2]].getGraphic()).getImage().equals(player.getImage())) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
