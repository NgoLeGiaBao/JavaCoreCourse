/*
 * Interface là gì?
 * - Một Interface trong java là một bản thiết kế của một lớp
 * - Nó chỉ có các phương thức trừu tượng và các hằng số
 * - Tất cả các hằng số được mặc định ở dạng public static final
 * - Tất cả các phương thức là ở dạng pulic
 * - Tương tự với abstract, nó không thể khởi tạo thành đối tượng
 * Mục đích: Để thu được tính trừu tượng hoàn toàn và đa kế thừa trong java
 * Lưu ý:
 * - Một lớp có thể triển khai một hoặc nhiều interface tại một thời điểm
 * - Một interface có thể kế thừa từ một interface khác, tương tự với một lớp
 * có thể kế thừa từ một lớp khác
 */

public class Main_EX046_Interface {
	public static void main(String[] args) {
		//	Answer a	
		//	CaculatorInterface cal1 = new CasioFX500Caculator(); có thể khởi đối tượng vậy hoặc có thể khởi tạo
		CasioFX500Caculator CsFX500 = new CasioFX500Caculator();
		Vinalcal500MSCaculator Vn500MS = new Vinalcal500MSCaculator();
		
		System.out.println("Answer a is:");
		System.out.println("Test Casio FX 500");
		System.out.println("Add caculator: 5.0 + 9.0 = " + CsFX500.add(5, 9));
		System.out.println("Sub caculator: 5.0 - 9.0 = " + CsFX500.subtract(5, 9));
		System.out.println("Times caculator: 5.0 * 9.0 = " + CsFX500.times(5, 9));
		System.out.println("Divide caculator: 5.0 + 2.0 = " + CsFX500.divide(5, 2));


		System.out.println("Test Vinalcal 500 MS");
		System.out.println("Add caculator: 5.0 + 9.0 = " + Vn500MS.add(5, 9));
		System.out.println("Sub caculator: 5.0 - 9.0 = " + Vn500MS.subtract(5, 9));
		System.out.println("Times caculator: 5.0 * 9.0 = " + Vn500MS.times(5, 9));
		System.out.println("Divide caculator: 5.0 + 2.0 = " + Vn500MS.divide(5, 2.0));
		
		System.out.println("-----------------------------------------");
		System.out.println("Answer b is:");
		
		//	Answer b
		double []arr_1 = new double[] {5,1,3,4,5,8,0};
		double []arr_2 = new double[] {6,2,7,9,2,6,4,5};
		
		SelectionSort slc = new SelectionSort();
		
		System.out.println("Sort ascendant by slection sort: ");
		slc.ascendantSort(arr_1);
		for (int i = 0; i < arr_1.length; i++) {
			System.out.print(arr_1[i] + " ");
		}
		System.out.println();
		System.out.println("Sort descendant by slection sort: ");
		slc.descendantSort(arr_1);
		for (int i = 0; i < arr_1.length; i++) {
			System.out.print(arr_1[i] + " ");
		}
		
		BubbleSort bbl = new BubbleSort();
		System.out.println();
		System.out.println("Sort ascendant by bubble sort: ");
		bbl.ascendantSort(arr_2);
		for (int i = 0; i < arr_2.length; i++) {
			System.out.print(arr_2[i] + " ");
		}
		System.out.println();
		System.out.println("Sort descendant by bubble sort: ");
		bbl.descendantSort(arr_2);
		for (int i = 0; i < arr_2.length; i++) {
			System.out.print(arr_2[i] + " ");
		}

		//	Answer c
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("Answer c is:");
		
		SoftwareComputer sftcmp = new SoftwareComputer();
		
		System.out.println("Add caculator: 5.0 + 9.0 = " + sftcmp.add(5, 9));
		System.out.println("Sub caculator: 5.0 - 9.0 = " + sftcmp.subtract(5, 9));
		System.out.println("Times caculator: 5.0 * 9.0 = " + sftcmp.times(5, 9));
		System.out.println("Divide caculator: 5.0 + 2.0 = " + sftcmp.divide(5, 2.0));
		
		double arr_3[] = new double[] {9,10,3,5,1,20,5};
		sftcmp.ascendantSort(arr_3);
		System.out.println("Array is ascendant is: ");
		for (int i = 0; i < arr_3.length; i++) {
			System.out.print(arr_3[i] + " ");
		}
		System.out.println();
		sftcmp.descendantSort(arr_3);
		System.out.println("Array is descendant is: ");
		for (int i = 0; i < arr_3.length; i++) {
			System.out.print(arr_3[i] + " ");
		}	
		
	}
}
