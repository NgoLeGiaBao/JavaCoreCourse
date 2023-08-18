public class People {
	protected String name;
	protected int birthday;
	protected String national;
	
	public People(String name, int birthday, String national) {
		this.name = name;
		this.birthday = birthday;
		this.national = national;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}
	public void eating () {
		System.out.println(this.name + " is eating");
	}
	public void drinking () {
		System.out.println(this.name + " is drinking");
	}
}
