package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseInteractProgramingController;
import model.MouseInteractProgramingModel;

public class MouseInteractProgramingView extends JFrame {
	private MouseInteractProgramingModel mouseInteractProgramingModel;
	private JPanel jPanelCenter, jPanelSouth;
	private JLabel jLabelPositon, jLabelCoordinate, jLabelTimesClick, jLabelGetTimesClick, jLabelInComponent, jLabelIsComponent;
	
	public MouseInteractProgramingView() {
		this.mouseInteractProgramingModel = new MouseInteractProgramingModel();
		this.initialInterface();
	}
	public void initialInterface () {
		this.setTitle("MOUSE INTERACT WITH PROGRAMING");
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		
		// Font;
		Font font = new Font("Arial", Font.BOLD, 32);
		
		MouseInteractProgramingController mouseInteractProgramingController = new MouseInteractProgramingController(this);
		
		// Center
		jPanelCenter = new JPanel();
		jPanelCenter.setBackground(Color.BLUE);
		jPanelCenter.addMouseListener(mouseInteractProgramingController);
		jPanelCenter.addMouseMotionListener(mouseInteractProgramingController);
		
		// South
		jPanelSouth = new JPanel(new GridLayout(3, 2));
		
		jLabelPositon = new JLabel("Position: ");
		jLabelPositon.setFont(font);
		jLabelCoordinate = new JLabel("x = " + this.mouseInteractProgramingModel.getX() + ", y = " + this.mouseInteractProgramingModel.getY());
		jLabelCoordinate.setFont(font);
		jLabelTimesClick = new JLabel("Number of clicks: ");
		jLabelTimesClick.setFont(font);
		jLabelGetTimesClick = new JLabel(this.mouseInteractProgramingModel.getCountClick()+"");
		jLabelGetTimesClick.setFont(font);
		jLabelInComponent = new JLabel("Mouse is in component: ");
		jLabelInComponent.setFont(font);
		jLabelIsComponent = new JLabel(this.mouseInteractProgramingModel.getIsInComponent());
		jLabelIsComponent.setFont(font);
	
		jPanelSouth.add(jLabelPositon);
		jPanelSouth.add(jLabelCoordinate);
		jPanelSouth.add(jLabelTimesClick);
		jPanelSouth.add(jLabelGetTimesClick);
		jPanelSouth.add(jLabelInComponent);
		jPanelSouth.add(jLabelIsComponent);
		
		this.add(jPanelCenter, BorderLayout.CENTER);
		this.add(jPanelSouth, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void updateCoordinate (int x, int y) {
		this.mouseInteractProgramingModel.setX(x);
		this.mouseInteractProgramingModel.setY(y);
		jLabelCoordinate.setText("x = " + this.mouseInteractProgramingModel.getX() + ", y = " + this.mouseInteractProgramingModel.getY());
	}
	public void countClick () {
		this.mouseInteractProgramingModel.setCountClick();
		jLabelGetTimesClick.setText(this.mouseInteractProgramingModel.getCountClick()+"");
	}
	public void isInComponent () {
		this.mouseInteractProgramingModel.setIsInComponent("Yes");
		jLabelIsComponent.setText(this.mouseInteractProgramingModel.getIsInComponent());
	}
	public void isNotInComponent () {
		this.mouseInteractProgramingModel.setIsInComponent("No");
		jLabelIsComponent.setText(this.mouseInteractProgramingModel.getIsInComponent());
	}
	
}
