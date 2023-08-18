package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorController;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {
	private MiniCalculatorModel miniCalculatorModel;
	private JPanel jPanelCalculate, jPanelButton;
	private JLabel jLabelFirst,jLabelSecond, jLabelAnswer;
	private JTextField jTextFieldFirst, jTextFieldSecond, jTextFieldAnswer;
	private JButton jButtonAdd, jButtonSub, jButtonMul, jButtonDiv, jButtonPow, jButtonMode;
	public MiniCalculatorView() {
		this.miniCalculatorModel =new MiniCalculatorModel();
		this.interfaceApp();
	}
	public void interfaceApp () {
		this.setTitle("MINI CALCULATOR");
		this.setSize(600, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set Font
		Font fontCalculate = new Font("Arial", Font.BOLD, 40);
		Font fontButton = new Font("Arial", Font.BOLD, 30);
		
		// Set action listener
		MiniCalculatorController ac = new MiniCalculatorController(this);
		
		// Set jpanel for calculate
		jLabelFirst = new JLabel("1st Value:", JLabel.CENTER);
		jLabelFirst.setFont(fontCalculate);
		jLabelSecond = new JLabel("2nd Value:",JLabel.CENTER);
		jLabelSecond.setFont(fontCalculate);
		jLabelAnswer = new JLabel("ASWER:",JLabel.CENTER);
		jLabelAnswer.setFont(fontCalculate);
		
		jTextFieldFirst = new JTextField();
		jTextFieldFirst.setFont(fontCalculate);
		jTextFieldSecond = new JTextField();
		jTextFieldSecond.setFont(fontCalculate);
		jTextFieldAnswer = new JTextField();
		jTextFieldAnswer.setFont(fontCalculate);
		
		jPanelCalculate = new JPanel();
		jPanelCalculate.setLayout(new GridLayout(3, 2, 10, 10));
		jPanelCalculate.add(jLabelFirst);
		jPanelCalculate.add(jTextFieldFirst);
		jPanelCalculate.add(jLabelSecond);
		jPanelCalculate.add(jTextFieldSecond);		
		jPanelCalculate.add(jLabelAnswer);
		jPanelCalculate.add(jTextFieldAnswer);
		
		// Set jpanel for button
		jButtonAdd = new JButton("+");
		jButtonAdd.setFont(fontButton);
		jButtonAdd.addActionListener(ac);

		jButtonSub = new JButton("-");
		jButtonSub.setFont(fontButton);
		jButtonSub.addActionListener(ac);
		
		jButtonMul = new JButton("*");
		jButtonMul.setFont(fontButton);
		jButtonMul.addActionListener(ac);
		
		jButtonDiv = new JButton("/");
		jButtonDiv.setFont(fontButton);
		jButtonDiv.addActionListener(ac);
		
		jButtonPow = new JButton("^");
		jButtonPow.setFont(fontButton);
		jButtonPow.addActionListener(ac);
		
		jButtonMode = new JButton("%");
		jButtonMode.setFont(fontButton);
		jButtonMode.addActionListener(ac);
		
		jPanelButton = new JPanel();
		jPanelButton.setLayout(new GridLayout(2,3,10,10));
		jPanelButton.add(jButtonAdd);
		jPanelButton.add(jButtonSub);
		jPanelButton.add(jButtonMul);
		jPanelButton.add(jButtonDiv);
		jPanelButton.add(jButtonPow);
		jPanelButton.add(jButtonMode);
		

		this.setLayout(new BorderLayout(20,20));
		this.add(jPanelCalculate, BorderLayout.CENTER);
		this.add(jPanelButton, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public void getValueFromJTextField () {
		double firstValue = Double.valueOf(jTextFieldFirst.getText());
		double secondValue = Double.valueOf(jTextFieldSecond.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
	}
	public void showResult (String s) {
		this.getValueFromJTextField();
		if (s.equals("+")) {
			this.miniCalculatorModel.setAdd();
		} else if (s.equals("-")) {
			this.miniCalculatorModel.setSub();;
		} else if (s.equals("*")) {
			this.miniCalculatorModel.setMul();
		} else if (s.equals("/")) {
			this.miniCalculatorModel.setDiv();
		} else if (s.equals("^")) {
			this.miniCalculatorModel.setPow();
		} else if (s.equals("%")) {
			this.miniCalculatorModel.setMode();
		} 
		this.jTextFieldAnswer.setText(this.miniCalculatorModel.getResult()+"");	}
}
