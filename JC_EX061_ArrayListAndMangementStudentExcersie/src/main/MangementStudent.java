package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class MangementStudent {
	private ArrayList<Student> listStudent = new ArrayList<Student>();
	public MangementStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}
	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}
	
	public void addStudent (Student std) {
		this.listStudent.add(std);
	}
	public void printListStudent () {
		for (Student student : listStudent) {
			System.out.println(student);
		}
	}
	public boolean listIsEmpty () {
		return this.listStudent.isEmpty();
	}
	public int numberStudentInList () {
		return this.listStudent.size();
	}
	public void makeEmptyListStudent () {
		this.listStudent.removeAll(listStudent);
	}
	public void deleteAStudentBaseOnStudentID (String studentID) {
		for (Student student : listStudent) {
			if (student.getStudentID().equals(studentID)) {
				this.listStudent.remove(student);
			}
		}
	}
	public boolean isExistenceBaseOnStudentID (String studentID) {
		for (Student student : listStudent) {
			if (student.getStudentID().equals(studentID)) {
				return true;
			}
		}
		return false;
	}
	public void printAllStudentsSameName (String name) {
		for (Student student : listStudent) {
			int postion = student.getFullName().lastIndexOf(" ");
			if (postion >= 0) {
				if (student.getFullName().substring(postion + 1).equals(name)) {
					System.out.println(student);
				}
			} else {
				if (student.getFullName().equals(name)) {
					System.out.println(student);
				}
			}
		}
	}
	public void printAllStudentHighToLowBaseOnAverageMark () {
		Collections.sort(this.listStudent);
	}
}
