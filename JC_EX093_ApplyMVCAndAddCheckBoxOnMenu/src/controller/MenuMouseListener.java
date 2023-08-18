package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;

import view.MenuBarView;

public class MenuMouseListener implements MouseListener {
	private MenuBarView menuBarView;
	
	public MenuMouseListener(MenuBarView menuBarView) {
		this.menuBarView = menuBarView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		AbstractButton abstractButton = (AbstractButton)e.getSource();
		if (abstractButton.getText().equals("Edit")) {
			this.menuBarView.showMenuItem("Chuootj");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.isPopupTrigger()) {
			this.menuBarView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
