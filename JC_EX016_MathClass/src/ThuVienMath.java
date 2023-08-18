import java.util.Scanner;
public class ThuVienMath {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner (System.in);
		System.out.println("Entering a from the keyboard: ");
		a = sc.nextDouble();
		System.out.println("Entering b from the keyboard: ");
		b = sc.nextDouble();
		
//		Tìm giá trị tuyệt đối
		System.out.println("|a| = " + Math.abs(a));
//		Tìm giá trị min trong 2 số
		System.out.println("Min(a,b) = " + Math.min(a, b));
//		Tìm giá trị max trong 2 số
		System.out.println("Max(a,b) = " + Math.max(a, b));
//		Làm tròn lên của một số
		System.out.println("Ceil a = " + Math.ceil(a));
//		Làm tròn dưới của một số
		System.out.println("Floor a = " + Math.floor(a));
//		Căn bậc hai của một số
		System.out.println("Sqrt(b) = " + Math.sqrt(b));
//		Hàm mũ
		System.out.println("a^b = " + Math.pow(a, b));
	}
}
