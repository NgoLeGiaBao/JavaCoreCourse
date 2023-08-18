package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
/*
 * Để cài đặt được Window Builder ta làm như sau:
 * - Vào website Window Builder copy phiên bản mới nhất
 * - Vào eclipse => help => install software => dán link vừa copy
 * - Nhấn next để tiếp tục => Hoàn thành việc cài đặt
 * - Tao file => other => JFrame để tạo được kéo thả
 */
public class EX01 extends JFrame {

	private JPanel contentPane;
	private JTextField txtDrapAndDrop;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EX01 frame = new EX01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EX01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDrapAndDrop = new JTextField();
		txtDrapAndDrop.setForeground(Color.RED);
		txtDrapAndDrop.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtDrapAndDrop.setText("Drap And Drop Interface");
		txtDrapAndDrop.setBounds(127, 45, 404, 85);
		contentPane.add(txtDrapAndDrop);
		txtDrapAndDrop.setColumns(10);
		
		JButton btnNewButton = new JButton("Click Here To Continue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(194, 154, 265, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Welcome to TDTU ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\giabao2509\\Downloads\\Icon_Ques.png"));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(127, 237, 404, 79);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pho", "Bun", "Banh Mi", "Rice"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(251, 337, 166, 21);
		contentPane.add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(251, 393, 173, 19);
		contentPane.add(passwordField);
	}
}
