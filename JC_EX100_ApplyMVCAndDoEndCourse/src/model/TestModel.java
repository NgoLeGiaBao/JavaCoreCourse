package model;

public class TestModel {
	public static void main(String[] args) {
		for (Town t : Town.listTowns()) {
			System.out.println(t);
		}
	}
}
