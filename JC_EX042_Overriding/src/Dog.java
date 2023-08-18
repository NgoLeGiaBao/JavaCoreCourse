public class Dog extends Animal{
	public Dog() {
		super("Dog");
	}
	@Override
	public void eating() {
		System.out.println("The dog often eats bone and rice");
	}
	@Override
	public void makingSound() {
		System.out.println("The dog often makes sound woof woof");
	}
	
}
