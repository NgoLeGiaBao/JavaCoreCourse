public class Vinalcal500MSCaculator implements CaculatorInterface {

	@Override
	public double add(double a, double b) {
		return a + b;
	}

	@Override
	public double subtract(double a, double b) {
		return a - b;
	}
	
	@Override
	public double times(double a, double b) {
		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		if (b == 0) {
			return -1;
		}
		return a/b;
	}
}
