package model;

public class FileModel {
	private String nameFile, text;
	
	public FileModel() {
		this.nameFile = "";
		this.text = "";
	}
	
	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
