public class Currency_Denomination {

	//QUICK SORT
	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	// The main function that implements QuickSort()

	static void sort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	
// LOGIC OF CURRENCY DENOMINATION
	
	public static void denomCurrency(int[] denom, int amount) {

		sort(denom, 0, denom.length - 1);

		int[] currency = new int[denom.length];
		boolean check = true;

		for (int i = 0; i < denom.length; i++) {
			currency[i] = amount / denom[i];
			amount = amount - currency[i] * denom[i];
		}

		// Condition of amount not able to tender

		if (amount % denom[denom.length - 1] != 0) {
			check = false;
		}

		if (check == true) {
			System.out.println("Your payment approach in order to give min no of notes will be : ");
			for (int i = 0; i < denom.length; i++) {
				if (currency[i] != 0) {
					System.out.println(denom[i] + ":" + currency[i]);
				} else {
					System.out.println("Exact amount cannot be tender");
				}
			}
		}
	}
}
