public class Main_EX050_ComparableStringClass {
	public static void main(String[] args) {
		// equals() and equalsIgnoreCase ()
		String s1 = "Information Technology";
		String s2 = "INFORMATION TECHNOLOGY";
		String s3 = "Information Technology";
		
		System.out.println("S1 equals S2 when using equals() is: " + s1.equals(s2));
		System.out.println("S1 equals S3 when using equals() is: " + s1.equals(s3));
		System.out.println("S1 equals S2 when using equalsIgnoreCase() is: " + s1.equalsIgnoreCase(s2));
		System.out.println("S1 equals S3 when using equalsIgnoreCase() is: " + s1.equalsIgnoreCase(s3));
		System.out.println("----------------------------------------------------------");
		
		
		// compareTo() and compareToIgnoreCase()
		String s4 = "Ngo Le Gia bao";
		String s5 = "Ngo Le Gia Canh";
		String s6 = "NGO LE GIA BAO";
		
		System.out.println("S4 compares to S5 when using compareTo() is: " + s4.compareTo(s5));
		System.out.println("S4 compares to S6 when using compareTo() is: " + s4.compareTo(s6));
		System.out.println("S4 compares to S5 when using compareToIgnoreCase() is: " + s4.compareToIgnoreCase(s5));
		System.out.println("S4 compares to S6 when using compareToIgnoreCase() is: " + s4.compareToIgnoreCase(s6));
		System.out.println("----------------------------------------------------------");

		// regionMatches()
		String s7 = "Object Oriented Programing";
		String s8 = "Oriented";
		String s9 = "ORIENTED";
		
		System.out.println("S8 substring S7 is: " + s7.regionMatches(7, s8, 0, s8.length()));
		System.out.println("S9 substring S7 when not using IgnoreCase is: " + s7.regionMatches(7, s9, 0, s8.length()));
		System.out.println("S9 substring S7 when using IgnoreCase is: " + s7.regionMatches(true,7, s9, 0, s8.length()));
		System.out.println("----------------------------------------------------------");

		
		// startWith();
		String s10 = "037969802";
		
		if (s10.startsWith("034")) {
			System.out.println("Name's telecom operator is Viettel");;
		} else {
			System.out.println("Name's telecom operator is Vina");
		}
		System.out.println("----------------------------------------------------------");

		
		// endWith();
		String s11 = "Excersie.c";
		
		if (s11.endsWith(".c")) {
			System.out.println("This is file C");
		} else {
			System.out.println("This is not file C");
		}
	}
}
