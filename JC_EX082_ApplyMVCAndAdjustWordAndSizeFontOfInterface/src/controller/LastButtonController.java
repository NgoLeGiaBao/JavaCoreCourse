package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;

public class LastButtonController implements ActionListener {
	private LastButtonView lastButtonView;
	public LastButtonController(LastButtonView lastButtonView) {
		this.lastButtonView = lastButtonView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("1")) {
			this.lastButtonView.setValueBtn1();
		} else if (src.equals("2")) {
			this.lastButtonView.setValueBtn2();
		}else if (src.equals("3")) {
			this.lastButtonView.setValueBtn3();
		}else if (src.equals("4")) {
			this.lastButtonView.setValueBtn4();
		}
		
	}
	
}
