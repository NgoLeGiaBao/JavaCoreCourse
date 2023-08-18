public class Manufacturer {
	private String manufacturerName;
	private String nationName;
	
	public Manufacturer (String manufacturerName, String nameNation) {
		this.manufacturerName = manufacturerName;
		this.nationName = nameNation;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getNationName() {
		return nationName;
	}

	public void setNationName(String nationName) {
		this.nationName = nationName;
	}
	
}
