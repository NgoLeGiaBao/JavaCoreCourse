/*	Có 2 dạng ép kiểu trong Java
 * Ép kiểu ngầm định
 * Ép kiểu tường minh
 */
public class EpKieu {
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
//		Ép kiểu ngầm định (kiểu dữ liệu ban đầu phải nhỏ hơn đích)
		float c = a;
		float d = b;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
//	Ép kiểu tường minh (kiểu dữ liệu ban đầu có thể lớn hơn hoặc nhỏ hơn kiểu dữ liệu đích)
		float e = 3.5f;
		float f = 6.5f;
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		int g = (int)e;
		int h = (int)f;
		System.out.println("g = " + g);
		System.out.println("f = " + h);		
//		Ép kiểu giữa biến nguyên thủy và đối tượng
		int x = new Integer(342);
		System.out.println("x = " + x);

	}
}
