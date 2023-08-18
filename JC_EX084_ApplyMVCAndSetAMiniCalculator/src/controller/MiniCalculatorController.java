package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCalculatorView;

public class MiniCalculatorController implements ActionListener {
	private MiniCalculatorView miniCalculatorView;
	
	public MiniCalculatorController(MiniCalculatorView miniCalculatorView) {
		this.miniCalculatorView = miniCalculatorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		this.miniCalculatorView.showResult(src);
		
	}
	
}
