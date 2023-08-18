public class Main_EX051_FindStringClass {
	public static void main(String[] args) {
		String s1 = "See you again and Again and more again";
		String s2 = "again";
		String s3 = "No again";
		
		// Hàm indexOf()
		System.out.println("First postion in which string s2 appear in string s1 is: " + s1.indexOf(s2));
		System.out.println("First postion in which character i appear in string s1 is: " + s1.indexOf('i'));
		System.out.println("First postion in which character e appear in string s1 from postion 8 is: " + s1.indexOf('e', 8));
		System.out.println("First postion in which string s2 appear in string s1 from position 10 is: " + s1.indexOf(s2, 10));
		System.out.println("First postion in which string s3 appear in string s1 is: " + s1.indexOf(s3));
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		// Hàm lastIndexOf()
		System.out.println("First postion in which string s2 appear in string s1 when using lastIndexOf() is: " + s1.lastIndexOf(s2));
		System.out.println("First postion in which character i appear in string s1 when using lastIndexOf() is: " + s1.lastIndexOf('i'));
		System.out.println("First postion in which character e appear in string s1 from postion 30 when using lastIndexOf() is: " + s1.lastIndexOf('e', 30));
		System.out.println("First postion in which string s2 appear in string s1 from position 32 when using lastIndexOf() is: " + s1.lastIndexOf(s2, 32));
	}
}
