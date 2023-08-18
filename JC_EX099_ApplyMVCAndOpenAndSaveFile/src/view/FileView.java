package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.FileController;
import model.FileModel;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FileView extends JFrame {
	private FileModel fileModel;
	private JPanel contentPane;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	public FileView() {
		this.fileModel = new FileModel();
		this.setTitle("Open And Save File");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 590);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		contentPane.setLayout(new BorderLayout(0, 0));
		
		// Invoke action listener
		FileController fileController = new FileController(this);
		
		// Set text area
		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		// Set process
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10,50));
		panel.setLayout(null);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		lblNewLabel_1 = new JLabel("PATH");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 512, 50);
		panel.add(lblNewLabel_1);
		
		btnNewButton = new JButton("OPEN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(511, 0, 120, 50);
		btnNewButton.addActionListener(fileController);
		panel.add(btnNewButton);
		
		
		btnNewButton_1 = new JButton("SAVE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(627, 0, 120, 50);
		btnNewButton_1.addActionListener(fileController);
		panel.add(btnNewButton_1);


		this.setVisible(true);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

// Phương thức này sẽ ghi đè phương thức của lớp cha nên không thể tạo được
//	public void setContentPanes(JPanel contentPane) {
//		this.contentPane = contentPane;
//	}
	public JTextArea getTextArea() {
		return textArea;
	}
	public FileModel getFileModel() {
		return fileModel;
	}
	public void setFileModel(FileModel fileModel) {
		this.fileModel = fileModel;
	}
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}
	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}
	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}
	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}
	public void writTextFromFileIntoJTextArea () {
		this.textArea.setText(this.fileModel.getText());
	}
	public void addPath () {
		this.lblNewLabel_1.setText(this.fileModel.getNameFile());
	}
}
