/*
 * - ArrayList được sử dụng như mảng, tuy nhiên nó có thể thay đổi số phẩn tử trong
 * bất kỳ lúc nào
 * - Cách khởi tạo ArrayList
 * 		ArrayList <Object/Not> nameVariable = new ArrayList <Object/Not> ();
 * - Dùng class Collection để sắp xếp lại sinh viên theo chiều tăng/ hoặc
 */
package test;
import java.util.ArrayList;
import java.util.Scanner;
import main.MangementStudent;
import main.Student;
public class Main_EX061_ArrayList_MangementStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MangementStudent mgstd = new MangementStudent(new ArrayList<>());
		int selection;
		do {
			System.out.println("-----------------MENU-----------------");
			System.out.println("Please medthod you want to implement");
			System.out.println("1. Add a student in list");
			System.out.println("2. Display a list student in screen");
			System.out.println("3. Check a list student is empty or not");
			System.out.println("4. Taking a number of student in a list student");
			System.out.println("5. Making empty a list student");
			System.out.println("6. Check existing a student in a list student or not");
			System.out.println("7. Delete a student from a list student base on student ID ");
			System.out.println("8. Find all student base on name entered from the key board");
			System.out.println("9. Arrange student from high to low base on average mark");
			System.out.print("Entering your selection: ");
			selection = sc.nextInt();
			sc.nextLine();
			if (selection == 1) {
				String studentID, fullName;
				int birthyear;
				double averageMark;
				System.out.print("Entering student ID: ");
				studentID = sc.nextLine();
				System.out.print("Entering full name: ");
				fullName = sc.nextLine();
				System.out.print("Entering birth year: ");
				birthyear = sc.nextInt();
				System.out.print("Entering average mark: ");
				averageMark = sc.nextDouble();
				Student std = new Student(studentID, fullName, birthyear, averageMark);
				mgstd.addStudent(std);
			} else if (selection == 2) {
				System.out.println("The information all students in list: ");
				mgstd.printListStudent();
			} else if (selection == 3) {
				System.out.println("The list student is empty: " + mgstd.listIsEmpty());
			} else if (selection == 4) {
				System.out.println("A number of students in list is: " + mgstd.numberStudentInList());
			} else if (selection == 5) {
				mgstd.makeEmptyListStudent();
			} else if (selection == 6) {
				String studentID;
				System.out.print("Entering student ID you want to delete from the keyboard: ");
				studentID = sc.nextLine();
				mgstd.deleteAStudentBaseOnStudentID(studentID);
			} else if (selection == 7) {
				String studentID;
				System.out.print("Entering student ID you want to find from the keyboard: ");
				studentID = sc.nextLine();
				System.out.println("Student ID " + studentID + " is existing in a list student: " + mgstd.isExistenceBaseOnStudentID(studentID));
			} else if (selection == 8) {
				String name;
				System.out.print("Entering name you want to find from the keyboard: ");
				name = sc.nextLine();
				mgstd.printAllStudentsSameName(name);
			} else if (selection == 9) {
				mgstd.printAllStudentHighToLowBaseOnAverageMark();
				mgstd.printListStudent();
			}
			System.out.println("--------------------------------------");
		} while (selection != 0);
	}
}
