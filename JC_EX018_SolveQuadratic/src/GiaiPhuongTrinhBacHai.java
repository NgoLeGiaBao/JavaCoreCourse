import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b, c;
		double delta, x1, x2;
		System.out.println("Entering a from the keyboard: ");
		a = sc.nextInt();
		System.out.println("Entering b from the keyboard: ");
		b = sc.nextInt();
		System.out.println("Entering c from the keyboard: ");
		c = sc.nextInt();
		
		delta = Math.pow(b, 2) - 4*a*c;
		if (delta < 0) {
			System.out.println("The quadratic equation 2: " + a + "x^2 + " + b + "x +" + c + " has no solution");
		} else if (delta == 0) {
			x1 = -b / 2*a;
			x1 = Math.round(x1 * 100.0)/100.0;
			System.out.println("The quadratic equation 2: " + a + "x^2 + " + b + "x +" + c + " has only one solution " + "x1 = x2 = " + x1);
		} else {
			x1 = (-b + Math.sqrt(delta))/ (2*a);
			x2 = (-b - Math.sqrt(delta))/ (2*a);
			x1 = Math.round(x1 * 100.0)/100.0;
			x2 = Math.round(x2 * 100.0)/100.0;
			System.out.println("The quadratic equation 2: " + a + "x^2 + " + b + "x +" + c + " has two solutions " + "x1 = " + x1 + " x2 = " + x2);
		}
	}
}
