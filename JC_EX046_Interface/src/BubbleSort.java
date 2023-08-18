
public class BubbleSort implements SortInterface {
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
