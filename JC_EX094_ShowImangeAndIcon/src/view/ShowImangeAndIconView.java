package view;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ShowImangeAndIconView extends JFrame {
	
	public ShowImangeAndIconView() {
		this.initialInterface();
	}
	
	public void initialInterface () {
		this.setTitle("Eclipse Workspace");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		URL urlEclipse = ShowImangeAndIconView.class.getResource("Icon_Eclipse.png");
		Image img = Toolkit.getDefaultToolkit().createImage(urlEclipse);
		this.setIconImage(img);
		
		// Set font
		Font fontLetter = new Font("Arial", Font.LAYOUT_NO_LIMIT_CONTEXT,20);
		
		// Menu bar
		JMenuBar jMenuBar = new JMenuBar();
		
		JMenu jMenuEdit = new JMenu("Edit");
		jMenuEdit.setFont(fontLetter);
		
		JMenuItem jMenuItemUndo = new JMenuItem("Undo typing");
		ImageIcon iconUndo = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ShowImangeAndIconView.class.getResource("Icon_Undo.png")));
		jMenuItemUndo.setIcon(iconUndo);
		jMenuItemUndo.setFont(fontLetter);
		
		JMenuItem jMenuItemPaste = new JMenuItem("Paste");
		ImageIcon iconPaste = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ShowImangeAndIconView.class.getResource("Icon_Paste.png")));
		jMenuItemPaste.setIcon(iconPaste);
		jMenuItemPaste.setFont(fontLetter);
		
		JMenuItem jMenuItemDelete = new JMenuItem("Delete");
		ImageIcon iconDelete = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ShowImangeAndIconView.class.getResource("Icon_Delete.png")));
		jMenuItemDelete.setIcon(iconDelete);
		jMenuItemDelete.setFont(fontLetter);
		
		jMenuEdit.add(jMenuItemUndo);
		jMenuEdit.add(jMenuItemPaste);
		jMenuEdit.add(jMenuItemDelete);
		
		jMenuBar.add(jMenuEdit);
		
		// Center
		JLabel jLabelCenter = new JLabel();
		ImageIcon imgCenter = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ShowImangeAndIconView.class.getResource("Img_Center.png")));
		jLabelCenter.setIcon(imgCenter);
		
		// South
		ImageIcon iconQues = new ImageIcon(Toolkit.getDefaultToolkit().createImage(ShowImangeAndIconView.class.getResource("Icon_Ques.png")));
		JButton jButton = new JButton("CÁCH HIỂN THỊ ICON VÀ HÌNH ẢNH", iconQues);
		jButton.setFont(fontLetter);
		
		this.setJMenuBar(jMenuBar);
		this.add(jLabelCenter, BorderLayout.CENTER);
		this.add(jButton, BorderLayout.SOUTH);
		this.setVisible(true);
	}
}
