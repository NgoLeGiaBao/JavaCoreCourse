import java.util.Scanner;
public class Switch_Case_Kiem_Tra_So_Ngay_Trong_Thang {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int month, year;
		System.out.println("Entering month you want to check: ");
		month = sc.nextInt();
		System.out.println("Entering year you want to check: ");
		year = sc.nextInt();
		switch (month) {
		case 1: {
			System.out.println("The Janurary has 31 days");
			break;
		}
		case 2: {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("The February of " + year + " has 29 days");
			} else {
				System.out.println("The February of " + year + " has 28 days");
			}
			break;
		}
		case 3: {
			System.out.println("The March has 31 days");
			break;
		}
		case 4: {
			System.out.println("The April has 30 days");
			break;
		}
		case 5: {
			System.out.println("The May has 31 days");
			break;
		} 
		case 6: {
			System.out.println("The June has 30 days");
			break;
		}
		case 7: {
			System.out.println("The July has 31 days");
			break;
		}
		case 8: {
			System.out.println("The August has 31 days");
			break;
		}
		case 9: {
			System.out.println("The September has 30 days");
			break;
		}
		case 10: {
			System.out.println("The October has 31 days");
			break;
		}
		case 11: {
			System.out.println("The November has 30 days");
			break;
		}
		case 12: {
			System.out.println("The December has 31 days");
			break;
		}
		default:
			System.out.println("Your data is wrong");
		}
	}
}
