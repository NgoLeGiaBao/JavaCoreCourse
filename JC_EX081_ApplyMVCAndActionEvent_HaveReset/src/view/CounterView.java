package view;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterController;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JLabel jLabel;
	public CounterView() {
		this.counterModel = new CounterModel();
		this.initInterface();
	}
	public void initInterface () {
		
		this.setTitle("Counter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		

		jLabel = new JLabel(this.counterModel.getValue()+"",JLabel.CENTER);
		
		ActionListener ac = new CounterController(this);
		
		JButton jButtonUp = new JButton("UP");
		jButtonUp.addActionListener(ac);
		
		JButton jButtonDown = new JButton("DOWN");
		jButtonDown.addActionListener(ac);
		
		JButton jButtonReset = new JButton("RESET");
		jButtonReset.addActionListener(ac);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButtonUp, BorderLayout.WEST);
		jPanel.add(jLabel, BorderLayout.CENTER);
		jPanel.add(jButtonDown, BorderLayout.EAST);
		jPanel.add(jButtonReset, BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
		

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void increasementValue () {
		this.counterModel.increasement();
		this.jLabel.setText(this.counterModel.getValue()+"");
	}
	public void decreasementValue () {
		if (this.counterModel.getValue() == 0) {
			this.counterModel.setValue(0);
		} else {
			this.counterModel.descreasement();
		}
		this.jLabel.setText(this.counterModel.getValue()+"");
	}
	public void resetValue () {
		this.counterModel.reset();;
		this.jLabel.setText(this.counterModel.getValue()+"");
	}

}

