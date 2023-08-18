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
		String mainDishes = this.menuView.getjComboBoxMainDishes().getSelectedItem().toString();
		String sideDishes = "";
		Object [] sideDishesList = this.menuView.getjListSideDishes().getSelectedValues();
		for (Object sideDish: sideDishesList) {
			sideDishes += sideDish.toString() + ";";
		}
		this.menuView.getMenuModel().setMainDishes(mainDishes);
		this.menuView.getMenuModel().setSideDishes(sideDishes);
		this.menuView.payment();
	}
	
}
