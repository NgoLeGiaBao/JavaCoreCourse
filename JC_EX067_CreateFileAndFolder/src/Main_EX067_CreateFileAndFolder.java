import java.io.File;
import java.io.IOException;

/*
 * - Khi làm việc với file cần import java.io.File
 * - Các phương thức thường được sử dụng trong file:
 * 	+ boolean exists (): kiểm tra thư mục có tồn tại hay không
 * 	+ boolean mkdir (): tạo ra thư mục
 * 	+ boolean mkdirs (): tạo ra nhiều thư mục
 * 	+ boolean canExcute(): file có thể thực thi
 * 	+ boolean canRead(): file có thể đọc
 * 	+ boolean canWrite(): file có thể ghi
 * 	+ String getName(): lấy tên file
 * 	+ String getAbsolutePath(): lấy ra đường dẫn của file
 * 	+ boolean isDirectory(): kiểm tra có phải là thư mục hay không
 * 	+ boolean isFile(): kiểm tra có phải là file hay không
 * 	+ boolean renameTo (): đổi tên file
 * 	+ 
 */
public class Main_EX067_CreateFileAndFolder {
	public static void main(String[] args) throws IOException {
		/*	Chú ý:
		 * 	  + MS Windows: \ ==> \\ | Ví dụ: "C:\\Folder_1\\Folder\\file.namefile
		 * 	  + Linux, MacOS: / | Ví dụ: /Folder1/Folder2/file.namefile
		 * 	  + Khi tạo một file bắt buộc phải có:
		 * 		- try...catch
		 * 		- throws IOException
		 * 	  + Lý do: khi tạo file sẽ có một số trường hợp như sau:
		 *		- Không có quyền tạo tập tin
		 *  	- Ổ cứng bị đầy
		 *		- Đường dẫn sai
		 */
		
		// Kiểm tra folder có tồn tại hay không
		System.out.println("Check a file or a folder is exist or not: ");
		File initialFolder_1 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX067_CreateFileAndFolder");
		File initialFolder_2 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX068_GetInformationAndBroswFolder\\Main\\Class_1\\Class_1_1");
		
		System.out.println(initialFolder_1.getPath() + " in system is : " + initialFolder_1.exists());
		System.out.println(initialFolder_2.getPath() + " in system is : " + initialFolder_2.exists());
		
		
		// Khởi tạo folder
		File addFolder_1 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX067_CreateFileAndFolder\\Example");
		File addFolder_2 = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX068_GetInformationAndBroswFolder\\Main\\Class_1\\Class_1_1");
		
		addFolder_1.mkdir();
		addFolder_2.mkdirs();
		
		
		// Khởi tạo file
		File initialNewFile_1 = new File("C:\\\\Users\\\\giabao2509\\\\eclipse-workspace\\\\EX067_CreateFileAndFolder\\\\Example\\file.txt\\file_1.txt");
		initialNewFile_1.createNewFile();
	}
}
