package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.event.MenuKeyListener;

import controller.MenuBarController;
import controller.MenuListenner;

public class MenuBarView extends JFrame {
	private JLabel jLabel;
	public JMenu jMenuFile,jMenuEdit;
	public MenuBarView() {
		this.initialInterface();
	}
	public void initialInterface () {
		this.setTitle("CREATE MENU BAR");
		this.setSize(1000,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Font
		Font fontLetterSmall = new Font("Arial", Font.PLAIN, 15);
		Font fontLetterBig = new Font("Arial", Font.BOLD, 40);
		
		// Action Listerner
		MenuBarController menuBarController = new MenuBarController(this);
		MenuListenner menuListenner = new MenuListenner(this);
		JMenuBar jMenuBar = new JMenuBar();
		
		// File
		jMenuFile = new JMenu("File");
		jMenuFile.setFont(fontLetterSmall);
		jMenuFile.setMnemonic(KeyEvent.VK_F);
		jMenuFile.addMenuListener(menuListenner);
		jMenuFile.setDisplayedMnemonicIndex(0);
		
		
		JMenuItem jMenuRecentFile = new JMenuItem("Recent File", KeyEvent.VK_R);
		jMenuRecentFile.setFont(fontLetterSmall);
		jMenuRecentFile.addActionListener(menuBarController);
		jMenuRecentFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem jMenuSwitch = new JMenuItem("Switch Workspace", KeyEvent.VK_S);
		
		jMenuSwitch.setFont(fontLetterSmall);
		jMenuSwitch.addActionListener(menuBarController);
		jMenuSwitch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		
		jMenuFile.add(jMenuRecentFile);
		jMenuFile.add(jMenuSwitch);
		
		// Edit
		jMenuEdit = new JMenu("Edit");
		jMenuEdit.setFont(fontLetterSmall);
		jMenuEdit.setMnemonic(KeyEvent.VK_E);
		jMenuEdit.addMenuListener(menuListenner);
		
		JMenuItem jMenuItemUndo = new JMenuItem("Undo Typing", KeyEvent.VK_U);
		jMenuItemUndo.setFont(fontLetterSmall);
		jMenuItemUndo.addActionListener(menuBarController);
		jMenuItemUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_DOWN_MASK));
		
		
		// Muốn sử dụng được Mnemonic thì phải vào được menu của nó thì mới gọi được nó 
		//	jMenuItemUndo.setMnemonic(KeyEvent.VK_U);
		//	jMenuItemUndo.setDisplayedMnemonicIndex(0);
		
		jMenuEdit.add(jMenuItemUndo);
		
		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuEdit);
		
		this.setJMenuBar(jMenuBar);

		
		jLabel = new JLabel("Let click on a any menu item on menu bar", JLabel.CENTER);
		jLabel.setFont(fontLetterBig);
		this.add(jLabel, BorderLayout.CENTER);		
		this.setVisible(true);
		
		// Để tạo được hành vi shortcut cho JMenu thì cần tạo ra addMenuListener để gọi được nó
	}
	public void showMenuItem (String s) {
		jLabel.setText("You have clicked on " + s + " item");
	}
}
