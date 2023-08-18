package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

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
		
		// JOptionPane
		/* - JOptionPane dùng để hiển thi ra một cửa số thông báo trong chương trình
		 * - Ví dụ: thông báo số tiền cần dư của khách hành
		 */
		String customerPayText = (String)JOptionPane.showInputDialog(this.menuView, this.menuView.getjLabelTotal().getText() + "\n Enter money custom takes","Message", JOptionPane.PLAIN_MESSAGE);
		try {
			int customberPay = Integer.valueOf(customerPayText);
			int exchange = customberPay - this.menuView.getMenuModel().getTotal();
			if (exchange < 0) {
				JOptionPane.showMessageDialog(this.menuView, "Money is not enough", "Infor", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this.menuView, "Your exchange is: "+exchange, "Infor", JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this.menuView, "Data is wrong","Error",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
