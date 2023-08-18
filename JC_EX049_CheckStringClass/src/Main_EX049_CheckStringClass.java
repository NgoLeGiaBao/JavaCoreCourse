import java.util.Scanner;
/*
 * - Java hỗ trợ Unicode --> mỗi ký tự dài 16 bit
 * - Trong Java chuỗi có 3 cách thể hiện:
 * 	+ String: bất biến
 * 	+ StringBuffer: khả biến, multi-thread
 * 	+ StringBuilder: khả biến, single-thread
 * - Đều là các đối tượng không phải mảng ký tự
 * - char có độ dài bằng 2 bytes và chứa các số nguyên không dấu
 * - Hằng ký tự được biểu hiện bằng dấu nháy đơn
 * - Bạn cũng có thể nhập các ký tự bằng dãy escape seqence \ uxxx chỉ thứ tự thập lục phân
 * 		char c = '\u0a76';
		System.out.println(c);		
 * - Lớp string:
 * 	+ Áp dụng cho chuỗi có độ dài cố định, không đổi trong quá trình chạy
 * 	+ Đối tượng string không đổi được
 * 	+ Có 2 cách tạo chuỗi
 * 		. String s = new String ();
 * 		. String s = "Hello World";
 * 	+ Chú ý:
 * 		. Ký tự trong Java là ký tự 16 bit, không phải ASCII 8 bit
 * 		. Các encoding (charset): các chế độ mã hóa ký tự nền được sử dụng trong hệ thống để chuyển đổi ký tự ASCII thành Unicode
 * 			Ví dụ: UTF-8, UTF-16, US-ASCII, ISO-8859-1,...
 * - Các phương thức chuỗi string
 * 	+ Phương thức kiểm tra lớp string:
 * 		. length(): in ra độ dài của chuỗi (trả về int)
 * 		. charAt(): giúp lấy ra ký tự tại vị trí bất kỳ (vị trí < độ dài chuỗi)
 * 		. getChars(): lấy hàng loạt ký tự đưa vào mảng mới, có 4 tham số bắt đầu (vị trí bắt đầu, vị trí kết thúc, mảng mới, vị trí bắt đầu tại mảng mới), lưu ý vị trí kết thúc sẽ - 1
 * 		. getBytes(): lấy ra số thứ tự trong bảng mã assci của ký tự đó
 * 		. hashCode():
 * 	+ Phương thức so sánh lớp String
 * 		. equals(): kiểm tra hai chuỗi xem có bằng nhau không (phân biệt chữ hoa và chữ thường), trả về kiểu dữ liệu boolean
 * 		. equalsIgnoreCase (): kiểm tra chuỗi có bằng nhau không (nhưng không phân biệt chữ hoa và chữ thường), trả về kiểu dữ liệu boolean
 * 		. compareTo(): so sánh 2 chuỗi với nhau (có phân biệt chữ hoa và chữ thường)
 * 		. compareToIgnoreCase (): so sánh 2 chuỗi với nhau (không phân biệt chữ hoa và chữ thường)
 * 		. Cả compareTo() và compareToIgnoreCase () sẽ trả về 3 trường hợp:
 * 			Nếu là số âm thì chuỗi string < another string
 * 			Nếu = 0 thì chuỗi string = another string
 * 			Nếu là số dương thì chuỗi string > another string
 * 			Sẽ so sánh ký tự lần lượt từ phải sang trái
 * 		. regionMatches(): so sánh một đoạn trong chuỗi này với một đoạn trong chuỗi khác, trả về kiểu dữ liệu boolean
 *		. startWith (): hàm kiểm tra chuỗi có bắt đầu bằng một chuỗi ký tự khác không, trả về kiểu dữ liệu boolean 
 * 		. endWith (): hàm kiểm tra chuỗi có kết thúc bằng một chuỗi ký tự khác không, trả về kiểu dữ liệu boolean 	
 * 	+ Phương thức tìm kiếm chuỗi lớp string
 * 		. indexOf (): hàm kiểm tra ký tự hoặc một chuỗi có nằm trong chuỗi đó hay không, hàm trả về vị trí đầu tiên nó xuất hiện, nếu không tìm thấy thì sẽ trả về giá trị -1
 * 		. lastIndexOf(): tương tự hàm indexOf, tuy nhiên nó sẽ tìm kiếm chuỗi từ phải sang trái
 * 	+ Phương thức xử lý chuỗi lớp string (thêm, xóa, sửa, thay thế ....,): chú ý khi sử dụng các phương thức bên dưới cần tạo ra một biến để gán giá trị, vì giá trị sẽ không được lương vào biến ban đầu
 * 		. concat (): dùng để nối 2 chuỗi lại với nhau
 * 		. replace (): dùng để thay thế một chuỗi/ một ký này thành một chuỗi/ một ký tự khác
 * 		. trim (): dùng để xóa những khoảng trắng dư thừa ở trước và sau chuỗi
 * 		. substring (): dùng để cắt một chuỗi thành chuỗi con;
 */
public class Main_EX049_CheckStringClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Entering a string from the keyboard: ");
		s = sc.nextLine();
		System.out.println("String's is: " + s);
		
		
		// length()
		System.out.println("The length of string is: " + s.length());
		
		
		// charAt()
		int len = s.length();
		for (int i = 0; i < len; i++) {
			System.out.println("Character at " + i + " is: " + s.charAt(i));
		}
		System.out.println("----------------------------");
		
		
		// getChars()
		char[] arrChar = new char [10];
		s.getChars(4, 6, arrChar, 0);
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println("Character at " + i + " is: " + arrChar[i]);
		}
		System.out.println("----------------------------");
		
		
		// getBytes
		byte[] arrByte = s.getBytes();
		for (byte b : arrByte) {
			System.out.println(b + " ");
		}
	}
}
