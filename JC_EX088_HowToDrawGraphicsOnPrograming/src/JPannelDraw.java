import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPannelDraw extends JPanel {
	public JPannelDraw() {
		this.setBackground(Color.WHITE);
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		g.drawLine(15, 15, 50, 150);
		
		g.setColor(Color.RED);
		g.drawOval(200, 200, 100, 100);
		
		g.setColor(Color.GREEN);
		g.draw3DRect(100, 100, 50, 50, true);
	}
	
}
