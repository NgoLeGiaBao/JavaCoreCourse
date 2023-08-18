public class AirPlane extends Transportation {
	private String kindOfFuel;

	public AirPlane(Manufacturer manufacturer, String kindOfFuel) {
		super("AirPlane", manufacturer);
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
		return 500;
	}
	public void takeOff () {
		System.out.println(this.kindOfTransportaion + " is taking off");
	}
	public void landing () {
		System.out.println(this.kindOfTransportaion + " is landing");
	}
	
	
}
