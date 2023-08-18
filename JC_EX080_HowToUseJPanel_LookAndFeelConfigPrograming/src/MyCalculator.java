import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame{
	public MyCalculator () {
		this.setTitle("My Calculator");
		this.setLocationRelativeTo(null);
		this.setSize(300,300);
		
		JTextField jTF = new JTextField(300);
		JPanel jp_head = new JPanel(new BorderLayout());
		jp_head.add(jTF, BorderLayout.CENTER);
		
		
		
		JButton jbtn_0 = new JButton("0");
		JButton jbtn_1 = new JButton("1");
		JButton jbtn_2 = new JButton("2");
		JButton jbtn_3 = new JButton("3");
		JButton jbtn_4 = new JButton("4");
		JButton jbtn_5 = new JButton("5");
		JButton jbtn_6 = new JButton("6");
		JButton jbtn_7 = new JButton("7");
		JButton jbtn_8 = new JButton("8");
		JButton jbtn_9 = new JButton("9");
		JButton jbtn_add = new JButton("+");
		JButton jbtn_sub = new JButton("-");
		JButton jbtn_mul = new JButton("*");
		JButton jbtn_div = new JButton("/");
		JButton jbtn_equal = new JButton("=");
		
		JPanel jp_content = new JPanel(new GridLayout(3,5));
		jp_content.add(jbtn_0);
		jp_content.add(jbtn_1);
		jp_content.add(jbtn_2);
		jp_content.add(jbtn_3);
		jp_content.add(jbtn_4);
		jp_content.add(jbtn_5);
		jp_content.add(jbtn_6);
		jp_content.add(jbtn_7);
		jp_content.add(jbtn_8);
		jp_content.add(jbtn_9);
		jp_content.add(jbtn_add);
		jp_content.add(jbtn_sub);
		jp_content.add(jbtn_mul);
		jp_content.add(jbtn_div);
		jp_content.add(jbtn_equal);
		
		
//		this.setLayout(new FlowLayout());
//		this.setLayout(new GridLayout());
		this.setLayout(new BorderLayout());
		
		this.add(jp_head, BorderLayout.NORTH);
		this.add(jp_content, BorderLayout.CENTER);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
