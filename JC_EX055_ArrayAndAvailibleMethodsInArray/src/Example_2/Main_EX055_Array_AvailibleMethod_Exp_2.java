/*
 * Hàm sort object được so sánh dựa trên hàm compareTo trong infterface Comparable,
 * vì thế khi sort object ta cần tạo ra một hàm compareTo để sort chúng
 */
package Example_2;
import java.util.Arrays;
import java.util.Scanner;

public class Main_EX055_Array_AvailibleMethod_Exp_2 {
	public static void main(String[] args) {
		Student std1 = new Student("52200052", "Ngo Le Gia Bao", 9);
		Student std2 = new Student("52100034", "Tran Nhut An", 8);
		Student std3 = new Student("52200034", "Bui Nhut Phuc", 6);
		Student std4 = new Student("52200085", "Tran Thanh Huyen", 10);

		
		Student[] studentArray = new Student[] {std1,std2,std3};
		Arrays.sort(studentArray);
		System.out.println("Student array is rearranged based on student's name is: " + Arrays.deepToString(studentArray));
		System.out.println("Student: " + std3 + " is found in array at position: "+ Arrays.binarySearch(studentArray, std3));
		System.out.println("Student: " + std4 + " is found in array at position: "+ Arrays.binarySearch(studentArray, std4));
	}

}
