/*
 * Trong Java khi muốn gán một giá trị nào cho một đối tượng thì ta dùng 
 * phương thức set và get để gán một giá trị cho một đối tượng (do ta khai báo ở dạng private)
 * chứ không gán trực tiếp. Điều này sẽ giúp ta khoanh vùng được điều kiện giá trị 
 * mà ta mong muốn, ví dụ như day thì phải nhỏ hơn 31 và lớn hơn 0, nếu như ta gán trực tiếp
 * thì người dùng có thể nhập dữ liệu sai, do vậy phương thức get và set trong Java 
 * sẽ giúp ta giải quyết được vấn đề này
 */
public class MyDate {
	public int day;
	private int month;
	private int year;
	
	public MyDate (int d, int m, int y) {
		if (d >= 1 && d <= 31) {
			this.day = d;
		} else {
			this.day = 1;
		}
		if (m >= 1 && m <= 12) {
			this.month = m;
		} else {
			this.month = 1;
		}
		if (y >= 1) {
			this.year = y;
		} else {
			this.year = 1;
		}
	}
	
	public void setDay (int d) {
		if (d >= 1 && d <= 31) {
			this.day = d;
		} else {
			this.day = 1;
		}
	}
	public int getDay () {
		return this.day;
	}
	public void setMonth (int m) {
		if (m >= 1 && m <= 12) {
			this.month = m;
		}
	}
	public int getMonth () {
		return this.month;
	}
	public void setYear (int y) {
		if (y >= 1) {
			this.year = y;
		}
	}
	public int getYear () {
		return this.year;
	}
	
}
