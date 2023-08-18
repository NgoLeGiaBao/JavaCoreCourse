package Example_2;
public class Student implements Comparable<Student> {
	private String studentID;
	private String fullName;
	private double averageMark;
	
	public Student(String studentID, String fullName, double averageMark) {
		this.studentID = studentID;
		this.fullName = fullName;
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

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	
	public String getName () {
		int position;
		String s = this.fullName.trim();
		if (s.indexOf(" ") >= 0) {
			position = s.lastIndexOf(" ");
			return s.substring(position + 1);
		}
		return s;
	}

	@Override
	public String toString() {
		return this.studentID + " - " + this.fullName + " - " + this.averageMark ;
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
//		if (this.averageMark < o.averageMark) {
//			return -1;
//		} else if (this.averageMark == o.averageMark) {
//			return 0;
//		} else {
//			return 1;
//		}
	}
}
