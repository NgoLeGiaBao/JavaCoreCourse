/*
 * Overloading (nạp chồng phương thức) được sử dụng để giúp code của chương trình đọc dễ dàng hơn
 * Nạp chồng phương thức thực hiện bên trong một class
 * Nạp chồng phương thức kiểu dữ liệu trả về có thể giống nhau, tuy nhiên tham số truyền vào phải khác nhau
 */
public class Main_EX043_Overloading {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		int arr[] = new int [] {1,2,3,4,5};
		
		System.out.println("Find integer number's max value: " + mm.findMaxValue(5, 6));
		System.out.println("Find real number's max value: " + mm.findMaxValue(5.3, 4.6));
		System.out.println("Find total from 1 to N: " + mm.totalValue(5));
		System.out.println("Find total all elements in array: " + mm.totalValue(arr));
	}
}
