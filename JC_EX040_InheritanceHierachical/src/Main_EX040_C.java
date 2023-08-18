public class Main_EX040_C {
	public static void main(String[] args) {
		Animal anm1 = new Animal("Name 's animal");
		Bird brd1 = new Bird();
		Dog dg1 = new Dog();
		
		anm1.eating();
		
		brd1.eating();
		brd1.fly();
		
		dg1.eating();
		dg1.barking();
	}
}
