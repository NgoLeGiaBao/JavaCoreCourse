import java.util.Scanner;

public class CauDieuKien_TimSoChanLe {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		System.out.println("Entering a from the keyboard: ");
		a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + " is even number");
		} else {
			System.out.println(a + " is odd number");
		}
	}
}
