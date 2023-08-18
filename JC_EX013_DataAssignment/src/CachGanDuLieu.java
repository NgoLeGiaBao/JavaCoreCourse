import java.util.Scanner;

public class CachGanDuLieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a;
		System.out.println("Nhap gia tri a ");
//		Gán giá trị a
		a = sc.nextFloat();
		System.out.println("a = " + a);
		
//		a += 3 <==> a = a + 3;
		a += 3;
		System.out.println("a += 3 co gia tri: " + a);
		
//		a -= 2 <==> a = a - 2;
		a -= 2;
		System.out.println("a -= 2 co gia tri: " + a);
		
//		a *= 4 <==> a = a * 4;
		a *= 4;
		System.out.println("a *= 4 co gia tri: " + a);
		
//		a /= 4 <==> a = a / 4;
		a /= 4;
		System.out.println("a /= 4 co gia tri: " + a);
		
//		a %= 4 <==> a = a % 4;
		a %= 4;
		System.out.println("a %= 4 co gia tri: " + a);
	}
}
