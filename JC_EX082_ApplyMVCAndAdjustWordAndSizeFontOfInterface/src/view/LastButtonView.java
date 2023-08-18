package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.LastButtonController;
import model.LastButtonModel;

public class LastButtonView extends JFrame {
	private LastButtonModel lastButtonModel;
	private JPanel jp_grid;
	private JLabel jp_label;
	private JButton jb_btn1;
	private JButton jb_btn2;
	private JButton jb_btn3;
	private JButton jb_btn4;
	
	public LastButtonView () {
		this.lastButtonModel = new LastButtonModel();
		this.initialInterfave();
	}
	
	public void initialInterfave () {
		Font ft = new Font("Arial", Font.BOLD, 40);
		ActionListener ac = new LastButtonController(this);
		
		this.setTitle("Last Button");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		
		
		jp_grid = new JPanel(new GridLayout(2, 2));
		jp_label = new JLabel("Let's press button",JLabel.CENTER);
		jp_label.setFont(ft);
		
		
		jb_btn1 = new JButton("1");
		jb_btn1.addActionListener(ac);
		jb_btn1.setFont(ft);
		
		jb_btn2 = new JButton("2");
		jb_btn2.addActionListener(ac);
		jb_btn2.setFont(ft);
		
		jb_btn3 = new JButton("3");
		jb_btn3.addActionListener(ac);
		jb_btn3.setFont(ft);
		
		jb_btn4 = new JButton("4");
		jb_btn4.addActionListener(ac);
		jb_btn4.setFont(ft);
		
		
		jp_grid.add(jb_btn1);
		jp_grid.add(jb_btn2);
		jp_grid.add(jb_btn3);
		jp_grid.add(jb_btn4);
		
		this.add(jp_grid,BorderLayout.CENTER);
		this.add(jp_label,BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void setValueBtn1 () {
		this.lastButtonModel.setValue_1();
		this.jp_label.setText("Last button pushed was no: " + this.lastButtonModel.getValue());
	}
	public void setValueBtn2 () {
		this.lastButtonModel.setValue_2();
		this.jp_label.setText("Last button pushed was no: " + this.lastButtonModel.getValue());
	}
	public void setValueBtn3 () {
		this.lastButtonModel.setValue_3();
		this.jp_label.setText("Last button pushed was no: " + this.lastButtonModel.getValue());
	}
	public void setValueBtn4 () {
		this.lastButtonModel.setValue_4();
		jp_label.setText("Last button pushed was no: " + this.lastButtonModel.getValue());
	}
}
