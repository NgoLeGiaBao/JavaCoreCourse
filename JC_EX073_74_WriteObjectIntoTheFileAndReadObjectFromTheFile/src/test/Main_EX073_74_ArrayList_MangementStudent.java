/*
 * - Để ghi một đối tượng vào file ta cần có các class sau:
 * 	import java.io.File;
 *  import java.io.FileOutputStream;
 * 	import java.io.IOException;
 *  import java.io.ObjectOutputStream;
 *	import java.io.OutputStream;
 * - Cách bước để ghi được một đối tượng
 * 	OutputStream os = new FileOutputStream(f);
 *	ObjectOutputStream oos = new ObjectOutputStream(os);
 *	for (Student student : listStudent) {
 *		oos.writeObject(student);
 *	}
 *	oos.flush();
 * 	oos.close();
 * - Để đọc một tối tượng từ file ta cần có các class sau
 * - Chú ý trong class đối tượng mà muốn ghi cần phải implements lại interface Serializable
 * - Để đọc được một đối tương từ file ta cần có các class sau:
 * 	import java.io.File;
 *  import java.io.FileInputStream;
 * 	import java.io.IOException;
 *  import java.io.ObjectInputStream;
 *	import java.io.InputStream;
 *	try {
//		InputStream is = new FileInputStream(f);
//		ObjectInputStream ois =new ObjectInputStream(is);
//		Student sv = null;
//		while(true) {
//			Object oj = ois.readObject();
//			if(oj==null) {
//				break;
//			}
//			if(oj!=null) {
//				sv = (Student) oj;
//				this.listStudent.add(sv);
//			}
//		}
//		ois.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
 */
package test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import main.MangementStudent;
import main.Student;
public class Main_EX073_74_ArrayList_MangementStudent {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
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
			System.out.println("10. Write a object into file");
			System.out.println("11. Read a object from file");
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
			} else if (selection == 10) {
				File f = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX073_74_WriteObjectIntoTheFileAndReadObjectFromTheFile\\WO.txt");
				mgstd.writeStudentIntoFile(f);
			} else if (selection == 11) {
				File f = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX073_74_WriteObjectIntoTheFileAndReadObjectFromTheFile\\WO.txt");
				mgstd.readStudentFromFile(f);
			}
			System.out.println("--------------------------------------");
		} while (selection != 0);
	}
}
