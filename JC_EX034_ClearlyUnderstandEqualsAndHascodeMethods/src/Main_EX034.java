public class Main_EX034 {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(25, 9, 2004);
		MyDate md2 = new MyDate (10, 1, 2023);
		MyDate md3 = new MyDate (25, 9, 2004);
		
		System.out.println("md1 equals to md2 is: " + md1.equals(md2));
		System.out.println("md1 equals to md3 is: " + md1.equals(md3));
		System.out.println("md2 equals to md3 is: " + md2.equals(md3));
		
		System.out.println("Hashcode of md1 is: " + md1.hashCode());
		System.out.println("Hashcode of md2 is: " + md2.hashCode());
		System.out.println("Hashcode of md3 is: " + md3.hashCode());
	}
}
