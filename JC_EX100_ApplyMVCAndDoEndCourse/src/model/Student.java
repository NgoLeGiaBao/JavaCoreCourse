package model;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
	private int IDStudent;
	private String nameStudent;
	private Town town;
	private String birthday;
	private boolean sex;
	double firstMark, secondMark, thirdMark;
	public Student(int iDStudent, String nameStudent, Town town, String birthday, boolean sex, double firstMark,
			double secondMark, double thirdMark) {
		IDStudent = iDStudent;
		this.nameStudent = nameStudent;
		this.town = town;
		this.birthday = birthday;
		this.sex = sex;
		this.firstMark = firstMark;
		this.secondMark = secondMark;
		this.thirdMark = thirdMark;
	}
	public int getIDStudent() {
		return IDStudent;
	}
	public void setIDStudent(int iDStudent) {
		IDStudent = iDStudent;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public Town getTown() {
		return town;
	}
	public void setTown(Town town) {
		this.town = town;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public double getFirstMark() {
		return firstMark;
	}
	public void setFirstMark(double firstMark) {
		this.firstMark = firstMark;
	}
	public double getSecondMark() {
		return secondMark;
	}
	public void setSecondMark(double secondMark) {
		this.secondMark = secondMark;
	}
	public double getThirdMark() {
		return thirdMark;
	}
	public void setThirdMark(double thirdMark) {
		this.thirdMark = thirdMark;
	}
//	public String toString () {
//		return this.nameStudent + this.IDStudent;
//	}
//	
}
