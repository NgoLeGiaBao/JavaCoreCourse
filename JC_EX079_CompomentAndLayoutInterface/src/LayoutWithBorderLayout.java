import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.JFrame;
public class LayoutWithBorderLayout extends JFrame {
	public LayoutWithBorderLayout () {
		this.setTitle("Layout with Border Layout");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
		BorderLayout bl1 = new BorderLayout();
		BorderLayout bl2 = new BorderLayout(100, 100);
		
		this.setLayout(bl2);
		this.add(new Button("1"), BorderLayout.CENTER);
		this.add(new Button("2"), BorderLayout.WEST);
		this.add(new Button("3"), BorderLayout.EAST);
		this.add(new Button("4"), BorderLayout.SOUTH);
		this.add(new Button("5"), BorderLayout.NORTH);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new LayoutWithBorderLayout();
	}
}
