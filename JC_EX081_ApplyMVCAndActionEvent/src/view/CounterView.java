package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterController;
import model.CounterModel;

public class CounterView extends JFrame {
	private JButton btnUp, btnDown;
	private JPanel jpLayout;
	private JLabel jlValue;
	private CounterModel counterModel;
	public CounterView () {
		this.counterModel = new CounterModel();
		this.initInterface();
	}
	
	public void initInterface () {
		this.setTitle("Number counter");
		this.setLocationRelativeTo(null);
		this.setSize(400, 400);
		
		CounterController ac = new CounterController(this);
		
		JButton btnUp = new JButton("UP");
		btnUp.addActionListener(ac);
		
		JButton btnDown = new JButton("DOWN");
		btnDown.addActionListener(ac);
		
		jlValue = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);
		
		JPanel jpLayout = new JPanel(new BorderLayout());
		jpLayout.add(btnUp, BorderLayout.WEST);
		jpLayout.add(jlValue, BorderLayout.CENTER);
		jpLayout.add(btnDown, BorderLayout.EAST);
		
		this.add(jpLayout, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public void increasementValue () {
		this.counterModel.increaseValue();
		this.jlValue.setText(this.counterModel.getValue()+"");
	}
	public void decreasementValue () {
		this.counterModel.decreaseValue();
		this.jlValue.setText(this.counterModel.getValue()+"");
	}
}
