package recursion;

public class Tower {
	public static int tower (int n) {
		if (n == 1) {
			return 1;
		} else {
			return (tower(n-1)*2) + 1;
		}
	}
	public static String covertToBinary (int n) {
		String binary = "";
		if (n <= 0) {
			return binary;
		} else {
			return covertToBinary(n/2)+binary+(n%2);
		}
	}
	public static int totalNumberDivideForANumber (int n, int base) {
		if (n < 0) {
			return 0;
		} else { 
			if (n % base == 0) {
				return totalNumberDivideForANumber(n-1, base) + n;
			} else {
				return totalNumberDivideForANumber(n-1, base);
			}
		}
	}
	public static void main(String[] args) {
//		System.out.println(covertToBinary(17));
		System.out.println(totalNumberDivideForANumber(6,3));
	}
}
