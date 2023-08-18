public class Bike extends Transportation {
	public Bike(Manufacturer manufacturer) {
		super("Bike", manufacturer);
	}

	@Override
	public double getSpeed() {
		return 20;
	}
	
}
