package model;

public class MenuModel {
	private String mainDishes;
	private String sideDishes;
	private int total;
	
	public String getMainDishes() {
		return mainDishes;
	}
	public void setMainDishes(String mainDishes) {
		this.mainDishes = mainDishes;
	}
	public String getSideDishes() {
		return sideDishes;
	}
	public void setSideDishes(String sideDishes) {
		this.sideDishes = sideDishes;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		int total = 0;
		if (this.mainDishes.equals("RICE")) {
			total += 30000;
		} else if (this.mainDishes.equals("PHO")) {
			total += 50000;
		} else if (this.mainDishes.equals("BREAD")) {
			total += 20000;
		}
		String [] sideDishes = this.sideDishes.split(";");
		for (String sideDish : sideDishes) {
			sideDish = sideDish.trim();
			if (sideDish.equals("MILK TEA")) {
				total += 30000;
			} else if (sideDish.equals("COCACOLA")) {
				total += 15000;
			} if (sideDish.equals("CAKE")) {
				total += 20000;
			} else if (sideDish.equals("NEM")) {
				total += 40000;
			} 
		}
		this.total = total;
	}
	
	
}
