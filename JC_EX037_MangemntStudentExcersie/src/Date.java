import java.util.Objects;
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date (int day, int month, int year) {
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
}
