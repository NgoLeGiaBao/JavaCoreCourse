package controller;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import org.w3c.dom.events.MouseEvent;

import view.MouseInteractProgramingView;

public class MouseInteractProgramingController implements MouseListener, MouseMotionListener {
	private MouseInteractProgramingView mouseInteractProgramingView;
	
	public MouseInteractProgramingController(MouseInteractProgramingView mouseInteractProgramingView) {
		this.mouseInteractProgramingView = mouseInteractProgramingView;
	}

	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.mouseInteractProgramingView.updateCoordinate(x, y);
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		this.mouseInteractProgramingView.countClick();
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		this.mouseInteractProgramingView.isInComponent();
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		this.mouseInteractProgramingView.isNotInComponent();
		this.mouseInteractProgramingView.updateCoordinate(-1, -1);
		
	}
	
}
