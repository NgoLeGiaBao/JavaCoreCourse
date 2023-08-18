import java.util.Scanner;

public class Array_Basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i;
//		Trong Java có thể khai báo mảng theo 2 cách
		double array_1[];
		double [] array_2;
/*		Trong Java có 2 cách gán dữ liệu cho từng phần tử trong mảng:
			+ Gán trực tiếp
			+ Gán thông qua người dùng nhập từ bàn phím
*/
		array_1 = new double [10];
		for (i = 0; i < array_1.length; i++) {
		
			System.out.println("a[" + i +"] = ");
			array_1[i] = sc.nextDouble();
		}
		double total = 0;
		for (i = 0; i < array_1.length; i++) {
			total += array_1[i];
		}
		System.out.println("Total of elements in array is: " + total);
		
		array_2 = new double [] {4, 5, 8, 2, 10};
		System.out.println("All elements in array 2 is: ");
		for (i = 0; i < array_2.length; i++) {
			System.out.println("a[" + i +"] = " + array_2[i]);
		}
	}
}
