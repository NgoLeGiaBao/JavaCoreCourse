public enum MonthInYear {
	Janurary(31),
	February(28),
	March(31),
	April(30),
	May(31),
	June(30),
	July(31),
	August(31),
	September(30),
	October(31),
	November(30),
	December(31);
	
	private int numberDayOfMonth;

	private MonthInYear(int numberDayOfMonth) {
		this.numberDayOfMonth = numberDayOfMonth;
	}

	public int getNumberDayOfMonth() {
		return numberDayOfMonth;
	}

	public void setNumberDayOfMonth(int numberDayOfMonth) {
		this.numberDayOfMonth = numberDayOfMonth;
	}

	
}
