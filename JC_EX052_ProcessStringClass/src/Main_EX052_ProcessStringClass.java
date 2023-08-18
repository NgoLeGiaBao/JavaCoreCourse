public class Main_EX052_ProcessStringClass {
	public static void main(String[] args) {
		// Hàm concat()
		String s1 = "My full name ";
		String s2 = "is Bao Ngo Le Gia";
		
		System.out.println("String s1 concats string s2 is: " + s1.concat(s2));
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		// Hàm replace();
		String s3 = "I am from VietNamese, I am a player football and I am very well-known person";
		String s4 = s3.replace("I am", "You are");
		String s5 = s3.replaceAll("am", "are");
		String s6 = s3.replace('a', 'i');
		String s7 = s3.replaceFirst("I am", "You are");
		
		System.out.println("String s4 after using replace() to replace a string is: " + s4);
		System.out.println("String s5 after using replaceAll() to replace a string is: " + s5);
		System.out.println("String s6 after using replace() to replace a character is: " + s6);
		System.out.println("String s7 after using replaceFirst() to replace a string is: " + s7);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
	
	
		// Hàm toLowerCase() và hàm toUpperCase()
		String s8 = "TOdaY iS nIce";
		String s9 = s8.toLowerCase();
		String s10 = s8.toUpperCase();
		
		System.out.println("String s8 is: " + s8);
		System.out.println("String s8 after using toLowerCase() is: " + s9);
		System.out.println("String s8 after using toUpperCase() is: " + s10);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
	
		
		// Hàm trim ()
		String s11 = "   Welcome to TDTU, this is Faculty of Information Technology     ";
		
		System.out.println("String s11 is: " + s11);
		System.out.println("String s11 after using trim() is: " + s11.trim());
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");

		
		// Hàm substring ()
		String s12 = "Welcome to my channel, I am Bao Ngo Le Gia";
		String s13 = s12.substring(0, 21);
		String s14 = s12.substring(9);
		
		System.out.println("String s13 after using substring() is: " + s13);
		System.out.println("String s14 after using substring() is: " + s14);
	}
}
