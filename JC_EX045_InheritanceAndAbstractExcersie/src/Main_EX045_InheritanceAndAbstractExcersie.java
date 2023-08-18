public class Main_EX045_InheritanceAndAbstractExcersie {
	public static void main(String[] args) {
		Manufacturer mnf1 = new Manufacturer("AirBus", "France");
		Manufacturer mnf2 = new Manufacturer("Thaco", "VietNamese");
		Manufacturer mnf3 = new Manufacturer("Asama", "Chinese");
		
		AirPlane tps1 = new AirPlane(mnf1, "Fuel");
		Transportation tps2 = new Car(mnf2, "Fuel");
		Transportation tps3 = new Bike(mnf3);
		
		System.out.println("Speed's " + tps1.kindOfTransportaion + " is: " + tps1.getSpeed() + " km/h");
		System.out.println("Speed's " + tps2.kindOfTransportaion + " is: " + tps2.getSpeed() + " km/h");
		System.out.println("Speed's " + tps3.kindOfTransportaion + " is: " + tps3.getSpeed() + " km/h");
		
		System.out.println("---------------------");
		
		tps1.startUp();
		tps2.startUp();
		tps3.startUp();
		
		System.out.println("---------------------");
		
		tps1.acceleration();
		tps2.acceleration();
		tps3.acceleration();
		
		System.out.println("---------------------");
		
		tps1.shutDown();
		tps2.shutDown();
		tps3.shutDown();
		
		System.out.println("---------------------");
		
		tps1.takeOff();
		tps1.landing();
	}
}
