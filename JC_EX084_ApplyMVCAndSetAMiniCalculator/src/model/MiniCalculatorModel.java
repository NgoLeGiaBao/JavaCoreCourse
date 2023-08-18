package model;

public class MiniCalculatorModel {
	private double firstValue, secondValue, result;

	public double getFirstValue() {
		return firstValue;
	}
	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}
	public double getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public void setAdd () {
		this.result = this.getFirstValue() + this.getSecondValue();
	}
	public void setSub () {
		this.result = this.getFirstValue() - this.getSecondValue();
	}
	public void setMul () {
		this.result = this.getFirstValue() * this.getSecondValue();
	}
	public void setDiv () {
		this.result = this.getFirstValue() / this.getSecondValue();
	}
	public void setPow () {
		this.result = Math.pow(this.getFirstValue(),this.getSecondValue());
	}
	public void setMode () {
		this.result = this.getFirstValue() % this.getSecondValue();;
	}
	
	
}
