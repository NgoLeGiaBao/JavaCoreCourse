package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.MenuBarController;

public class MenuBarView extends JFrame {
	private JLabel jLabel;
	
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
		JMenuBar jMenuBar = new JMenuBar();
		
		// File
		JMenu jMenuFile = new JMenu("File");
		jMenuFile.setFont(fontLetterSmall);

		JMenuItem jMenuRecentFile = new JMenuItem("Recent File");
		jMenuRecentFile.setFont(fontLetterSmall);
		jMenuRecentFile.addActionListener(menuBarController);
		
		JMenuItem jMenuSwitch = new JMenuItem("Switch Workspace");
		jMenuSwitch.setFont(fontLetterSmall);
		jMenuSwitch.addActionListener(menuBarController);
		
		jMenuFile.add(jMenuRecentFile);
		jMenuFile.add(jMenuSwitch);
		
		// Edit
		JMenu jMenuEdit = new JMenu("Edit");
		jMenuEdit.setFont(fontLetterSmall);
		
		JMenuItem jMenuItemUndo = new JMenuItem("Undo Typing");
		jMenuItemUndo.setFont(fontLetterSmall);
		jMenuItemUndo.addActionListener(menuBarController);
		
		jMenuEdit.add(jMenuItemUndo);
		
		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuEdit);
		
		this.setJMenuBar(jMenuBar);

		
		jLabel = new JLabel("Let click on a any menu item on menu bar", JLabel.CENTER);
		jLabel.setFont(fontLetterBig);
		this.add(jLabel, BorderLayout.CENTER);		
		this.setVisible(true);
	}
	public void showMenuItem (String s) {
		jLabel.setText("You have clicked on " + s + " item");
	}
}
