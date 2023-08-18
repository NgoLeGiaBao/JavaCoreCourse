/*
 * - Sự khá nhau giữa hàm có static and hàm không có static:
 * 	. Hàm có static có thể gọi trực tiếp bằng việc lấy className.method
 * 	. Hàm không có static thì phải khởi tạo đối tượng trước khi gọi hàm
 */
package Example_1;
import java.util.Arrays;
import java.util.Scanner;

public class Main_EX055_Array_AvailibleMethod_Exp_1 {
	public static int [] reverseArray (int [] intinialArray) {
		int[] reverseArray = new int [intinialArray.length];
		for (int i = 0; i < intinialArray.length; i++) {
			reverseArray[i] = intinialArray[intinialArray.length-i-1];
		}
		return reverseArray;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] originalArray = new int [] {3,1,9,8,10,5,7};
		double [] fillValueArray = new double [7];
		
		
		// Sort array
		System.out.println("Original Array is: " + Arrays.toString(originalArray));
		Arrays.sort(originalArray);
		System.out.println("Original Array after sorting is: " + Arrays.toString(originalArray));
		
		
		// Binanry Search
		int key;
		System.out.println("Entering value you want to search from the keyboard: ");
		key = sc.nextInt();
		System.out.println("The value " + key + " is found in original array at postion: " + Arrays.binarySearch(originalArray, key));
		
		
		// Fill in value;
		Arrays.fill(fillValueArray, 5.1);
		System.out.println("Fill Value Array is: " + Arrays.toString(fillValueArray));
		
		
		// Reverse array
		int[] reverseArray = new int [originalArray.length];
		reverseArray = reverseArray(originalArray);
		System.out.println("Sort Array in deascending is: " + Arrays.toString(reverseArray));

	}

}
