
public class Main_EX038 {
	public static void main(String[] args) {
		Date dt1 = new Date(15, 8, 2023);
		Date dt2 = new Date(1, 3, 2023);
		Date dt3 = new Date(4, 5, 2022);
		
		Nation nt1 = new Nation("VN", "Vietnamese");
		Nation nt2 = new Nation("USA", "The United States");
		Nation nt3 = new Nation("TW", "Taiwan");
		
		Manufacturer mft1 = new Manufacturer("VN Laptop", nt1);
		Manufacturer mft2 = new Manufacturer("Macbook", nt2);
		Manufacturer mft3 = new Manufacturer("Asus", nt3);
		
		Computer cmpt1 = new Computer(mft1, dt1, 6, 10);
		Computer cmpt2 = new Computer(mft2, dt2, 12, 30);
		Computer cmpt3 = new Computer(mft3, dt3, 3, 20);
		
		System.out.println(mft1.getNameManufacturer()+ " being cheaper than " + mft2.getNameManufacturer() + " is: " + cmpt1.computetIsCheaperThanOtherOne(cmpt2));
		System.out.println(mft1.getNameManufacturer()+ " being cheaper than " + mft3.getNameManufacturer() + " is: " + cmpt1.computetIsCheaperThanOtherOne(cmpt3));
		System.out.println(mft2.getNameManufacturer()+ " being cheaper than " + mft3.getNameManufacturer() + " is: " + cmpt2.computetIsCheaperThanOtherOne(cmpt3));

		
		System.out.println("Nation's " + mft1.getNameManufacturer()+ " is:" + cmpt1.getNationalManufacturerName());
		System.out.println("Nation's " + mft2.getNameManufacturer()+ " is:" + cmpt2.getNationalManufacturerName());
		System.out.println("Nation's " + mft3.getNameManufacturer()+ " is:" + cmpt3.getNationalManufacturerName());
		
	}
}
