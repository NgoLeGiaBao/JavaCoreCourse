package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;
public class CounterController implements ActionListener {
	private CounterView cv;
	public CounterController(CounterView cv) {
		this.cv = cv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("UP")) {
			this.cv.increasementValue();
		} else if (src.equals("DOWN")) {
			this.cv.decreasementValue();
		} else {
			this.cv.resetValue();
		}
		
	}

}
