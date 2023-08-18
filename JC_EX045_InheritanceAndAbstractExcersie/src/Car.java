
public class Car extends Transportation{
	private String kindOfFuel;

	public Car(Manufacturer manufacturer, String kindOfFuel) {
		super("Car", manufacturer);
		this.kindOfFuel = kindOfFuel;
	}

	public String getKindOfFuel() {
		return kindOfFuel;
	}

	public void setKindOfFuel(String kindOfFuel) {
		this.kindOfFuel = kindOfFuel;
	}

	@Override
	public double getSpeed() {
		return 100;
	}
	
}
