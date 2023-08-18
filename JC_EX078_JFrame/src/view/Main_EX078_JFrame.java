package view;

import javax.swing.JFrame;

public class Main_EX078_JFrame {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		// Gắn tên
		jf.setTitle("EX079_JFrame in Java");
		
		// Thiết lập kích cỡ
		jf.setSize(300, 500);
		
		// Thiết lập vị trí hiển thị cho JFrame
		jf.setLocation(300, 100);
		
		// Đóng JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Cho phép hiển thị JFrame
		jf.setVisible(true);
	}
}
