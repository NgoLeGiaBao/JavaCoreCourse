
public class Main_EX040_B {
	public static void main(String[] args) {
		Animal anm1 = new Animal("Name 's animal");
		Dog dg1 = new Dog("Dog");
		BabyDog bdg1 = new BabyDog();
		
		anm1.eating();
		
		dg1.eating();
		dg1.barking();
		
		bdg1.eating();
		bdg1.barking();
		bdg1.weeping();
	}
}
