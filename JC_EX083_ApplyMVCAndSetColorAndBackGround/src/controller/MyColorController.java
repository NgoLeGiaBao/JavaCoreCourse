package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorController implements ActionListener {
	private MyColorView myColorView;
	
	public MyColorController(MyColorView myColorView) {
		this.myColorView = myColorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("GREEN LETTER")) {
			this.myColorView.changeLetterColor(Color.GREEN);
			
		} else if (src.equals("RED LETTER")) {
			this.myColorView.changeLetterColor(Color.RED);
		} else if (src.equals("YELLOW LETTER")) {
			this.myColorView.changeLetterColor(Color.YELLOW);
		} else if (src.equals("GREEN BACKGROUND")) {
			this.myColorView.changeBackgroundColor(Color.GREEN);
		} else if (src.equals("RED BACKGROUND")) {
			this.myColorView.changeBackgroundColor(Color.RED);
		} else if (src.equals("YELLOW BACKGROUND")) {
			this.myColorView.changeBackgroundColor(Color.YELLOW);
		}
		
	}
	
	
}
