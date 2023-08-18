import java.util.Scanner;
public class Vong_Lap_Do_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		do {
			System.out.println("Entering n from the keyboard (n > 0): ");
			n = sc.nextInt();
		} while (n <= 0);
	}
}
