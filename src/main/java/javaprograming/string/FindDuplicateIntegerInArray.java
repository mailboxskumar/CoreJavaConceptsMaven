package javaprograming.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateIntegerInArray {

	static int[] str = { 1,2,3,4,3,3,3,3,5,6,7,7,8,9,0,1,1};

	public static void main(String[] args) {

		// 1st Method : double for loop
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i]==(str[j]))
					System.out.println("Duplicate element in Integer Array using double FOR loop::" + str[i]);
			}
		}

		// 2nd Method Using HashSet
		Set<Integer> set = new HashSet<Integer>();
		for (Integer st : str) {
			if (set.add(st) == false)
				System.out.println("Duplicate Element in integer array using HashSet::" + st);
		}

		// 3rd Method : Using HashMap
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer st : str) {
			Integer count = map.get(st);
			if (count == null) {
				map.put(st, 1);
			} else {
				map.put(st, ++count);
			}
		}
		
		//get the values from HashMap
		Set<Entry<Integer,Integer>> entries = map.entrySet();
		for(Entry<Integer,Integer> entry : entries) {
			if(entry.getValue()>1)
				System.out.println("Duplicate Element in integer array using HashMap & EntrySet::" + entry.getKey());		
		}

	}

}
