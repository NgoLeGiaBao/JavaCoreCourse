package model;

public class CounterModel {
	private int value;
	public CounterModel () {
		this.value = 0;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void increasement () {
		this.value++;
	}
	public void descreasement () {
		this.value--;
	}
	public void reset (){
		this.value = 0;
	}
}
