
public class Main_EX032 {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(31, 14, 2022);
		MyDate md2 = new MyDate (43, 4, -3045);
		System.out.println("Today is: " + md1.getDay());
		System.out.println("This month is: " + md1.getMonth());
		System.out.println("This year is: " + md1.getYear());

		System.out.println("Today is: " + md2.getDay());
		System.out.println("This month is: " + md2.getMonth());
		System.out.println("This year is: " + md2.getYear());
		
		md1.setDay(32);
		System.out.println("Today is: " + md1.getDay());

	}
}
