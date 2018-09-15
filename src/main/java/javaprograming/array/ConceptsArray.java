package javaprograming.array;

import java.util.Arrays;

public class ConceptsArray {

	static String[] arrStr = { "Data", "C", "C++", "Java" };

	public static void main(String[] args) {

		String[] str = new String[3];
		str[0] = "Data";
		str[1] = "Parsing";
		str[2] = "C";

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		for(String s : str)
			System.out.println(s);

		int[] a = new int[3];
		a[0] = 1;
		a[1] = 1;

		System.out.println(Arrays.toString(a));

		printArrayString(str);
		printArrayString(arrStr);
		printArrayFromArraysClass();

	}

	public static void printArrayString(String[] str) {

		for (int i = 0; i <= str.length - 1; i++) {
			System.out.println(str[i]);
		}
	}

	public static void printArrayFromArraysClass() {

		int[] a = new int[3];
		a[0] = 1;
		a[1] = 1;

		System.out.println(a[2]);
		String[] s = { "C11", "C12" };

		ConceptsArray con = new ConceptsArray();
		con.printArrayString(s);

		ConceptsArray[] con1 = new ConceptsArray[2];

		con1[0].printArrayString(s);
		con1[1].printArrayString(s);

	}

}
