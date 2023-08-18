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
import javax.swing.JToolBar;
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
		jMenuItemUndo.setMnemonic(KeyEvent.VK_U);
//		jMenuItemUndo.setDisplayedMnemonicIndex(0);
		jMenuEdit.add(jMenuItemUndo);
		
		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuEdit);
		
		this.setJMenuBar(jMenuBar);

		// JToolBar dùng để tạo ra một thanh công cụ
		JToolBar jToolBar = new JToolBar();
		
		// Để tạo ra ghi chú cho từng phần tử ta sử dụng
		JButton jButtonNew = new JButton("New");
		jButtonNew.setFont(fontLetterSmall);
		jButtonNew.addActionListener(menuBarController);
		jButtonNew.setToolTipText("New File");
		
		JButton jButtonRun = new JButton("Run");
		jButtonRun.setFont(fontLetterSmall);
		jButtonRun.addActionListener(menuBarController);
		jButtonRun.setToolTipText("Running Programing");
		
		JButton jButtonNewClass = new JButton("New Class");
		jButtonNewClass.setFont(fontLetterSmall);
		jButtonNewClass.addActionListener(menuBarController);
		jButtonNewClass.setToolTipText("Creat new class");
		
		JButton jButtonEditor = new JButton("Editor");
		jButtonEditor.setFont(fontLetterSmall);
		jButtonEditor.addActionListener(menuBarController);
		jButtonEditor.setToolTipText("Editor text");
		
		JButton jButtonOpen = new JButton("Open");
		jButtonOpen.setFont(fontLetterSmall);
		jButtonOpen.addActionListener(menuBarController);
		jButtonOpen.setToolTipText("Open file");
		
		jToolBar.add(jButtonNew);
		jToolBar.add(jButtonRun);
		jToolBar.add(jButtonNewClass );
		jToolBar.add(jButtonEditor);
		jToolBar.add(jButtonOpen);
		
		jLabel = new JLabel("Let click on a any menu item on menu bar", JLabel.CENTER);
		jLabel.setFont(fontLetterBig);
		
		this.add(jToolBar, BorderLayout.NORTH);
		this.add(jLabel, BorderLayout.CENTER);		
		this.setVisible(true);
	}
	public void showMenuItem (String s) {
		jLabel.setText("You have clicked on " + s + " item");
	}
}
