import java.util.Scanner;

public class Switch_Case_Kiem_Tra_Thu_Ngay {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("Entering n (n > 1 && n < 9) from the keyboard: ");
		n = sc.nextInt();
		switch (n) {
		case 2: {
			System.out.println("Today is Monday");
			break;
		}
		case 3: {
			System.out.println("Today is Tuesday");
			break;
		}
		case 4: {
			System.out.println("Today is Wednesday");
			break;
		}
		case 5: {
			System.out.println("Today is Thursday");
			break;
		}
		case 6: {
			System.out.println("Today is Friday");
			break;
		}
		case 7: {
			System.out.println("Today is Saturday");
			break;
		}
		case 8: {
			System.out.println("Today is Sunday");
			break;
		}
		default:
			System.out.println("Your data is wrong");
		}
	}
}
