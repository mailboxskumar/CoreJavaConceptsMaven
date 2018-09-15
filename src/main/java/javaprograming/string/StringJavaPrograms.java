package javaprograming.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringJavaPrograms {

	public static void main(String[] args) {

		StringJavaPrograms sjp = new StringJavaPrograms();
		sjp.compareStrings();
		sjp.searchLastOccurrenceOfSubstring();
		sjp.removeCharFromString();
		sjp.findSmallestAndLargestValueInArray();
		sjp.replaceString();
		sjp.reverseString();
		sjp.searchStringInsideAnotherString();
		sjp.findDuplicateElementsInArray();
		sjp.splitString();
	}

	// How to Compare Strings
	public void compareStrings() {
		String string1 = "string1";
		String string2 = "String1";

		if (string1.equals(string2)) { // String Compares to Specified String objects
			System.out.println("String1 is equal to String2");
		} else {
			System.out.println("String1 is not equal to String2");
		}
		System.out.println(string1.compareTo(string2)); // Compares Encode ...returns the ascii difference
		System.out.println(string1.compareToIgnoreCase(string2));
	}

	// How to search last occurrence of a substring inside a substring?
	public void searchLastOccurrenceOfSubstring() {
		String string = "CuttackCuttack";
		String substring = "ack";
		int intLastIndex = string.lastIndexOf(substring);
		if (intLastIndex == -1) {
			System.out.println(substring + "not found in the string");
		} else {
			System.out.println("Last occuerence of substring found in index " + intLastIndex);
		}
	}

	// How to remove a particular character from a string?
	public void removeCharFromString() {
		String string = "RemoveCharat";
		String removeChar = removeChar(string, 5);
		System.out.println("single character removed from the string " + removeChar);
	}

	public String removeChar(String str, int pos) {
		return str.substring(0, pos) + str.substring(pos + 1);
	}

	// how to find smallest and largest value in integer array

	public void findSmallestAndLargestValueInArray() {
		int[] numbers = { 1, 2, 3, 4, 6, -10, -1, 0, 5 };

		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest)
				largest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}

		System.out.println("largest no : " + largest);
		System.out.println("smallest no : " + smallest);
	}

	// How to find duplicate elements in an array?

	public void findDuplicateElementsInArray() {
		int dupInt[] = { 1, 2, 3, 3, 4, 9, 9, 7, 1, 6, 5 };
		String[] duplicateStr = { "Java", "C", "C++", ".Net", "Java", "C" };

		// Method-1 [Worst Solution - Do not tell this in interview]
		for (int i = 0; i < duplicateStr.length; i++) {
			for (int j = i + 1; j < duplicateStr.length; j++) {
				if (duplicateStr[i].equals(duplicateStr[j])) {
					System.out.println("Duplicate String by using 2 FOR loops is::" + duplicateStr[i]);
				}
			}
		}

		// Method-2
		Set<Integer> iset = new HashSet<Integer>();
		for (int as : dupInt) {
			if (iset.add(as) == false)
				System.out.println("Duplicate Integer is::" + as);
		}

		Set<String> set = new HashSet<String>();
		for (String dups : duplicateStr) {
			if (set.add(dups) == false)
				System.out.println("Duplicate String is::" + dups);
		}

		// Method 3
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String store : duplicateStr) {
			Integer count = storeMap.get(store);
			if (count == null)
				storeMap.put(store, 1);
			else
				storeMap.put(store, ++count);
		}

		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1)
				System.out.println("Duplicate String is By using EntrySet is :: " + entry.getKey());
		}

	}

	// How to replace a substring inside a string by another one ?
	public void replaceString() {
		String replaceStr = "ReplaceString";
		System.out.println(replaceStr.replace("String", "-StringReplaced"));
	}

	// How to reverse a string?
	public void reverseString() {
		String reverse = "reverseString";
		System.out.println("Reversed String is: " + new StringBuffer(reverse).reverse().toString());
	}

	// How to search a word inside a string ?
	public void searchStringInsideAnotherString() {
		String searchString = "Search contains a string which can be found";
		int index = searchString.indexOf("found");
		if (index == -1) {
			System.out.println("Search String not found");

		} else
			System.out.println("Search String found at index::" + index);

		if (searchString.contains("found"))
			System.out.println("Search String found by using contains method");
		else
			System.out.println("Search String not found by using contains method");
	}

	// How to split a string into a number of substrings ?

	public void splitString() {
		String string = "This is- my -split string";
		String[] temp = string.split("-");
		for (String s : temp)
			System.out.println("Split String is ::" + s.trim().toUpperCase());
	}

}
