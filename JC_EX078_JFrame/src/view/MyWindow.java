package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow () {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void showMyWindow () {
//		this.setVisible(true);
	}
	public void showMyWindow (String title) {
//		this.setVisible(true);
		this.setTitle(title);
	}
	public void showMyWindow (String title, int width, int heigth) {
//		this.setVisible(true);
		this.setTitle(title);
		this.setSize(width, heigth);
	}
	public void showMyWindow (int horizontal, int vertical, String title) {
//		this.setVisible(true);
		this.setTitle(title);
		this.setLocation(horizontal, vertical);
	}
	
	public static void main(String[] args) {
		MyWindow mw1 = new MyWindow();
		MyWindow mw2 = new MyWindow();
		MyWindow mw3 = new MyWindow();
		MyWindow mw4 = new MyWindow();
		
		mw1.showMyWindow();
		mw2.showMyWindow("My Window 2");
		mw3.showMyWindow("My Window 3", 500, 500);
		mw4.showMyWindow(200, 200, "My Window 4");
	}
}
