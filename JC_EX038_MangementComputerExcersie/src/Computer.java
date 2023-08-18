
public class Computer {
	Manufacturer inforManufacturer;
	Date dateManufacturer;
	int warrantyPeriod;
	double salesPrice;
	
	public Computer (Manufacturer inforManufacturer, Date dateManufacturer, int warrantyPeriod, double salesPrice) {
		this.inforManufacturer = inforManufacturer;
		this.dateManufacturer = dateManufacturer;
		this.warrantyPeriod = warrantyPeriod;
		this.salesPrice = salesPrice;
	}

	public Manufacturer getInforManufacturer() {
		return inforManufacturer;
	}

	public void setInforManufacturer(Manufacturer inforManufacturer) {
		this.inforManufacturer = inforManufacturer;
	}

	public Date getDateManufacturer() {
		return dateManufacturer;
	}

	public void setDateManufacturer(Date dateManufacturer) {
		this.dateManufacturer = dateManufacturer;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	public boolean computetIsCheaperThanOtherOne (Computer otherComputer) {
		return this.salesPrice < otherComputer.salesPrice;
	}
	public String getNationalManufacturerName () {
		return this.inforManufacturer.getsNameNation();
	}

}
