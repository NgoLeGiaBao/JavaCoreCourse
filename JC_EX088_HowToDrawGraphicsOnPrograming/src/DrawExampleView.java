import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawExampleView extends JFrame {
	public DrawExampleView() {
		this.setTitle("Draw Graphic");
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPannelDraw jPannelDraw = new JPannelDraw();
		
		this.add(jPannelDraw, BorderLayout.CENTER);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new DrawExampleView();
	}
}
