/*
 * - Map là một interface đại diện cho một đối tượng chứa cách ánh xạ giữa các khóa (key) 
 * và các giá trị (value). Mỗi từ khóa chứa tương ánh một giá trị. 
 * Một trong các ví dụ tiêu biêu là danh bạ điện thoại, số điện thoại, 
 * tên người là giá trị, mỗi khóa chỉ tương ứng với một giá trị
 * - Map được triển khai bởi các class HashMap, TreeMap, LinkedHasMap:
 * 	+ HashMap: sẽ sắp xếp mảng dựa value
 * 	+ TreeMap: sẽ sắp xếp mảng dựa trên key;
 * 	+  LinkedHasMap: được triển khai dưới dạng bảng băm với có cấu trúc dữ liệu danh sách liên kết, 
 * sắp xếp các phần tử của nó dựa trên trên thứ tự chúng được chèn vào tập hợp (thứ tự chèn)
 */
package test;

import java.util.Dictionary;
import java.util.Scanner;

import main.DictionaryWithHashMap;

public class Main_EX065_Dictionary {
	public static void main(String[] args) {
		DictionaryWithHashMap dtnr = new DictionaryWithHashMap();
		Scanner sc = new Scanner(System.in);
		int selection, numberWord;
		String key, value;
		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Add a word into dictionary");
			System.out.println("2. Delete a word");
			System.out.println("3. Find value from key");
			System.out.println("4. Print all Key");
			System.out.println("5. Get number words in dictionary");
			System.out.println("6. Delete all words in dictionary");
			System.out.println("0. Exit to program");
			System.out.print("Enter your selection: ");
			selection = sc.nextInt();
			sc.nextLine();
			if (selection == 1) {
				System.out.print("Enter numbers word you want to add into dictionary: ");
				numberWord = sc.nextInt();
				sc.nextLine();
				for (int i = 0 ; i < numberWord; i++) {
					System.out.print("Enter key from the keyboard: ");
					key = sc.nextLine();
					System.out.print("Enter value corresponding key: ");
					value = sc.nextLine();
					dtnr.addWord(key, value);
				}
			} else if (selection == 2) {
				System.out.print("Enter numbers keys you want to delete from dictionary: ");
				numberWord = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < numberWord; i++) {
					System.out.print("Enter key from the keyboard: ");
					key = sc.nextLine();
					dtnr.deleteAWord(key);
				}
			} else if (selection == 3) {
				System.out.print("Entering key you want to find in dictionary: ");
				key = sc.nextLine();
				System.out.println("The value corresponding key you enter from the keyboard is: " + dtnr.findValueFromKey(key));
			} else if (selection == 4) {
				dtnr.printAllKey();
			} else if (selection == 5) {
				System.out.println("The number of words in dictionary is: " + dtnr.getNumberWord());
			} else if (selection == 6) {
				dtnr.deleteAllWord();
			}
		} while (selection != 0);
	}
}
