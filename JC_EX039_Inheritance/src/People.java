public class People {
	private String fullName;
	private int birthday;
	
	public People (String fullName, int birthday) {
		this.fullName = fullName;
		this.birthday = birthday;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public void Eating () {
		System.out.println("He/She is eating");
	}
	public void Drinking () {
		System.out.println("He/She is drinking");
	}
	public void Sleeping () {
		System.out.println("He/She is sleeping");
	}
}
