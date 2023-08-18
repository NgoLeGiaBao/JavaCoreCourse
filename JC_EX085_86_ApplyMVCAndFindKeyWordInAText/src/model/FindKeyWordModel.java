package model;

import javax.swing.JFrame;

public class FindKeyWordModel{
	private String text, keyWord, result;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public void staticKeyWord () {
		int position = 0;
		int count = 0;
		int index;
		while (true) {
			index = this.text.indexOf(this.keyWord, position);
			if (index == -1) {
				break;
			} else {
				position = index + 1;
				count++;
			}
		}
		if (count == 1) {
			this.result = "There is only one " + "'"+ this.keyWord +"'" + " word";
		} else if (count == 0) {
			this.result = "There is no any " + "'"+ this.keyWord +"'" + " word";
		} else {
			this.result = "There are " + count + " " + "'"+ this.keyWord +"'" + " words";
		}
		
		
	}
}
