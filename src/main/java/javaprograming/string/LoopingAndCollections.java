package javaprograming.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LoopingAndCollections {

	public static void main(String[] args) {
		//basicLooping();
		//createArray();
		collectionObjects();
		
	}

	public static void basicLooping() {
		int i = 0;
		if (i == 0) {
			System.out.println("test");
			System.out.println("testdata");
		} else {
			System.out.println("Else");
		}

		int x = 30;
		if (x == 10) {
			System.out.println("x value is : " + x);
		} else if (x == 20) {
			System.out.println("x value is : " + x);
		} else {
			System.out.println("x value is : " + x);
		}

		for (int j = 0; j < 10; j++) {
			System.out.println(j + ":Test ");
		}

		// for each loop
		int[] intArray = { 1, 2, 3, 4 };
		for (int eachInt : intArray) {

			System.out.println("array value : " + eachInt);
		}

		String arg1 = "Test";
		switch (arg1) {
		case "VALUE1":
			System.out.println("tet");
			break;
		case "VALUE2":
			System.out.println("tet");
		default:
			System.out.println("tet-default");
		}

		int y = 1;
		while (y < 4) {
			System.out.println("Y is not greater yet ");
			y++;
		}

		int z = 1;
		do {
			System.out.println("Z is not greater yet ");
			z++;
		} while (z < 4);

	}

	public static void createArray() {

		int[] testArray = new int[10];
		System.out.println("array length : " + testArray.length);

		// finding largest element in an array
		double[] testDobule = { 10.1, 10.2, 10.3, 10.7 };
		double max = testDobule[0];
		for (int i = 0; i < testDobule.length; i++) {
			if (testDobule[i] > max) {
				max = testDobule[i];
			}
		}
	}
	
	// Collection Interface
	public static void collectionObjects() {
		
	/*List interface*/	
		
		//ArrayList: can contain duplicate elements
		List a1 = new ArrayList();
		
		a1.add("start");
		a1.add("running");
		a1.add("end");
		System.out.println("ArrayList : " + a1);
		
		//LinkedList : can contain	duplicate elements
		List l1 = new LinkedList();
		
		l1.add("start");
		l1.add("running");
		l1.add("end");
		System.out.println("LinkedList : " + a1);
		
		
		//HashSet : Shd contain unique elements : hashset permits single null value
		
		Set s1 = new HashSet();
		s1.add("start");
		s1.add("running");
		s1.add("end");
		
		System.out.println("HashSet : " + s1);
		
		//HashMap: Shd contain unique key and value pairs : null value is not allowed
		
		Map m1 = new HashMap();
		m1.put("Test", "start");
		m1.put("execution", "running");
		m1.put("TestSet", "end");
		System.out.println("HashMap : " + m1);
		
	}
}
