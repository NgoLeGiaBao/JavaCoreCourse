
public class Animal {
	protected String nameAnimal;

	public Animal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

	public String getNameAnimal() {
		return nameAnimal;
	}

	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}
	public void eating () {
		System.out.println(this.nameAnimal +" is eating");
	}
	
}
