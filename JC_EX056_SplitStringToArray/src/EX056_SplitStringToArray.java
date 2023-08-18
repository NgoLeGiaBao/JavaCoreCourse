import java.util.Arrays;
// Hàm split trong Java dùng để tách một chuỗi và đưa chuỗi đó vào trong một mảng mới
public class EX056_SplitStringToArray {
	public static void main(String[] args) {
		String s1 = "Hello guys, welcome back to my channel, I am Anna";
		String[] s2 = s1.split(",");
		System.out.println("String is splited basing on comma: " + Arrays.toString(s2));
		
		String s3 = "Welcome to Ton Duc Thang University";
		String[] s4 = s3.split(" ");
		System.out.println("String is splited basing on space: " + Arrays.toString(s4));

		String s5 = "Who will cook today? To know about that, we will play a game together";
		String[] s6 = s5.split("\\?|\\,");
		System.out.println("String is splited basing on question mark and comma: " + Arrays.toString(s6));
		
		String s7 = "My full name is Bao Ngo Le Gia";
		String[] s8 = s7.split(" ", 4);
		System.out.println("String is splited basing space and limited word: " + Arrays.toString(s8));
	}
}
