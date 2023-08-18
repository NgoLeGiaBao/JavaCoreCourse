/* - Trong Java có 3 class có thể giúp ta ghi dữ liệu vào 1 file
 * 	+ File Writer
 * 	+ BufferedWriter
 * 	+ PrintWriter
 * - Ta thường sử dụng nhiều nhất là PrintWriter vì nó có nhiều phương thức
 * giúp ta có thể dễ dàng ghi dữ liệu
 * 
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main_EX071_WriteDataIntoFileText {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("C:\\Users\\giabao2509\\eclipse-workspace\\EX071_WriteDataIntoFileText\\WriteData.txt");
		pw.println("Hello, welcome back to my channel");
		pw.print("Value of PI number is: ");
		pw.println(3.14);
		pw.println(pw);
		
		pw.flush();
		pw.close();
	}
	
}
