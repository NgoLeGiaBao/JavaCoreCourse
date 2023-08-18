/*
 * - Set là một interface kế thừ Collection Interface trong Java. 
 * Set trong java là một Collection không thể chứa phần tử trùng lặp nhau
 * - Set được triển khai bởi Hashset, LinkedHashset, Treeset hoặc EnumSet
 * 	+ HashSet lưu trữ các phần tử của nó trong bảng băm, là cách thực hiện tốt nhất, tuy nhiên nó không đam rbòa về thứ tự các phần tử được chèn vào
 * 	+ TreeSet lưu trữ các phần của của nó trong một cây, sắp xếp các phần tử của nó 
 * dựa trên các giá trị của chúng, về cơ bản là chậm hơn HashSet
 * 	+ LinkedHashSet được triển khai dưới dạng bảng băm với có cấu trúc dữ liệu danh sách liên kết, 
 * sắp xếp các phần tử của nó dựa trên trên thứ tự chúng được chèn vào tập hợp (thứ tự chèn)
 * 	+ EnumSet là một cài đặt chuyên biệt để sử dụng với các kiểu enum
 */
package test;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import main.SweepstakesWithHashSet;
public class Main_EX064_Set_Sweepstakes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SweepstakesWithHashSet swths = new SweepstakesWithHashSet();
		int selection;
		String lotteryCode;
		do {
			System.out.println("--------------------MENU--------------------");
			System.out.println("1. Add lottery code");
			System.out.println("2. Delete lottery code");
			System.out.println("3. Check lottery code is existing in box");
			System.out.println("4. Delete all lottery code");
			System.out.println("5. A number of lotter code");
			System.out.println("6. Find winner in games");
			System.out.println("7. Print all lottery code in box");
			System.out.println("0. Exit program");
			System.out.print("Entering your selection: ");
			selection = sc.nextInt();
			sc.nextLine();
			if (selection == 1) {
				int numberLotteryCode;
				System.out.print("Enter number lottery code you want to add box: ");
				numberLotteryCode = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < numberLotteryCode; i++) {
					System.out.print("Enter lottery code: ");
					lotteryCode = sc.nextLine();
					swths.addLotteryCode(lotteryCode);
				}
			} else if (selection == 2 || selection == 3) { 
				System.out.print("Enter lottery code: ");
				lotteryCode = sc.nextLine();
				if (selection == 2) {
					swths.deleteLotteryCode(lotteryCode);
				} else {
					System.out.println("The lottery code " + lotteryCode + " exsited in box is: " + swths.lotteryCodeIsExistence(lotteryCode));
				}
			} else if (selection == 4) { 
				swths.deleteAllLotteryCode();
			}else if (selection == 5) { 
				System.out.println("A number of lottery code in box is: " + swths.getNumberLotteryCode());
			}else if (selection == 6) { 
				System.out.println("Lottery code winning is: " + swths.findWinner());
			} else if (selection == 7) { 
				System.out.print("All lottery code in box are: ");
				swths.printAllLotteryCode();
			}
			System.out.println("--------------------------------------------");
		}while (selection != 0);
	}
}
