
public class Student {
	private String IDStudent;
	private String nameStudent;
	private Date birthday;
	private double averageMark;
	private Class inforClass;
	
	public Student (String IDStudent, String nameStudent, Date birthday, double averageMark, Class inforClass) {
		this.IDStudent = IDStudent;
		this.nameStudent = nameStudent;
		this.birthday = birthday;
		this.averageMark = averageMark;
		this.inforClass = inforClass;
	}

	public String getIDStudent() {
		return IDStudent;
	}
	public void setIDStudent(String iDStudent) {
		IDStudent = iDStudent;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	public Class getInforClass() {
		return inforClass;
	}
	public void setInforClass(Class inforClass) {
		this.inforClass = inforClass;
	}
	public String getFacultyOfStudent () {
		return this.inforClass.getNameFaculty();
	}
	public boolean studentIsPass () {
		return this.averageMark >= 5.0;
	}
	public boolean checkTheSameBirthday (Student otherStudent) {
		return this.birthday.equals(otherStudent.birthday);
	}
}
