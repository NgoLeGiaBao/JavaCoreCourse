import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
/*
 * - Trong Java, có 2 class hỗ trợ việc đọc file:
 * 	+ BufferedReader
 * 	+ Files
 * - Khi đọc những file có kích thước lớn thì nên dùng BufferedReader, vì khi sử dụng Files
 * nó sẽ ngốn rất nhiều Ram của máy tính
 */
public class Main_EX072_ReadDataFromFileText {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\giabao2509\\eclipse-workspace\\EX072_ReadDataFromFileText\\File_1.txt");
		/* Cách 1 sử dụng BufferedReader
		BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
		
		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			} else {
				System.out.println(s);
			}
		}
		*/
		
		/* Cách 2 sử dụng Files
		List<String> arrString = new ArrayList<>();
		arrString = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
		for (String string : arrString) {
			System.out.println(string);
		}
		*/
	}
}
