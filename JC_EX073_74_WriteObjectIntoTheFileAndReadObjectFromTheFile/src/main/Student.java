package main;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable  {
	private String studentID;
	private String fullName;
	private int birthyear;
	private double averageMark;
	
	public Student (String studentID, String fullName, int birthyear, double averageMark) {
		this.studentID = studentID;
		this.fullName = fullName;
		this.birthyear = birthyear;
		this.averageMark = averageMark;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", fullName=" + fullName + ", birthyear=" + birthyear
				+ ", averageMark=" + averageMark + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.averageMark > o.averageMark) {
			return -1;
		} else if (this.averageMark == o.averageMark) {
			return 0;
		}
		return 1;
	}
	
	
}
