public class Movie {
	private String nameMovie;
	private int yearManufacture;
	Manufacturer inforManufacturer;
	double fare;
	Date showDate;
	
	public Movie (String nameMoive, int yearManufacture, Manufacturer inforManufacturer, double fare, Date showDate) {
		this.nameMovie = nameMoive;
		this.yearManufacture = yearManufacture;
		this.inforManufacturer = inforManufacturer;
		this.fare = fare;
		this.showDate = showDate;
	}

	public String getNameMovie() {
		return nameMovie;
	}

	public void setNameMovie(String nameMovie) {
		this.nameMovie = nameMovie;
	}

	public int getYearManufacture() {
		return yearManufacture;
	}

	public void setYearManufacture(int yearManufacture) {
		this.yearManufacture = yearManufacture;
	}

	public Manufacturer getInforManufacturer() {
		return inforManufacturer;
	}

	public void setInforManufacturer(Manufacturer inforManufacturer) {
		this.inforManufacturer = inforManufacturer;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	public boolean fareMovieCheaperThanAnother (Movie otherMovie) {
		return this.fare < otherMovie.fare;
	}
	public String printNameManufacturer () {
		return this.inforManufacturer.getNameManufacturer();
	}
	public double fareMovieAfterDecreaseXPercent (double x) {
		return this.fare * (1 - x/100);
	}
}
