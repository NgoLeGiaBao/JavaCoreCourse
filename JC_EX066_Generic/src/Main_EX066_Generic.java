/*
 * - Generic được hiểu là tham số hóa kiểu dữ liệu. Việc tham số hóa kiểu dữ liệu giúp cho lập trình viên có thể dễ bắt lỗi các kiểu dữ liệu không hợp lệm đồng thời giúp dễ dàng hơn cho việc tạo và sử dụng các class, interface, method với nhiều kiểu dữ liệu khác nhau
 * - Ký hiệu của generic:
 * 		<keyword>
 * 	- Chú ý: ta cần truyền vào là kiểu dữ liệu reference datatypes, chứ không truyền vào primitive datatypes
 * - Các tên tham số kiểu được sử dụng phổ biến nhất là:
 * 	+ E - element (được sử dụng rộng rãi bởi Java Collections Framework)
 * 	+ K - chìa khóa
 * 	+ N - số
 * 	+ T - Loại
 * 	+ V - giá trị
 * 	+ S, U, V, v.v - Loại 2, 3, 4
 */
public class Main_EX066_Generic {
	public static void main(String[] args) {
		Generic_Example_1<String> typeString = new Generic_Example_1<String>("String data type");
		Generic_Example_1<Integer> typeInteger = new Generic_Example_1<Integer>(4);
		Generic_Example_1<Double> typeDouble = new Generic_Example_1<Double>(6.5);
		
		System.out.println("String datatype is: "+ typeString.getBox());
		System.out.println("Integer datatype is: " + typeInteger.getBox());
		System.out.println("Double datatype is: " + typeDouble.getBox());
	}
}
