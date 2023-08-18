import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
/*
 * Trong bài này ta sẽ tìm hiểu về các class sau:
 * 	+ Class random dùng để lấy ra được một con số ngẫu nhiên (có thể là số thực, số nguyên...,)
 * 	+ Class locale dùng để định dạng ra được vị trí (ví dụ như Việt Nam, Hoa Kỳ...,)
 * 	+ Class Numberformat dùng NumberFormat nmf = NumberFormat.getCurrencyInstance(lc); để lấy được tiền tệ
 */
/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyề đặt cược số tiền ít hơn hoặc bằng số tiên fhọ đnag có
 * Luật chơi như sau:
 *	Có 3 viên xúc xắc. Mỗi viên xúc có 6  mặt có giá trị từ 1 đến 6. Mỗi lần sẽ lắc ra một kết quả. Kết quả = giá trị xx1 + xx2 + xx3 
 * 	1. Nếu tổng bằng = 3 hoặc 18 ==> cái ăn hết, người chơi thua
 * 	2. Nếu tổng (4->10) <-> xỉu ==> nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 	3. Nếu tổng (11->17) <-> tài ==> nếu người chơi đặt tài thì người chơi thắng, ngược lại thua
 */
public class Main_EX057_Random_NumberFormatClass_MiniGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale lc = new Locale("en", "US");
		NumberFormat nmf = NumberFormat.getCurrencyInstance(lc);
		double playerAccount = 5000;
		double moneyBet;
		int selectionOfPlayer, expectedYourNumber, firstDice, secondDice, thirdDice, totalThreeDice;
		do {
			System.out.println("------PLEASE ENTERING YOUR SELECTION------");
			System.out.println("Entering number one (1) to start game");
			System.out.println("Entering ohter number one (1) to exit");
			System.out.print("Entering your selection: ");
			selectionOfPlayer = sc.nextInt();
			if (selectionOfPlayer == 1) {
				do {
					System.out.println("A mount of money you have at the moment is: " + nmf.format(playerAccount));
					System.out.print("Entering amount of money you want to bet (Note: Money must be smaller or euqals your account you has: ");
					moneyBet = sc.nextDouble();
				} while (moneyBet > playerAccount);
				do {
					System.out.print("Entering your expected number (Note: (1 <-> XIU) AND (2<->TAI): ");
					expectedYourNumber = sc.nextInt();
				} while (expectedYourNumber != 1 && expectedYourNumber != 2);
				Random rd = new Random();
				firstDice = rd.nextInt(6) + 1;
				secondDice = rd.nextInt(6) + 1;
				thirdDice = rd.nextInt(6) + 1;
				totalThreeDice = firstDice + secondDice + thirdDice;
				System.out.println("The value of each dice in turn is: " + firstDice + " - " + secondDice + " - " + thirdDice);
				if (totalThreeDice == 18 || totalThreeDice == 3) {
					playerAccount -= moneyBet;
					System.out.println("You are loss");
				} else if (totalThreeDice >= 4 && totalThreeDice <= 10) {
					if (expectedYourNumber == 1) {
						playerAccount += moneyBet;
						System.out.println("You are win");
					} else {
						playerAccount -= moneyBet;
						System.out.println("You are loss");
					}
				} else {
					if (expectedYourNumber == 2) {
						playerAccount += moneyBet;
						System.out.println("You are win");
					} else {
						playerAccount -= moneyBet;
						System.out.println("You are loss");
					}
				}
				System.out.println("Money in your account is: " + nmf.format(playerAccount));
				System.out.println("--------------------------------------------");
			}
		} while (selectionOfPlayer == 1);
	}
}
