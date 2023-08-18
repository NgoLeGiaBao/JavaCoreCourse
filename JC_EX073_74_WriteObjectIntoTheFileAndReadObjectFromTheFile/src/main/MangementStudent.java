package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.io.EOFException;
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
	public void writeStudentIntoFile (File f) throws IOException {
		OutputStream os = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		for (Student student : listStudent) {
			oos.writeObject(student);
		}
		oos.flush();
		oos.close();
	}
	public void readStudentFromFile (File f) throws IOException{
		InputStream is = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(is);
		Student st = null;
		while (true) {
			Object obj = null;
			try {
				obj = ois.readObject();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (obj == null) {
				break;
			} 
			if (obj != null) {
				st = (Student) obj;
				this.listStudent.add(st);
			}
		}
		ois.close();
//		try {
//			InputStream is = new FileInputStream(f);
//			ObjectInputStream ois =new ObjectInputStream(is);
//			Student sv = null;
//			while(true) {
//				Object oj = ois.readObject();
//				if(oj==null) {
//					break;
//				}
//				if(oj!=null) {
//					sv = (Student) oj;
//					this.listStudent.add(sv);
//				}
//			}
//			ois.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	public void printAllStudentHighToLowBaseOnAverageMark () {
		Collections.sort(this.listStudent);
	}
}
