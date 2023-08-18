import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
/*
 * Một số phương thức về thời gian thưởng được sử dụng trong Java:
 * - System.currentTimeMillis() dùng để đo thời gian khi làm một công việc nào đó bằng cách gọi phương thức này trước khi bắt đầu công việc và sau khi hoàn hành công việc. Đơn vị của nó là mls
 * - TimeUnit nó dùng để chuyển đổi các đơn vị thời gian qua lại với nhau
 * - Date: 
 * 	+ java.util.Date là một trong các class mô tả ngày tháng đầu tiên trong Java. 
 * Thật đáng tiếc là hầu hết các phương thức của nó đã lỗi thời, và thay vào đó là sử dụng các phương thức của java.util.Calendar. 
 * Nhưng bạn vẫn có thể sử dụng java.util.Date để mô tả ngày tháng.
 * 	+ Ngày nay ta sử dụng java.sql.Date/java.sql.Time/java.sql.Timestamp để thay thế cho java.util.Date, vì nó đều có tính kế thừa 
 * 		. java.sql.Date tương ứng với SQL DATE, nghĩa là nó chỉ lưu trữ năm, tháng, ngày và bỏ qua giờ phút giây, và milli giây. Thêm nữa java.sql.Date không chứa thông tin về múi giờ.
		. java.sql.Time tương ứng với SQL TIME và chỉ chứa các thông tin về giờ, phút, giây, milli giây.
		. java.sql.Timestamp tương ứng với SQL TIMESTAMP, nó chính xác tới nano giây (chú ý java.util.Date chỉ hỗ trợ tới milli giây!) với độ chính xác tùy biến.
	+ Chú ý: muốn lấy ra ngày hiện tại thì month + 1 và year + 1900
 * - Calendar: là một class trừu tượng. Nghĩa là bạn không thể khởi tạo nó từ cấu tử (Constructor). Tuy nhiên có 2 method tĩnh để tạo ra đối tượng Calendar.
 *	Do vậy, khi khởi tạo ta dùng: Calendar c = Calendar.getInstance(); để lấy ra được múi giờ trong máy tính của bạn
 *	+ Chú ý: muốn lấy ra ngày hiện tại thì month + 1 và year + 1900
 *	+ Cuộn (lên/xuống) một trường (field) của Calendar
 * - DateFormat là một lớp trừu tương, khi muốn tạo đối tượng thì ta dùng DateFormat dtf = new SimpleDateFormat  
 *	giúp ta đinh dạng được ngày tháng năm hoặc giờ phút giây mà ta muốn
 */
public class Main_EX058_Time_Date_DateFormat_CalendarClass {
	public static void main(String[] args) {
		
		
		// System.currentTimeMillis()
		long time_1 = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		long time_2 = System.currentTimeMillis();
		System.out.println("Time to finish a for loop with 1000 times is: " + (time_2 - time_1) + "mls");
		System.out.println("Time to finish a for loop with 1000 times is: " + (time_2 - time_1)/1000.0 + "s");
		System.out.println("----------------------------------------------------");
		
		
		// TimeUnit
		System.out.println("2 days equals to " + TimeUnit.DAYS.toHours(2) + " hours");
		System.out.println("1 hour equals to " + TimeUnit.HOURS.toMinutes(1) + " minutes");
		System.out.println("----------------------------------------------------");
		
		
		// Date
		Date dt = new Date(System.currentTimeMillis());
		Time tm = new Time(System.currentTimeMillis());
		
		System.out.println("Today is: " + dt.getDate() + "/" + (dt.getMonth() + 1) + "/" + (dt.getYear()+1900));
		System.out.println("Today is: " + dt.toString());
		System.out.println("Now is: " + tm.toLocaleString());
		System.out.println("----------------------------------------------------");

		
		// Calendar
		Calendar cld = Calendar.getInstance();
		System.out.println("This week is " + cld.get(Calendar.DAY_OF_WEEK_IN_MONTH) + " in " + (cld.get(Calendar.MONTH) + 1));
		cld.add(Calendar.DATE, 7);
		System.out.println("Next week is " + cld.get(Calendar.DAY_OF_WEEK_IN_MONTH) + " in " + (cld.get(Calendar.MONTH) + 1));
		System.out.println("----------------------------------------------------");
		
		// DateFormat
		DateFormat dtf = new SimpleDateFormat("yy-MM-dd HH:mm:ss:a");
		System.out.println(dtf.format(dt));
		
	}
}
