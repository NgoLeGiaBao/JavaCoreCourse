package test;

import java.util.Arrays;
import java.util.Scanner;

import main.GetInformationFromFileAndBrowsingFolder;

public class Main_EX068_GetInformationFromFileAndBrowsingFolder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selection;
		String nameFile;
		System.out.print("Enter file name from the key board: ");
		nameFile = sc.nextLine();
		GetInformationFromFileAndBrowsingFolder gff = new GetInformationFromFileAndBrowsingFolder(nameFile);
		do {
			System.out.println("---------------MENU---------------");
			System.out.println("1. Check file can excute or not?");
			System.out.println("2. Check file can read or not?");
			System.out.println("3. Check file can write or not?");
			System.out.println("4. Print path");
			System.out.println("5. Print file's name");
			System.out.println("6. Check is folder or file?");
			System.out.println("7. Print subfile list");
			System.out.println("8. Print tree folder");
			System.out.println("0. Exit to program");
			System.out.print("Enter your selection: ");
			selection = sc.nextInt();
			sc.nextLine();
			if (selection == 1) {
				System.out.println("File can excute is: " + gff.canExcute());
			} else if (selection == 2) {
				System.out.println("File can read is: " + gff.canRead());
			} else if (selection == 3) {
				System.out.println("File can write is: " + gff.canWrite());
			} else if (selection == 4) {
				System.out.println("The path of file is: " + gff.printPath());
			} else if (selection == 5) {
				System.out.println("The name of file is: " + gff.printFileName());
			} else if (selection == 6) {
				gff.checkFolderOrFile();
			} else if (selection == 7) {
				System.out.println("All sub file's " + gff.printFileName() + " is: " + Arrays.toString(gff.getSubFile()));
			} else if (selection == 8) {
				gff.printFolderTree();
			}
		} while (selection != 0);
	}
}
