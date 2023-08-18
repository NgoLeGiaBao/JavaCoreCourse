package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;

import view.MenuView;

public class MenuController implements ActionListener {
	private MenuView menuView;
	
	public MenuController(MenuView menuView) {
		this.menuView = menuView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String mainDishes = "";
		String sideDishes = "";
		Enumeration buttonMainDishes = this.menuView.getButtonGroupMainDishes().getElements();
		while (buttonMainDishes.hasMoreElements()) {
			AbstractButton abstractButton = (AbstractButton)buttonMainDishes.nextElement();
			if (abstractButton.isSelected()) {
				mainDishes = abstractButton.getText();
			}
		}
		for(AbstractButton abstractButton : this.menuView.getArrayListSideDishes()) {
			if (abstractButton.isSelected()) {
				sideDishes = sideDishes + abstractButton.getText() + ";";
			}
		}
		this.menuView.getMenuModel().setMainDishes(mainDishes);
		this.menuView.getMenuModel().setSideDishes(sideDishes);
		if (e.getActionCommand().equals("PAYMENT")) {
			this.menuView.payment();
		}
		
	}
	
}
