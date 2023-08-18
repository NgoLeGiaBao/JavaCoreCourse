package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.MenuController;
import model.MenuModel;

public class MenuView extends JFrame {
	private MenuModel menuModel;
	private JLabel jLabelNorth;
	private JPanel jPanelCenter;
	private JPanel jPanelMainDishes;
	private JLabel jLabelMainDishesTitle;
	private JPanel jPanelListMainDishes;
	private JRadioButton jRadioButtonRice;
	private JRadioButton jRadioButtonPho;
	private JRadioButton jRadioButtonBread;
	private JPanel jPanelSideDishes;
	private JLabel jLabelSideDishesTitle;
	private JPanel jPanelListSideDishes;
	private JCheckBox jCheckMilkTea;
	private JCheckBox jCheckCocacola;
	private JCheckBox jCheckBoxCake;
	private JCheckBox jCheckBoxNem;
	private JLabel jLabelTotal;
	private JPanel jPanelSouth;
	private JButton jButtonPay;
	private JList<String> jListSideDishes;
	private JComboBox<String> jComboBoxMainDishes;
	
	public MenuView() {
		this.menuModel = new MenuModel();
		this.initialInterface();
	}
	public MenuModel getMenuModel() {
		return menuModel;
	}
	public void setMenuModel(MenuModel menuModel) {
		this.menuModel = menuModel;
	}
	public JLabel getjLabelNorth() {
		return jLabelNorth;
	}
	public void setjLabelNorth(JLabel jLabelNorth) {
		this.jLabelNorth = jLabelNorth;
	}
	public JPanel getjPanelCenter() {
		return jPanelCenter;
	}
	public void setjPanelCenter(JPanel jPanelCenter) {
		this.jPanelCenter = jPanelCenter;
	}
	public JPanel getjPanelMainDishes() {
		return jPanelMainDishes;
	}
	public void setjPanelMainDishes(JPanel jPanelMainDishes) {
		this.jPanelMainDishes = jPanelMainDishes;
	}
	public JLabel getjLabelMainDishesTitle() {
		return jLabelMainDishesTitle;
	}
	public void setjLabelMainDishesTitle(JLabel jLabelMainDishesTitle) {
		this.jLabelMainDishesTitle = jLabelMainDishesTitle;
	}
	public JPanel getjPanelListMainDishes() {
		return jPanelListMainDishes;
	}
	public void setjPanelListMainDishes(JPanel jPanelListMainDishes) {
		this.jPanelListMainDishes = jPanelListMainDishes;
	}
	public JRadioButton getjRadioButtonRice() {
		return jRadioButtonRice;
	}
	public void setjRadioButtonRice(JRadioButton jRadioButtonRice) {
		this.jRadioButtonRice = jRadioButtonRice;
	}
	public JRadioButton getjRadioButtonPho() {
		return jRadioButtonPho;
	}
	public void setjRadioButtonPho(JRadioButton jRadioButtonPho) {
		this.jRadioButtonPho = jRadioButtonPho;
	}
	public JRadioButton getjRadioButtonBread() {
		return jRadioButtonBread;
	}
	public void setjRadioButtonBread(JRadioButton jRadioButtonBread) {
		this.jRadioButtonBread = jRadioButtonBread;
	}
	public JPanel getjPanelSideDishes() {
		return jPanelSideDishes;
	}
	public void setjPanelSideDishes(JPanel jPanelSideDishes) {
		this.jPanelSideDishes = jPanelSideDishes;
	}
	public JLabel getjLabelSideDishesTitle() {
		return jLabelSideDishesTitle;
	}
	public void setjLabelSideDishesTitle(JLabel jLabelSideDishesTitle) {
		this.jLabelSideDishesTitle = jLabelSideDishesTitle;
	}
	public JPanel getjPanelListSideDishes() {
		return jPanelListSideDishes;
	}
	public void setjPanelListSideDishes(JPanel jPanelListSideDishes) {
		this.jPanelListSideDishes = jPanelListSideDishes;
	}
	public JCheckBox getjCheckMilkTea() {
		return jCheckMilkTea;
	}
	public void setjCheckMilkTea(JCheckBox jCheckMilkTea) {
		this.jCheckMilkTea = jCheckMilkTea;
	}
	public JCheckBox getjCheckCocacola() {
		return jCheckCocacola;
	}
	public void setjCheckCocacola(JCheckBox jCheckCocacola) {
		this.jCheckCocacola = jCheckCocacola;
	}
	public JCheckBox getjCheckBoxCake() {
		return jCheckBoxCake;
	}
	public void setjCheckBoxCake(JCheckBox jCheckBoxCake) {
		this.jCheckBoxCake = jCheckBoxCake;
	}
	public JCheckBox getjCheckBoxNem() {
		return jCheckBoxNem;
	}
	public void setjCheckBoxNem(JCheckBox jCheckBoxNem) {
		this.jCheckBoxNem = jCheckBoxNem;
	}
	public JLabel getjLabelTotal() {
		return jLabelTotal;
	}
	public void setjLabelTotal(JLabel jLabelTotal) {
		this.jLabelTotal = jLabelTotal;
	}
	public JPanel getjPanelSouth() {
		return jPanelSouth;
	}
	public void setjPanelSouth(JPanel jPanelSouth) {
		this.jPanelSouth = jPanelSouth;
	}
	public JButton getjButtonPay() {
		return jButtonPay;
	}
	public void setjButtonPay(JButton jButtonPay) {
		this.jButtonPay = jButtonPay;
	}
	public JList<String> getjListSideDishes() {
		return jListSideDishes;
	}
	public void setjListSideDishes(JList<String> jListSideDishes) {
		this.jListSideDishes = jListSideDishes;
	}
	public JComboBox<String> getjComboBoxMainDishes() {
		return jComboBoxMainDishes;
	}
	public void setjComboBoxMainDishes(JComboBox<String> jComboBoxMainDishes) {
		this.jComboBoxMainDishes = jComboBoxMainDishes;
	}
	public void initialInterface () {
		this.setTitle("Menu");
		this.setSize(1000,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Action Lister
		MenuController menuController = new MenuController(this);
		
		// SetFont
		Font fontBig = new Font("Arial", Font.BOLD, 60);
		Font fontAverage = new Font("Arial", Font.BOLD, 40);
		Font fontSmall = new Font("Arial", Font.BOLD, 30);
		Font fontSmaller = new Font("Arial", Font.BOLD, 15);
		
		// North
		jLabelNorth = new JLabel("MANDARINE RESTAURANT 'S MENU", JLabel.CENTER);
		jLabelNorth.setFont(fontBig);
		jLabelNorth.setForeground(Color.RED);
		
		// Center
		jPanelCenter = new JPanel();
		
		// Main dishes
		jPanelMainDishes = new JPanel();
		
		jLabelMainDishesTitle = new JLabel("MAIN DISHES IN RESTAURANT'S MENU", JLabel.CENTER);
		jLabelMainDishesTitle.setFont(fontAverage);
		jLabelMainDishesTitle.setForeground(Color.YELLOW);
		
		jPanelListMainDishes = new JPanel(new GridLayout(1,3));
		jRadioButtonRice = new JRadioButton("RICE");
		jRadioButtonRice.setFont(fontBig);
		jRadioButtonPho = new JRadioButton("PHO");
		jRadioButtonPho.setFont(fontBig);
		jRadioButtonBread = new JRadioButton("BREAD");
		jRadioButtonBread.setFont(fontBig);
		
		// JComboBox
		/*
		 * - JComboBox được dùng để tạo ra một danh sách gồm giá trị, nhưng mỗi lần chỉ lấy được
		 * một giá trị từ danh sách đó
		 * - Ví dụ: danh sách gồm nhiều món ăn của nhà hàng không thể liệt kê ra hết, thì cần sử
		 * dụng tới JComboBox
		 */
		jComboBoxMainDishes = new JComboBox<String>();
		jComboBoxMainDishes.addItem(jRadioButtonRice.getText());
		jComboBoxMainDishes.addItem(jRadioButtonPho.getText());
		jComboBoxMainDishes.addItem(jRadioButtonBread.getText());
		

		jPanelMainDishes.setLayout(new GridLayout(2,1));
		jPanelMainDishes.add(jLabelMainDishesTitle);
		jPanelMainDishes.add(jComboBoxMainDishes);
		
		// Side dishes
		jPanelSideDishes = new JPanel();
		
		jLabelSideDishesTitle = new JLabel("SIDE DISHES IN RESTAURANT'S MENU", JLabel.CENTER);
		jLabelSideDishesTitle.setFont(fontAverage);
		jLabelSideDishesTitle.setForeground(Color.YELLOW);
		
		jPanelListSideDishes = new JPanel(new GridLayout(2,2,30,30));
		
		jCheckMilkTea = new JCheckBox("MILK TEA");
		jCheckMilkTea.setFont(fontSmall);
		
		jCheckCocacola = new JCheckBox("COCACOLA");
		jCheckCocacola.setFont(fontSmall);
		
		jCheckBoxCake = new JCheckBox("CAKE");
		jCheckBoxCake.setFont(fontSmall);
		
		jCheckBoxNem = new JCheckBox("NEM");
		jCheckBoxNem.setFont(fontSmall);
		
		// JList
		/*
		 * - JList được dùng để tạo ra một danh sách gồm giá trị, có thể lấy ra được nhiều giá trị từ danh sách đó
		 * - Ví dụ: danh sách gồm nhiều món ăn của nhà hàng không thể liệt kê ra hết, thì cần sử
		 * dụng tới JList
		 */
		String [] listSidesDishes = {jCheckMilkTea.getText(), jCheckCocacola.getText(), jCheckBoxCake.getText(), jCheckBoxNem.getText()};
		jListSideDishes = new JList<String>(listSidesDishes);
		
		
		jPanelSideDishes.setLayout(new GridLayout(2,1));
		jPanelSideDishes.add(jLabelSideDishesTitle);
		jPanelSideDishes.add(jListSideDishes);
		
		jPanelCenter.setLayout(new GridLayout(2,1));
		jPanelCenter.add(jPanelMainDishes);
		jPanelCenter.add(jPanelSideDishes);
		
		// South
		jPanelSouth = new JPanel(new GridLayout(1,2));
		jLabelTotal = new JLabel("",JLabel.CENTER);
		jLabelTotal.setFont(fontSmaller);
		jButtonPay = new JButton("PAYMENT");
		jButtonPay.setFont(fontSmall);
		jButtonPay.addActionListener(menuController);
		jPanelSouth.add(jLabelTotal);
		jPanelSouth.add(jButtonPay);
		
		// Main Layout
		this.add(jLabelNorth, BorderLayout.NORTH);
		this.add(jPanelCenter,BorderLayout.CENTER);
		this.add(jPanelSouth, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public void payment () {
		this.menuModel.setTotal();
		this.jLabelTotal.setText(this.menuModel.getMainDishes() + "-" + this.menuModel.getSideDishes() + this.menuModel.getTotal());
	}
}
