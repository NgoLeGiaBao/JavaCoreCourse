import java.util.Scanner;

public class CacPhepToanSoSanh {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b;
		System.out.println("Nhap a tu ban phim: ");
		a = sc.nextInt();
		System.out.println("Nhap b tu ban phim: ");
		b = sc.nextInt();
		
//		Các phép toán so sánh ==> giá trị của chúng sẽ trả về true hoặc false
		System.out.println(a + " == " + b + " is " + (a==b));
		System.out.println(a + " != " + b + " is " + (a!=b));
		System.out.println(a + " > " + b + " is " + (a > b));
		System.out.println(a + " >= " + b + " is " + (a >= b));
		System.out.println(a + " < " + b + " is " + (a < b));
		System.out.println(a + " <= " + b + " is " + (a <= b));
		System.out.println("Ca a va b deu la so chan: " + (a % 2 == 0 && b % 2 == 0));
		System.out.println("Hoac a hoac b la so chan: " + (a % 2 == 0 || b % 2 == 0));
	}
}
