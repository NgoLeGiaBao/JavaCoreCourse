import java.util.Scanner;
public class CauDieuKien_GiaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a, b, result;
		System.out.println("Entering a from the keyboard: ");
		a = sc.nextDouble();
		System.out.println("Entering b from the keyboard: ");
		b = sc.nextDouble();
		
		if (a == 0) {
			if (b == 0) {
				System.out.println("The equation has infinitely many solutions");
			} else {
				System.out.println("The equation has no solution");
			}
		} else {
			result = -b / a;
			System.out.println("The equation 's solution is " + Math.round(result * 100.0)/100.0);
		}
	}
}
