import java.util.Scanner;

public class Vong_Lap_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int i = 0;
		while (x != 0) {
			System.out.println("Entering 0 to exit, other number to continue");
			x = sc.nextInt();
		}
		while (true) {
			i++;
			System.out.println(i);
			if (i == 10)
				break;
		}
	}
}
