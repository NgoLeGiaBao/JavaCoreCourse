public abstract class Transportation {
	protected String kindOfTransportaion;
	protected Manufacturer manufacturer;
	
	public Transportation(String kindOfTransportaion, Manufacturer manufacturer) {
		this.kindOfTransportaion = kindOfTransportaion;
		this.manufacturer = manufacturer;
	}

	public String getKindOfTransportaion() {
		return kindOfTransportaion;
	}

	public void setKindOfTransportaion(String kindOfTransportaion) {
		this.kindOfTransportaion = kindOfTransportaion;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getManufacturerName () {
		return this.manufacturer.getManufacturerName();
	}
	public void startUp () {
		System.out.println(this.kindOfTransportaion + " is starting up");
	}
	public void acceleration () {
		System.out.println(this.kindOfTransportaion + " is accelerating");
	}
	public void shutDown () {
		System.out.println(this.kindOfTransportaion + " is shutting down");
	}
	public abstract double getSpeed ();
	
}
