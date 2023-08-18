import java.util.Scanner;

public class ToanTuDieuKien {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		System.out.println("Entering a 's value: ");
		a = sc.nextInt();
		
		String result = (a % 2 == 0) ? "even number": "odd number";
		System.out.println(a + " is " + result);
	}
}
