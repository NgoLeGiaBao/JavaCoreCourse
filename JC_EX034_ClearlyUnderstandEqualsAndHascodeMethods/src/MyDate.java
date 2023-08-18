import java.util.Objects;

/*
 * Phương thức equals trong Java sẽ giúp ta so sánh được hai đối tượng có bằng nhau hay không 
 * Phương thức hashCode trong Java có nghĩa là sẽ trả về một số duy nhất tương ứng với từng object. 
 * Mỗi Object trong java đều có 1 định danh và định danh để phân biệt mỗi object chính là giá trị hashcode.
 */
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate (int day, int month, int year) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
		} 
		if (year >= 1) {
			this.year = year;
		} else {
			this.year = 1;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1) {
			this.year = year;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
}
