public class Book {
	private String bookTitle;
	private int publishYear;
	private double priceBook;
	private Author authorBook;
	
	public Book (String bookTitle, int publishYear, double priceBook, Author authorBook) {
		this.bookTitle = bookTitle;
		this.publishYear = publishYear;
		this.priceBook = priceBook;
		this.authorBook = authorBook;
	}

	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public double getPriceBook() {
		return priceBook;
	}

	public void setPriceBook(double priceBook) {
		this.priceBook = priceBook;
	}

	public Author getAuthorBook() {
		return authorBook;
	}

	public void setAuthorBook(Author authorBook) {
		this.authorBook = authorBook;
	}
	public void printBookTitle () {
		System.out.println("Title's book is: " + this.bookTitle);
	}
	public boolean bookSameYearOtherBook (Book otherBook) {
		return this.publishYear == otherBook.publishYear;
	}
	public double priceAfterDecreaseXPercent (double x) {
		return this.priceBook * (1 - x/100);
	}
}
