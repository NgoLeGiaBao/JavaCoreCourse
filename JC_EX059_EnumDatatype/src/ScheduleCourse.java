
public class ScheduleCourse {
	private DayInWeek day;
	private String nameSubjects;
	public ScheduleCourse(DayInWeek day, String nameSubjects) {
		this.day = day;
		this.nameSubjects = nameSubjects;
	}
	public DayInWeek getDay() {
		return day;
	}
	public void setDay(DayInWeek day) {
		this.day = day;
	}
	public String getNameSubjects() {
		return nameSubjects;
	}
	public void setNameSubjects(String nameSubjects) {
		this.nameSubjects = nameSubjects;
	}
	@Override
	public String toString() {
		return "ScheduleCourse [day=" + day + ", nameSubjects=" + nameSubjects + "]";
	}
	
	
	
}
