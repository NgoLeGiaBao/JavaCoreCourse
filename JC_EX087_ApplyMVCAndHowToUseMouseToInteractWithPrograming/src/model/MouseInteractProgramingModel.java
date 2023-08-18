package model;

public class MouseInteractProgramingModel {
	private int x, y, countClick;
	private String isInComponent;
	
	public MouseInteractProgramingModel() {
		this.x = -1;
		this.y = -1;
		this.countClick = 0;
		this.isInComponent = "No";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getIsInComponent() {
		return isInComponent;
	}

	public void setIsInComponent(String isInComponent) {
		this.isInComponent = isInComponent;
	}

	public int getCountClick() {
		return countClick;
	}

	public void setCountClick() {
		this.countClick++;
	}
	
	
}
