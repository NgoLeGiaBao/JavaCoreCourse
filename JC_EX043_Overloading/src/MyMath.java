
public class MyMath {
	public int findMaxValue (int a, int b) {
		if (a > b){
			return a;
		}
		return b;
	}
	public double findMaxValue (double a, double b) {
		return a > b ? a : b;
	}
	public int totalValue (int n) {
		int total = 0;
		for (int i = 0; i <= n; i++) {
			total += i;
		}
		return total;
	}
	public int totalValue (int x[]) {
		int total = 0;
		for (int i = 0; i < x.length; i++) {
			total += x[i];
		}
		return total;
	}
}
