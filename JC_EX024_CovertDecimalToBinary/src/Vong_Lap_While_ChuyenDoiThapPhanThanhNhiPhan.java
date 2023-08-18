import java.util.Scanner;

public class Vong_Lap_While_ChuyenDoiThapPhanThanhNhiPhan {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n, remainder;
		int binary_II = 0;
		int i = 1;
		String binary = " ";
		System.out.println("Entering demical number: ");
		n = sc.nextInt();
		while (n > 0) {
			remainder = n % 2;
//			binary = remainder + binray;
			binary_II = binary_II + (i * remainder);
			n = n / 2;
			i *= 10;
		}
		System.out.println("The binary number is: " + binary_II);
		
	}
}
