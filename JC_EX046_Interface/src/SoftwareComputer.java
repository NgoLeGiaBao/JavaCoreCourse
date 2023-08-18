public class SoftwareComputer implements CaculatorInterface, SortInterface {
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
	
	@Override
	public void ascendantSort(double[] arr) {
		int n = arr.length;
		while (n > 0) {
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i+1]) {
					double temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			n--;
		}		
	}

	@Override
	public void descendantSort(double[] arr) {
		int n = arr.length;
		while (n > 0) {
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] < arr[i+1]) {
					double temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			n--;
		}	
	}

}
