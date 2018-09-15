package javaprograming.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPrograms {

	public static void main(String[] args) {
		sortAndSerachArray();
		

	}
	
	//How to sort an array and search an element inside it?
	public static void sortAndSerachArray() {
		int[] intArray = {1,2,9,8,7,6,-1,0,-2,10};
		Arrays.sort(intArray);
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		
	

		System.out.println("Sorted array is::" + intArray);
		
		
	}

}
