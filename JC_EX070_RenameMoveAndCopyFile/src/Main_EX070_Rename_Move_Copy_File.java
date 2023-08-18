import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main_EX070_Rename_Move_Copy_File {
	public static void copyAll (File f1, File f2) throws IOException {
		Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		System.out.println(f1.getName());
		if (f1.isDirectory()) {
			File [] files = f1.listFiles();
			for (File file : files) {
				File file_new = new File(f2.getAbsoluteFile() + "\\" + file.getName());
				copyAll(file, file_new);
			}
			
		}
	}
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX070_Rename_Move_Copy_File\\VD_1.txt");
		File f2 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX070_Rename_Move_Copy_File\\VD_2.txt");
		File f3 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX070_Rename_Move_Copy_File\\VD_3.txt");
		
		// Đổi tên folder/file sử dung class File
		// f1.renameTo(f2);
		// f2.renameTo(f3);
		
		// Đổi tên folder/file sử dụng class Files
		// Files.move(f2.toPath(), f3.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
		
		// Di chuyển folder/file sử dụng class Files
		// File f4 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX070_Rename_Move_Copy_File\\Folder_3\\VD_2.txt");
		// Files.move(f3.toPath(), f4.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
		// Copy folder/file sử dụng class Files (chú ý: chỉ copy được vỏ bên ngoài, không copy được phần bên trong)
		File f5 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX070_Rename_Move_Copy_File\\Folder_3");
//		File f6 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX070_Rename_Move_Copy_File\\Folder_3_copy");
//		Files.copy(f5.toPath(), f6.toPath(), StandardCopyOption.REPLACE_EXISTING);
		File f5_1 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX070_Rename_Move_Copy_File\\Folder_3_1");
		
		copyAll(f5, f5_1);
	}
}
