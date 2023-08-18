import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class LayoutWithFlowLayout extends JFrame{
	public LayoutWithFlowLayout () {
		
		this.setTitle("Layout with Flow Layout");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null); // Giúp căn giữa được giao diện
		
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		
		FlowLayout fl1 = new FlowLayout();
		FlowLayout fl2 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout fl3 = new FlowLayout(FlowLayout.CENTER, 10, 50);
		
//		this.setLayout(fl1);
//		this.setLayout(fl2);
		this.setLayout(fl3);
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new LayoutWithFlowLayout();
	}
}
