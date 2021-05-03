package application;

import javafx.scene.image.Image;

public class Multipliers {
	String name;
	String image;
	int Ypos;
	int Xpos;
	Boolean active;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String string) {
		this.image = string;
	}
	public int getYpos() {
		return Ypos;
	}
	public void setYpos(int ypos) {
		Ypos = ypos;
	}
	public int getXpos() {
		return Xpos;
	}
	public void setXpos(int xpos) {
		Xpos = xpos;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Multipliers() {
		// TODO Auto-generated constructor stub
	}

}
