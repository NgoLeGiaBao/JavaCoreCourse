package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorController;
import model.MyColorModel;

public class MyColorView extends JFrame{
	private MyColorModel myColorModel;
	private JLabel jLabel;
	private JPanel jPanel;
	private JButton jButtonRedLetter,jButtonYellowLetter,jButtonGreenLetter, jButtonRedBackground, jButtonYelloBackground, jButtonGreenBackGround;
	public MyColorView() {
		this.myColorModel = new MyColorModel();
		this.initialInterface();
	}
	
	public void initialInterface () {
		this.setTitle("My Color Interface");
		this.setSize(600, 800);
		this.setLocationRelativeTo(null);
		
		Font fontLabel = new Font("Arial", Font.BOLD, 20);
		Font fontButton = new Font("Arial", Font.BOLD, 30);
		
		MyColorController ac = new MyColorController(this);
		
		jLabel = new JLabel("SHOW COLOR LETTER AND BACKGROUND", JLabel.CENTER);
		jLabel.setFont(fontLabel);
		
		jPanel = new JPanel(new GridLayout(2,3));
		
		jButtonGreenLetter = new JButton("GREEN LETTER");
		jButtonGreenLetter.setForeground(Color.GREEN);
		jButtonGreenLetter.addActionListener(ac);
		
		jButtonRedLetter = new JButton("RED LETTER");
		jButtonRedLetter.setForeground(Color.RED);
		jButtonRedLetter.addActionListener(ac);
		
		jButtonYellowLetter = new JButton("YELLOW LETTER");
		jButtonYellowLetter.setForeground(Color.YELLOW);
		jButtonYellowLetter.addActionListener(ac);
		
		jButtonGreenBackGround= new JButton("GREEN BACKGROUND");
		jButtonGreenBackGround.setBackground(Color.GREEN);
		jButtonGreenBackGround.addActionListener(ac);
		
		jButtonRedBackground = new JButton("RED BACKGROUND");
		jButtonRedBackground.setBackground(Color.RED);
		jButtonRedBackground.addActionListener(ac);
		
		jButtonYelloBackground = new JButton("YELLOW BACKGROUND");
		jButtonYelloBackground.setBackground(Color.YELLOW);
		jButtonYelloBackground.addActionListener(ac);
		
		jPanel.add(jButtonGreenLetter);
		jPanel.add(jButtonRedLetter);
		jPanel.add(jButtonYellowLetter);
		jPanel.add(jButtonGreenBackGround);
		jPanel.add(jButtonRedBackground);
		jPanel.add(jButtonYelloBackground);
		
		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void changeLetterColor (Color color) {
		this.myColorModel.setLetterColor(color);
		if (color.equals(this.myColorModel.getBackgroundColor())) {
			this.jLabel.setForeground(Color.BLACK);
		} else {
			this.jLabel.setForeground(color);
		}
		
	}
	public void changeBackgroundColor (Color color) {
		this.myColorModel.setBackgroundColor(color);
		if (color.equals(this.myColorModel.getLetterColor())) {
			this.jLabel.setBackground(Color.WHITE);
		} else {
			this.jLabel.setBackground(color);
		}
		this.jLabel.setOpaque(true);
	}
}
