
public class MyDate {
	private int day;
	private int month;
	private int year;
	
/*	Trong mọi bài toán ta đều phải khai báo thêm constructor, 
 * và tên class của constructor phải giống với tên class mà ta khởi tạo
 */
	public MyDate (int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	public void printDay () {
		System.out.println("Day: " + this.day);
	}
	public void printMonth () {
		System.out.println("Month: " + this.month);
	}
	public void printYear () {
		System.out.println("Year: " + this.year);
	}
	public void printDate () {
		System.out.println("Date: " + this.day + " - " + this.month + " - " + this.year);
	}
	/*
	 * 	public static void main(String[] args) {
	 * MyDate md = new MyDate(25, 9, 2004);
	 * md.printDay();
	 * md.printMonth();
	 * md.printYear();
	 * md.printDate();
	 * Ta có thể gọi hàm main trực tiếp trong class MyDate hoặc cũng có thể tạo ra một Class khác
	 * 
	}
	 */

}
