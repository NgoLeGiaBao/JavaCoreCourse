package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

import view.MenuBarView;

public class MenuBarController implements ActionListener {
	private MenuBarView menuBarView;
	
	public MenuBarController(MenuBarView menuBarView) {
		this.menuBarView = menuBarView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
//		String srcUpperCase = src.toUpperCase();
//		System.out.print("Hello");
//		if (src.equals("Recent File")) {
//			this.menuBarView.showMenuItem(srcUpperCase);
//		} else if (src.equals("Switch Workspace")) {
//			this.menuBarView.showMenuItem(srcUpperCase);
//		} else if (src.equals("File")) {
//			this.menuBarView.showMenuItem(srcUpperCase);
//		}
//		this.menuBarView.showMenuItem(e.getActionCommand().toUpperCase());
//		AbstractButton abstractButton = (AbstractButton)e.getSource();
//		boolean check = abstractButton.getModel().isSelected();
//		if (check) {
//			this.menuBarView.showMenuItem(e.getActionCommand().toUpperCase());
//		} else {
//			this.menuBarView.showMenuItem("HHHH");
//		}
		if (src.equals("Toolbar")) {
			AbstractButton abstractButton = (AbstractButton)e.getSource();
			boolean check = abstractButton.getModel().isSelected();
			if (check) {
				this.menuBarView.enableToolbar();
				this.menuBarView.showMenuItem(src.toUpperCase());
			} else {
				this.menuBarView.disenableToolbar();
				this.menuBarView.showMenuItem(src);
			}
		} else {
			this.menuBarView.showMenuItem(e.getActionCommand().toUpperCase());
		}
	}
	
	
}
