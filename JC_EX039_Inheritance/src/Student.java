public class Student extends People {
	private String className;
	private String schoolName;
	
	public Student(String fullName, int birthday, String className, String schoolName) {
		super(fullName, birthday);
		this.className = className;
		this.schoolName = schoolName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public void doingExcersie () {
		System.out.println("He/She is doing excersie");
	}
}
