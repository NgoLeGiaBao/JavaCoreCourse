import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
/*
 * - Stack (ngăn sếp) hoạt động dựa trên nguyên tắc "First in, last out"
 * - Cách khai báo Stack:
 * 		Stack <Object/Not> nameVariable = new Stack<Object/Not>();
 * - Các phương thức thường dùng trong stack
 * 	+ nameVariable.push("giatri") => đưa giá trị vào stack
 	+ nameVariable.pop() => lấy giá trị ra, xóa khỏi stack
	+ nameVariable.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
	+ nameVariable.clear(); => xóa tất cả phần tử trong stack
	+ nameVariable.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
	+ nameVariable.size() => độ lớn của stack
 */
public class Main_EX062_Stack {
	public static void main(String[] args) {
		Stack<String> stackString = new Stack<String>();
		String fullName;
		Scanner sc = new Scanner(System.in);
		System.out.print("Entering full name: ");
		fullName = sc.nextLine();
		String[] s = fullName.split(" ");
		System.out.println(Arrays.toString(s));
		for (int i = 0; i < s.length; i++) {
			stackString.push(s[i]);
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(stackString.pop());
		}
		Stack<Integer> stackInteger = new Stack<Integer>();
		int number;
		System.out.print("Entering number: ");
		number = sc.nextInt();
		int n = number;
		int count, remainder;
		while (number > 0) {
			remainder = number % 2;
			stackInteger.add(remainder);
			number /= 2;
		}
		System.out.print(n + " written binary number is: " );
		count = stackInteger.size();
		for (int i = 0; i < count; i++) {
			System.out.print(stackInteger.pop());
		}
		
	}
}
