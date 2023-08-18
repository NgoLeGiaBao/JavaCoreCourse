public class Bird extends Animal {
	public Bird() {
		super("Bird");
	}

	@Override
	public void eating() {
		System.out.println("The bird often eats worms and grubs");
	}

	@Override
	public void makingSound() {
		System.out.println("The bird often makes sound chirped chirped");
	}
	
}
