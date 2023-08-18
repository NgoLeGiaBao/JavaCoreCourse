import java.util.Arrays;
import java.util.Scanner;

/*
 * - Mảng là một cấu trúc giữ không hoặc nhiều giá trị cùng kiểu dữ liệu
 * - Chiều dài của mảng phải được xác đinhk khi khởi tạo mảng và không thay đổi --> mảng là 1 cấu trúc fix-length
 * - Các phần tử trong mảng có thể là: 
 * 	. primitive datatype
 * 	. reference datatype
 * - Lưu trữ và truy xuất các phần tử theo chỉ mục
 * - Là lớp con của Object và hiện thực 2 interfaces Seriablizable và Cloneable
 * - Một số đặc tính của mảng:
 * 	. random access
 * 	. linear lookup
 * - Các cách khai báo mảng
 * 	. type[] arrayName;
 * 	. int[] anArray = new int[];
 * 	. int[] anArray;
 * 	. float[] anArrayOfFloats;
 * 	. boolean[] anArrayOfBoolean;
 * 	. Object[] anArrayOfObject;
 * 	. String[] anArrayOfString;
 * - Khởi tạo mảng
 * 	. new elementType[arraySize]
 * - Khởi tạo giá trị mảng
 * 	. boolean[] answers = {true, false, true};
 * - Ví dụ:
 * 	. String names[] = new String[3];
 * 	  names[0] = "Lenoardo";
 * 	  names[1] = "da";
 * 	  names[2] = "Vinci";
 * 	. String names[] = {"Lenoardo", "da", "Vinci"};
 * 	. String names[] = new String[] {"Lenardo", "da", "Vinci"};
 * 	==> Cả 3 cách tạo mảng trên là đều được chấp nhận trong Java
 * - Ghi chú:
 * 	. Mảng rỗng thì chiều dài của nó bằng 0, lúc này không truy xuất được các phần tử mảng
 * 	. Sau khi khởi tạo, biến mảng sẽ tham chiếu tới phần tử đầu tiên trong mảng
 * - Mảng hiều chiều
 * 	. Khi mỗi phẩn tử trong mảng tham chiếu tới một mảng khác --> bạn cần tới mảng đa chiều
 * 	. Chỉ cần thêm 1 cặp [] khi muốn có thêm 1 chiều
 * 		int coordinates[][];
 * 		coordinates[0][0] = 2;
 * - Ví dụ:
 * 	int[][] myArray = new int [3][];
 * 	myArray[0] = new int[2];
 * 	myArray[0][0] = 6;
 * 	myArray[0][1] = 7;
 * 	myArray[1] = new int [3];
 * 	myArray [1][0] = 9;
 * 	myArray [1][1] = 8;
 * 	myArray [1][2] = 5;
 * - Các cách sao chép dữ liệu trên mảng
 * 	. Sử dụng toán tử gán:
 * 		cả hai mảng cùng tham chiếu tới 1 đối tượng mảng --> khi thay đổi thì cả 2 cùng thay đổi --> copy tham chiếu
 * 	. Sử dụng hàm system.arraycopy():
 * 		hai biến mảng tham chiếu tới 2 đối tượng mảng khác nhau --> khi thay đổi trên mảng này sẽ không ảnh hưởng tới mảng kia --> copy nổi dung
 * 	. Sử dụng hàm clone()
 * 		hai biến mảng tham chiếu tới 2 đối tượng mảng khác nhau --> khi thay đổi trên mảng này sẽ không ảnh hưởng tới mảng kia --> copy nổi dung
 */
public class Main_EX053_Array_HowToCopyArray {
	public static void main(String[] args) {
		// Kiểu dữ liệu nguyên thủy (primitive datatype)
		int[] myArrayOriginal = new int [] {1,9,8,7};
		System.out.println("Original Array is: " + Arrays.toString(myArrayOriginal));

		
		// Sử dụng toán tử gán;
		int[] myArrayFirst = myArrayOriginal;
		myArrayFirst[0] = 10;
		System.out.println("Using assignment:");
		System.out.println("Original Array after using assignmet is: " + Arrays.toString(myArrayOriginal));
		System.out.println("First Array is: " + Arrays.toString(myArrayFirst));
		System.out.println("------------------------------------------");
		
		
		// Sử dụng hàm clone ()
		int[] myArraySecond = myArrayOriginal.clone();
		myArraySecond[0] = 20;
		System.out.println("Using clone() method:");
		System.out.println("Original Array after using clone() is: " + Arrays.toString(myArrayOriginal));
		System.out.println("Second Array is: " + Arrays.toString(myArraySecond));
		System.out.println("------------------------------------------");
		
		
		// Sử dụng hàm System.arraycopy
		int[] myArrayThird = new int[myArrayOriginal.length];
		System.arraycopy(myArrayOriginal, 0, myArrayThird, 0, myArrayOriginal.length);
		myArrayThird[0] = 40;
		System.out.println("Using System.arraycopy method:");
		System.out.println("Original Array after using System.arraycopy is: " + Arrays.toString(myArrayOriginal));
		System.out.println("Third Array is: " + Arrays.toString(myArrayThird));
		System.out.println("------------------------------------------");
		
		// Kiểu dữ liểu đối tượng (reference datatype)
		String[] myArrayObject = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Entering string from the keyboard: ");
		for (int i = 0; i < myArrayObject.length; i++) {
			System.out.println("s[" + i + "] = ");
			myArrayObject[i] = sc.nextLine();
		}
		System.out.println("Object Array is: " + Arrays.deepToString(myArrayObject));
		
		
		// Sử dụng toán tử gán
		String[] myArrayAssigned = new String[myArrayObject.length];
		myArrayAssigned = myArrayObject;
		myArrayAssigned[3] = "TomDean";
		System.out.println("Using assignment:");
		System.out.println("Object Array after using assignmet is: " + Arrays.toString(myArrayObject));
		System.out.println("Assignment Array is: " + Arrays.toString(myArrayAssigned));
		System.out.println("------------------------------------------");
		
		
		// Sử dụng hàm clone()
		String[] myArrayClone = myArrayObject.clone();
		myArrayClone[3] = "EdenHazard";
		System.out.println("Using clone() method:");
		System.out.println("Object Array after using clone() is: " + Arrays.toString(myArrayObject));
		System.out.println("Clone Array is: " + Arrays.toString(myArrayClone));
		System.out.println("------------------------------------------");
		
		
		// Sử dụng hàm System.arraycopy
		String[] myArrayCopy = new String[myArrayObject.length];
		System.arraycopy(myArrayObject, 0, myArrayCopy, 0, myArrayObject.length);
		myArrayCopy[3] = "Dressel";
		System.out.println("Using System.arraycopy method:");
		System.out.println("Object Array after using System.arraycopy is: " + Arrays.toString(myArrayObject));
		System.out.println("Copy Array is: " + Arrays.toString(myArrayCopy));
		System.out.println("------------------------------------------");
		
	}
}
