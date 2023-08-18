public class Author {
	private String nameAuthor;
	private Date authorBirthday;
	
	public Author (String nameAuthor, Date authorBirthday) {
		this.nameAuthor = nameAuthor;
		this.authorBirthday = authorBirthday;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public Date getAuthorBirthday() {
		return authorBirthday;
	}

	public void setAuthorBirthday(Date authorBirthday) {
		this.authorBirthday = authorBirthday;
	}
}
