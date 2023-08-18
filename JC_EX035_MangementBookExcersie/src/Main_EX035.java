
public class Main_EX035 {
	public static void main(String[] args) {
		Date dt1 = new Date(12, 5, 1989);
		Date dt2 = new Date (11, 1, 2000);
		Date dt3 = new Date(30, 12, 1988);
		
		Author at1 = new Author("VuNguyenCoder", dt1);
		Author at2 = new Author("TonnyCodeDao", dt2);
		Author at3 = new Author ("TungTITV", dt3);
		
		Book bk1 = new Book("How to become hero from zero in IT", 2019, 10, at1);
		Book bk2 = new Book ("Programing C is really esay!", 2022, 15, at2);
		Book bk3 = new Book ("The habits help you imporve programming abilit", 2019, 20, at3);
		
		bk1.printBookTitle();
		bk2.printBookTitle();
		bk3.printBookTitle();
		
		System.out.println("Publish book's year is the same one's other book: " + bk1.bookSameYearOtherBook(bk2));
		System.out.println("Publish book's year is the same one's other book: " + bk1.bookSameYearOtherBook(bk3));
		System.out.println("Publish book's year is the same one's other book: " + bk2.bookSameYearOtherBook(bk3));
		
		System.out.println("This book'price after decrease 10%: " + bk1.priceAfterDecreaseXPercent(10));
		System.out.println("This book'price after decrease 20%: " + bk2.priceAfterDecreaseXPercent(20));
		System.out.println("This book'price after decrease 50%: " + bk3.priceAfterDecreaseXPercent(50));
	
		System.out.println(bk1.getAuthorBook());
	}
}
