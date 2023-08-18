import java.util.Scanner;
public class CacPhepToanCoBan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhap so a: ");
		a = sc.nextInt();
		System.out.println("Nhap so b: ");
		b = sc.nextInt();
		int tong = a + b;
		int hieu = a - b;
		int tich = a * b;
		float thuong = (float)a / b;
		int chiaLayDu = a % b;
		System.out.println(a + "+" + b + "=" + tong);
		System.out.println(a + "-" + b + "=" + hieu);
		System.out.println(a + "*" + b + "=" + tich);
		System.out.println(a + "/" + b + "=" + thuong);
		System.out.println(a + "%" + b + "=" + chiaLayDu);
	}
}
