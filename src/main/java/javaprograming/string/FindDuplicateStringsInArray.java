package javaprograming.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateStringsInArray {

	static String[] str = { "Java", "C", "Java", "C++", ".Net", "VB", ".Net" ,"Java"};

	public static void main(String[] args) {

		// 1st Method : double for loop
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j]))
					System.out.println("Duplicate element in String Array using double FOR loop::" + str[i]);
			}
		}

		// 2nd Method Using HashSet
		Set<String> set = new HashSet<String>();
		for (String st : str) {
			if (set.add(st) == false)
				System.out.println("Duplicate Element in string array using HashSet::" + st);
		}

		// 3rd Method : Using HashMap
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String st : str) {
			Integer count = map.get(st);
			if (count == null) {
				map.put(st, 1);
			} else {
				map.put(st, ++count);
			}
		}
		
		//get the values from HashMap
		Set<Entry<String,Integer>> entries = map.entrySet();
		for(Entry<String,Integer> entry : entries) {
			if(entry.getValue()>1)
				System.out.println("Duplicate Element in string array using HashMap & EntrySet::" + entry.getKey());		
		}

	}

}
