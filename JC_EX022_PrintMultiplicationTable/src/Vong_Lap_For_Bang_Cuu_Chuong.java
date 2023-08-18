import java.util.Scanner;
public class Vong_Lap_For_Bang_Cuu_Chuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int start, end;
		System.out.println("Entering start to begin from multiplication table: ");
		start = sc.nextInt();
		System.out.println("Entering end to end to multiplication table: ");
		end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			System.out.println("\n");
			System.out.println("The table of " + i + ":");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j );
			}
			System.out.println("---------------");
		}
	}
}
