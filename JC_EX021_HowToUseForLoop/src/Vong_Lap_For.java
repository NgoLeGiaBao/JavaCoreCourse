import java.util.Scanner;

public class Vong_Lap_For {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("Entering n from the keyboard: ");
		n = sc.nextInt();
//		Loop
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". I love you ");
		}
//		Loop reverse
		for (int i = n; i > 0; i--) {
			System.out.println(i + ". I love you, too");
		}
	}
}
