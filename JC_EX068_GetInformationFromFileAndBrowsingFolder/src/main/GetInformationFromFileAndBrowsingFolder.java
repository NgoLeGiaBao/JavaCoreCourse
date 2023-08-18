package main;

import java.io.File;

public class GetInformationFromFileAndBrowsingFolder {
	private File file;
	public GetInformationFromFileAndBrowsingFolder (String nameFile) {
		this.file = new File(nameFile);
	}
	public boolean canExcute() {
		return this.file.canExecute();
	}
	public boolean canRead() {
		return this.file.canRead();
	}
	public boolean canWrite() {
		return this.file.canWrite();
	}
	public String printPath() {
		return this.file.getAbsolutePath();
	}
	public String printFileName() {
		return this.file.getName();
	}
	public void checkFolderOrFile () {
		if (this.file.isDirectory()) {
			System.out.println("This is folder");
		} else {
			System.out.println("This is file");
		}
	}
	public String[] getSubFile () {
		String [] s = {"This is file, no data inner"};
		if (this.file.isFile()) {
			return s;
		}
		return this.file.list();
	}
	public void printFolderTree () {
		printDetailFolderTree(this.file, 1);
	}
	public void printDetailFolderTree (File f, int level) {
		for (int i = 1; i < level; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead() && f.isDirectory()) {
			File [] subFile = f.listFiles();
			for (File file : subFile) {
				printDetailFolderTree(file, level+1);
			}
		}
			
	}
}
