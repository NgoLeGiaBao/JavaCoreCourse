package model;

import java.awt.Color;

public class MyColorModel {
	private Color letterColor;
	private Color backgroundColor;
	private boolean opaque;
	
	public MyColorModel() {
		this.letterColor = Color.BLACK;
		this.backgroundColor = Color.WHITE;
	}

	public Color getLetterColor() {
		return letterColor;
	}

	public void setLetterColor(Color letterColor) {
		this.letterColor = letterColor;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public boolean isOpaque() {
		return opaque;
	}

	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
	
}
