package javaprograming.string;

public class BubbleSort {

	public static void main(String[] args) {

		//int arr[] = { 10, 12, 11, 67, 68, 90 };
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int len = arr.length;
		bubbleSort(arr, len);
		printArray(arr, len);

	}

	static void printArray(int[] arr, int n) {
		for (int i = 0; i < n ; i++)
			System.out.print(arr[i] + " ");

	}

	public static void bubbleSort(int[] arr, int n) {

		int i, j, temp;
		boolean swapped;

		for (i = 0; i < n - 1; i++) {
			swapped = false;

			for (j = 0; j < n - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}

				if (swapped == false)
					break;

			}

		}

	}

}
