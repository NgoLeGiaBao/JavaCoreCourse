public class Manufacturer {
	private String nameManufacturer;
	private String nameNation;
	
	public Manufacturer (String maneManufacturer, String nameNation) {
		this.nameManufacturer = maneManufacturer;
		this.nameNation = nameNation;
	}

	public String getNameManufacturer() {
		return nameManufacturer;
	}

	public void setNameManufacturer(String nameManufacturer) {
		this.nameManufacturer = nameManufacturer;
	}

	public String getNameNation() {
		return nameNation;
	}

	public void setNameNation(String nameNation) {
		this.nameNation = nameNation;
	}
	
}
