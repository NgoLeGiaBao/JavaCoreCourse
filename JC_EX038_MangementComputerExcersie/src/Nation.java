public class Nation {
	private String IDNation;
	private String nameNation;
	
	public Nation (String IDNation, String nameNation) {
		this.IDNation = IDNation;
		this.nameNation = nameNation;
	}

	public String getIDNation() {
		return IDNation;
	}

	public void setIDNation(String IDNation) {
		this.IDNation = IDNation;
	}

	public String getNameNation() {
		return nameNation;
	}

	public void setNameNation(String nameNation) {
		this.nameNation = nameNation;
	}
}
