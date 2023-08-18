package model;

import java.util.ArrayList;

public class MangementStudentModel {
	private ArrayList<Student> listStuent;
	private String selection;
	private String fileName;
	public MangementStudentModel() {
		this.listStuent = new ArrayList<>();
		this.selection = "";
		this.fileName = "";
	}
	public ArrayList<Student> getListStuent() {
		return listStuent;
	}
	public void setListStuent(ArrayList<Student> listStuent) {
		this.listStuent = listStuent;
	}
	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		this.selection = selection;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void addStudent (Student st) {
		this.listStuent.add(st);
	}
	public void removeStudent (Student st) {
		this.listStuent.remove(st);
	}
	public void updateStudent (Student st) {
		this.listStuent.remove(st);
		this.listStuent.add(st);
	}
	public boolean isExist (Student st) {
		for (Student student : listStuent) {
			if (student.getIDStudent() == st.getIDStudent()) {
				return true;
			}
		}
		return false;
	}

}
