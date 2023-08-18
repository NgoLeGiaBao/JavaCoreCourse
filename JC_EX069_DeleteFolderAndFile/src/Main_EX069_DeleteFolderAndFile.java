import java.io.File;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main_EX069_DeleteFolderAndFile {
	public static void folderTree (File f, int level) {
		for (int i = 1; i < level; i++) {
			System.out.print("\t");
		}
		System.out.print("|_");
		System.out.println(f.getName());
		if (f.canRead() && f.isDirectory()) {
			File [] subFile = f.listFiles();
			for (File file : subFile) {
				folderTree(file, level+1);
			}
		}
	}
	public static void deleteFolder (File f){
		if (f.isFile()) {
			f.delete();
			System.out.println(f.getName());
		} else {
			File [] subFile = f.listFiles();
			for (File file : subFile) {
				deleteFolder(file);
			}
			System.out.println(f.getName());
			f.delete();
		}
	}
	public static void deleteFolder_2 (File f) throws IOException {
		if (f.isFile()) {
			Files.delete(f.toPath());
		} else {
			File [] subFile = f.listFiles();
			deleteFolder(f);
		}
		Files.delete(f.toPath());
		
	}
	public static void main(String[] args) throws IOException {
		File folder_1 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX069_DeleteFolderAndFile\\Folder_1");
		File folder_2 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX069_DeleteFolderAndFile\\Folder_2");
		File file_1 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX069_DeleteFolderAndFile\\File_1.txt");
		folderTree(folder_1, 1);
//		folder_1.delete();
//		file_1.delete();
//		System.out.println(file_1.isFile());
//		folder_2.delete();
//		System.out.println(folder_3.canWrite());
//		folder_3.deleteOnExit();
//		deleteFolder(folder_1);
//		System.out.println(folder_3.exists());
//		file_1.createNewFile();
//		System.out.println(file_1.exists());
//		file_1.delete();
		
//		Path p = folder_2.toPath();
//		Files.deleteIfExists(p);
	}
}
