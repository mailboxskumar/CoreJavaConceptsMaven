package javaprograming.string;

import java.util.Arrays;
import java.util.List;

public class PrintMissingNumbersInArray {

	public static void main(String[] args) {
		
		Integer b[] = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(printMissingSignleNumber(b));

		Integer a[] = { 1, 3, 4, 6, 7, 8, 11 };
		printMissingMultipleNumber(a);
	}

	// Method to find single missing number in an integer array

	public static int printMissingSignleNumber(Integer[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++)
			if (a[i] != i + 1)
				return i + 1;
		return n + 1;
	}

	// Method to find multiple missing number in an integer array

	public static void printMissingMultipleNumber(Integer[] arr) {
		Arrays.sort(arr);
		List<Integer> l = Arrays.asList(arr);
		int maxVal = arr[arr.length - 1];

		for (int i = 1; i <= maxVal; i++) {
			if (l.contains(i) == false) {
				System.out.println(i);
			}
		}
	}
}