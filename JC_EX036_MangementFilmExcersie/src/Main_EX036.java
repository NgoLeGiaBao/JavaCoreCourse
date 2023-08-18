public class Main_EX036 {
	public static void main(String[] args) {
		Date dt1 = new Date(12, 1, 2020);
		Date dt2 = new Date(24, 5, 2021);
		Date dt3 = new Date(4, 9, 2022);
		
		Manufacturer mft1 = new Manufacturer("David O.Selznick", "The United States");
		Manufacturer mft2 = new Manufacturer("One Race Films", "The United States");
		Manufacturer mft3 = new Manufacturer("20th Century Studios", "England");
		
		Movie mv1 = new Movie("Gone With the Wind", 1939, mft1, 10, dt1);
		Movie mv2 = new Movie("Fast & Furious 7", 2015, mft2, 30, dt2);
		Movie mv3 = new Movie("Avatar", 2009, mft3, 15, dt3);
		
		System.out.println("Fare's " + mv1.getNameMovie() + " is cheaper than one " + mv2.getNameMovie() + " is: " + mv1.fareMovieCheaperThanAnother(mv2));
		System.out.println("Fare's " + mv1.getNameMovie() + " is cheaper than one " + mv3.getNameMovie() + " is: " + mv1.fareMovieCheaperThanAnother(mv3));
		System.out.println("Fare's " + mv2.getNameMovie() + " is cheaper than one " + mv3.getNameMovie() + " is: " + mv2.fareMovieCheaperThanAnother(mv3));
	
		System.out.println("Name manufacturer's " + mv1.getNameMovie() + " is: " + mv1.printNameManufacturer());
		System.out.println("Name manufacturer's " + mv2.getNameMovie() + " is: " + mv2.printNameManufacturer());
		System.out.println("Name manufacturer's " + mv3.getNameMovie() + " is: " + mv3.printNameManufacturer());

		System.out.println(mv1.getNameMovie() + "'s pirce after decrease 10%: " + mv1.fareMovieAfterDecreaseXPercent(10));
		System.out.println(mv1.getNameMovie() + "'s pirce after decrease 30%: " + mv2.fareMovieAfterDecreaseXPercent(30));
		System.out.println(mv1.getNameMovie() + "'s pirce after decrease 50%: " + mv3.fareMovieAfterDecreaseXPercent(50));

	}
}
