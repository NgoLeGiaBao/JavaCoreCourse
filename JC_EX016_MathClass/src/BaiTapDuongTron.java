import java.util.Scanner;

public class BaiTapDuongTron {
	public static void main(String[] args) {
		double r, perimeter, area;
		Scanner sc = new Scanner (System.in);
		System.out.println("Entering r from the keyboard: ");
		r = sc.nextDouble();
		perimeter = 2 * Math.PI * r;
		area = Math.PI * Math.pow(r, 2);
		System.out.println("Perimeter of circle = " + perimeter);
//		Cách làm tròn 
		System.out.println("Perimeter of circle = " + Math.round(perimeter));
//		Cách làm tròn để lấy được phần sau dấu phẩy
		System.out.println("Perimeter of circle = " + Math.round((perimeter * 100.0))/100.0);
		
		System.out.println("Area of circle = " + area);
		System.out.println("Area of circle = " + Math.round(area));
		System.out.println("Area of circle = " + Math.round((area * 100.0))/100.0);
	}
}
