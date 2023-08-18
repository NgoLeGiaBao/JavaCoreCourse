
public class Manufacturer {
	private String nameManufacturer;
	private Nation inforNation;
	
	public Manufacturer (String nameManufacturer, Nation inforNation) {
		this.nameManufacturer = nameManufacturer;
		this.inforNation = inforNation;
	}

	public String getNameManufacturer() {
		return nameManufacturer;
	}

	public void setNameManufacturer(String nameManufacturer) {
		this.nameManufacturer = nameManufacturer;
	}

	public Nation getInforNation() {
		return inforNation;
	}

	public void setInforNation(Nation inforNation) {
		this.inforNation = inforNation;
	}


	public String getsNameNation() {
		return this.inforNation.getNameNation();
	}	
}
