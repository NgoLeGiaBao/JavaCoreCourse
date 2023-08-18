package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.FindKeyWordController;
import model.FindKeyWordModel;

public class FindKeyWordView extends JFrame{
	private FindKeyWordModel findKeyWordModel;
	private JLabel jLabelNorth, jLabelKey, jLabelResult;
	private JTextArea jTextArea;
	private JPanel jPanelSouth, jPanelResult;
	private JTextField jTextField;
	private JScrollPane jScrollPane;
	
	public FindKeyWordView() {
		this.findKeyWordModel = new FindKeyWordModel();
		this.intialInterface();
	}
	public void intialInterface () {
		this.setTitle("FIND KEY WORD FROM A TEXT");
		this.setSize(700, 400);
		this.setLocationRelativeTo(null);
		
		// Set Font
		Font fontLetterBig = new Font("Arial", Font.BOLD, 40);
		Font fontLetterSmall = new Font("Arial", Font.BOLD, 25);
		// North
		jLabelNorth = new JLabel("Paragraph", JLabel.CENTER);
		jLabelNorth.setFont(fontLetterBig);
		
		// Center
		jTextArea = new JTextArea();
		jTextArea.setFont(fontLetterSmall);
		
		//jScrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// ít được sử dụng, thường sử dụng ở bên dưới
		jScrollPane = new JScrollPane(jTextArea);
		
		
		// Action listener;
		FindKeyWordController findKeyWordController = new FindKeyWordController(this);
			
		// South
		jPanelSouth = new JPanel(new GridLayout(3,1,10,10));
		jLabelKey = new JLabel("Key word", JLabel.CENTER);
		jLabelKey.setFont(fontLetterBig);
		
		
		jTextField = new JTextField();
		jTextField.setFont(fontLetterSmall);
		
		jPanelResult = new JPanel(new GridLayout(1,2,10,10));
		JButton jButton = new JButton("Statistic");
		jButton.setFont(fontLetterSmall);
		jButton.addActionListener(findKeyWordController);
		
		jLabelResult = new JLabel("Let's start finding a keyword",JLabel.CENTER);
		jLabelResult.setFont(fontLetterSmall);
		
		jPanelResult.add(jButton);
		jPanelResult.add(jLabelResult);
		
		jPanelSouth.add(jLabelKey);
		jPanelSouth.add(jTextField);
		jPanelSouth.add(jPanelResult);
		
		this.add(jLabelNorth, BorderLayout.NORTH);
		this.add(jScrollPane,BorderLayout.CENTER);
		this.add(jPanelSouth,BorderLayout.SOUTH);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showResult () {
		this.findKeyWordModel.setText(jTextArea.getText());
		this.findKeyWordModel.setKeyWord(this.jTextField.getText());
		this.findKeyWordModel.staticKeyWord();
		this.jLabelResult.setText(this.findKeyWordModel.getResult());
	}
}
