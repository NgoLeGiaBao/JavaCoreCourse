public class Animal {
	protected String nameAnimal;
	public Animal (String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}
	public String getNameAnimal() {
		return nameAnimal;
	}
	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}
	public void eating () {
		System.out.println("Which food an animal eats: ");
	}
	public void makingSound () {
		System.out.println("Which sound an animal makes: ");
	}
	public void sleeping () {
		System.out.println("Most of animals are sleeping Zzzzzzz");
	}
}
