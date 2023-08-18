package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FindKeyWordView;

public class FindKeyWordController implements ActionListener {
	private FindKeyWordView findKeyWordView;
	
	public FindKeyWordController(FindKeyWordView findKeyWordView) {
		this.findKeyWordView = findKeyWordView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.findKeyWordView.showResult();
	}
}
