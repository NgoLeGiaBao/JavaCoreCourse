import java.util.Scanner;

/**
 * Try - Catch - Finally dùng để bắt lỗi người dùng khi người dùng nhập sai dữ liệu,
 * nếu người dùng nhập sai dữ liệu thì những câu lệnh sau nó vẫn được thực hiện bình thường
 * - Try để người dùng nhập dữ liệu
 * - Catch để kiểm tra nếu người dùng đã nhập đúng thì bỏ qua câu khối lệnh này,
 * nếu nhập sai thì sẽ thực hiên khối lệnh này
 * - Finally dù kết quả có đúng hay sai thì khối lệnh vẫn được thực hiện
 */
public class Try_Catch_Finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = 0;
		int data;
		try {
			System.out.println("Entering n from the keyoard: ");
			n = sc.nextInt();
			data = n / 0;
		} catch (Exception e) {
			System.out.println("Data is wrong");
		} finally {
			System.out.println("Finally!");
		}
		System.out.println("The value of n is " + n);
		System.out.println("Ending up programming");
	}
}
