import java.util.Scanner;
public class CacPhepToanMotNgoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		boolean b = true;
		System.out.println("Nhap gia tri a: ");
		a = sc.nextInt();
		System.out.println("-a ==> gia tri: " + (-a));
		System.out.println("+a ==> gia tri: " + (+a));
		System.out.println("!b ==> gia tri: " + (!b));
		
		System.out.println("a = " + a);
		System.out.println("++a = " + (++a));
		System.out.println("a++ = " + (a++));
		System.out.println("a = "+ a);

		System.out.println("--a = " + (--a));
		System.out.println("a-- = " + (a--));
		System.out.println("a = "+ a);
	}
}
