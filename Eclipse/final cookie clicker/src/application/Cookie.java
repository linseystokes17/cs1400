package application;

import javafx.scene.image.Image;

public class Cookie {
	int size;
	int pos;
	Boolean active;
	Image image;
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	public Cookie(int size, int pos, Boolean active) {
		super();
		this.size = size;
		this.pos = pos;
		this.active = active;
	}

	public Cookie() {
		// TODO Auto-generated constructor stub
	}

}
