package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;

import javax.swing.JOptionPane;

import view.MangememtStudentView;

public class MangementStudentController implements ActionListener{
	private MangememtStudentView mangememtStudentView;
	public MangementStudentController(MangememtStudentView mangememtStudentView) {
		this.mangememtStudentView = mangememtStudentView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();

//		JOptionPane.showMessageDialog(this.mangememtStudentView, "You have pressed " + src);
		if (src.equals("Insert")) {
			this.mangememtStudentView.userClickInsert();
		} else if (src.equals("Delete")) {
			try {
				this.mangememtStudentView.userSelectDelete();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		} else if (src.equals("Update")) {
			try {
//				this.mangememtStudentView.userSelectSave();;
				this.mangememtStudentView.userSelectUpdate();
			} catch (IndexOutOfBoundsException e2) {
				System.out.println("Error");
			}

		} else if (src.equals("Save")) {
			try {
				this.mangememtStudentView.userSelectSave();;
			} catch (Exception e2) {
				JOptionPane.showMessageDialog (this.mangememtStudentView, e2.getMessage());
//				e2.printStackTrace();
			}
		} else if (src.equals("Cancel")) {
			this.mangememtStudentView.userSelectCancel();
		} else if (src.equals("Find")) {
			try {
				this.mangememtStudentView.userClickFind();
			} catch (IndexOutOfBoundsException e2) {
				System.out.println("Error");
			}

		} else if (src.equals("Recover")) {
			try {
				this.mangememtStudentView.userClickRecover();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else if (src.equals("About Me")) {
			this.mangememtStudentView.userClickAboutMe();
		} else if (src.equals("Exit")) {
			this.mangememtStudentView.userClickExit();
		} else if (src.equals("File Save")) {
			this.mangememtStudentView.userClickFileSave();
		} else if (src.equals("File Open")) {
			this.mangememtStudentView.userClickFileOpen();
		}
	}

}
