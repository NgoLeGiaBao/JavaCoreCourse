public class Student implements Comparable<Student> {
	private int studentID;
	private String fullName;
	private float averageMark;
	
	public Student (int studentID, String fullName, float averageMark) {
		this.studentID = studentID;
		this.fullName = fullName;
		this.averageMark = averageMark;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(float averageMark) {
		this.averageMark = averageMark;
	}
	
	public String getName () {
		String s = this.fullName.trim();
		if (s.indexOf(" ")  >= 0)  {
			int position = s.lastIndexOf(" ");
			return s.substring(position + 1);
		}
		return s;
	}
	
// So sánh dựa trên mã sinh viên
//	@Override
//	public int compareTo(Student o) {
//		return this.studentID - o.studentID;
//	}	

	
// So sánh dựa trên tên sinh viên	
//	@Override
//	public int compareTo(Student o) {
//		String initialString, transmissionInString;
//		initialString = this.getName();
//		transmissionInString = o.getName();
//		return initialString.compareTo(transmissionInString);
//	}
	
	
// So sánh dựa trên điểm trung bình	
	@Override
	public int compareTo(Student o) {
		if (this.averageMark < o.averageMark) {
			return -1;
		} else if (this.averageMark == o.averageMark) {
			return 0;
		}
		return 1;
	}
}

