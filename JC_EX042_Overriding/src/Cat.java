
public class Cat extends Animal {
	public Cat() {
		super("Cat");
	}

	@Override
	public void eating() {
		System.out.println("The cat often eats mouses");
	}
	
	@Override
	public void makingSound() {
		System.out.println("The dog often makes sound meow meow");
	}
	
}
