/*
 * - Comparable là một interface trong Java, trong Comparable có hàm compareTo để so sánh 2 đối tượng với nhau
 * - Hàm compareTo sẽ trả về 3 giá trị:
 * 	. Giá trị nguyên âm nếu đối tượng this nhỏ hơn đối tương truyền vào
 * 	. Bằng 0 nếu 2 đối tượng bằng nhau
 * 	. Giá trị nguyên dương nếu đối tượng this lớn hơn đối tượng truyền vào
 */
public class Main_EX054_Comparable {
	public static void main(String[] args) {
		Student std1 = new Student(52253, "Ngo Le Gia Bao", 5);
		Student std2 = new Student(52252, "Do Tri Nhut", 5);
		Student std3 = new Student(52193, "Danh Nhut An", 9);
		
//		System.out.println("Student_1 and Student_2 are compared together based on Student's ID: " + std1.compareTo(std2));
//		System.out.println("Student_3 and Student_1 are compared together based on Student's ID: " + std3.compareTo(std1));
//		System.out.println("Student_2 and Student_1 are compared together based on Student's ID: " + std2.compareTo(std1));
//		System.out.println("---------------------------------------------------------------------------");
	
//		System.out.println("Student_1 and Student_2 are compared together based on Student's name: " + std1.compareTo(std2));
//		System.out.println("Student_2 and Student_3 are compared together based on Student's name: " + std2.compareTo(std3));
//		System.out.println("Student_1 and Student_3 are compared together based on Student's name: " + std1.compareTo(std3));
//		System.out.println("---------------------------------------------------------------------------");

		System.out.println("Student_1 and Student_2 are compared together based on Student's average mark: " + std1.compareTo(std2));
		System.out.println("Student_2 and Student_3 are compared together based on Student's average mark: " + std2.compareTo(std3));
		System.out.println("Student_1 and Student_3 are compared together based on Student's average mark: " + std1.compareTo(std3));
		System.out.println("------------------------------------------------------------------------");
	}
}
