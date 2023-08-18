public class SelectionSort implements SortInterface {
	@Override
	public void ascendantSort(double[] arr) {
		int min;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			double temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	@Override
	public void descendantSort(double[] arr) {
		int max;
		for (int i = 0; i < arr.length - 1; i++) {
			max = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			double temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
		
	}

}
