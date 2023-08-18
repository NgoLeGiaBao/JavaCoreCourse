public class Main_EX037 {
	public static void main(String[] args) {
		Date dt1 = new Date(25, 9, 2004);
		Date dt2 = new Date(25, 9, 2004);
		Date dt3 = new Date(25, 12, 2002);
		
		Class cls1 = new Class("Computer Science", "Information technolgy");
		Class cls2 = new Class("English Language", "Foreign Affairs");
		Class cls3 = new Class("Banking Finance", "Baking Finance");
		
		Student std1 = new Student("52200053","Ngo Le Gia Bao" , dt1, 10, cls1);
		Student std2 = new Student("52200155","Nguyen Thien Phuc", dt2, 6, cls2);
		Student std3 = new Student("51900034","Tran Le Nguyen Vu", dt3, 4, cls3);
		
		System.out.println("The faculty of " + std1.getNameStudent() + "'s is: " + std1.getFacultyOfStudent());
		System.out.println("The faculty of " + std2.getNameStudent() + "'s is: " + std2.getFacultyOfStudent());
		System.out.println("The faculty of " + std3.getNameStudent() + "'s is: " + std3.getFacultyOfStudent());

		System.out.println(std1.getNameStudent() + " student's mark to pass is: " + std1.studentIsPass());
		System.out.println(std2.getNameStudent() + " student's mark to pass is: " + std2.studentIsPass());
		System.out.println(std3.getNameStudent() + " student's mark to pass is: " + std3.studentIsPass());
		
		System.out.println(std1.getNameStudent() + " student's day being the same "+ std2.getNameStudent() + " 's one is: " + std1.checkTheSameBirthday(std2));
		System.out.println(std1.getNameStudent() + " student's day being the same "+ std3.getNameStudent() + " 's one is: " + std1.checkTheSameBirthday(std3));
		System.out.println(std2.getNameStudent() + " student's day being the same "+ std3.getNameStudent() + " 's one is: " + std2.checkTheSameBirthday(std3));
	}
}
