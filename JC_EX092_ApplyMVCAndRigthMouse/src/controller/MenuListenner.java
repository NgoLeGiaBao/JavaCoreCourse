package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuListener;

import view.MenuBarView;

public class MenuListenner implements MenuListener {
	private MenuBarView menuBarView;
	
	public MenuListenner(MenuBarView menuBarView) {
		this.menuBarView = menuBarView;
	}

	@Override
	public void menuSelected(MenuEvent e) {
		String s = this.menuBarView.jMenuFile.getText().toUpperCase();
		String s1 = this.menuBarView.jMenuEdit.getText().toUpperCase();
		if (s.equals("FILE")) {
			this.menuBarView.showMenuItem(s);
		} else if (s1.equals("EDIT")) {
			this.menuBarView.showMenuItem(s1);
		}		
	}

	@Override
	public void menuDeselected(MenuEvent e) {
	}

	@Override
	public void menuCanceled(MenuEvent e) {

	}



	
	
	
	
}
