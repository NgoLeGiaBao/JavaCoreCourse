/*
 * Kiểu dữ liệu Enum là một kiểu dữ liệu đặc biệt trong Java, ta sử dụng kiểu dữ liệu này
 * ta đã biết được trước được nó đã có một kiểu dữ liệu nhất định
 * 
 */
public class Main_EX059_EnumDatatype {
	public static void main(String[] args) {
		ScheduleCourse scc_2 = new ScheduleCourse(DayInWeek.Monday, "Math, Phyisic, Biology");
		ScheduleCourse scc_3 = new ScheduleCourse(DayInWeek.Tuesday, "English, Physical Education");
		
		System.out.println(scc_2);
		System.out.println(scc_3);
		
		System.out.println(MonthInYear.December+ " has " + MonthInYear.December.getNumberDayOfMonth() + " days");
	}
}
