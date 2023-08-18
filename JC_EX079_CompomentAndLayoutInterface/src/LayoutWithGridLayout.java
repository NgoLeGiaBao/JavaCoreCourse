import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class LayoutWithGridLayout extends JFrame {
	public LayoutWithGridLayout () {
		this.setTitle("Layout with Gird Layout");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
		GridLayout gl1 = new GridLayout();
		GridLayout gl2 = new GridLayout(3,3);
		GridLayout gl3 = new GridLayout(3, 3, 100, 100);
		
//		this.setLayout(gl1);
//		this.setLayout(gl2);
		this.setLayout(gl3);
		
		for (int i = 1; i < 10; i++) {
			this.add(new Button(i+""));
		}
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new LayoutWithGridLayout();
	}
}
