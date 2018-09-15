package javacollections.linkedlist;

import java.util.LinkedList;

public class SingleLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();

		list.add("first");
		list.add("second");
		list.add("third");
		list.addFirst("First");
		list.addLast("Last");

		System.out.println(list);
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("****************************");

		for (int i = 0; i <= list.size() - 1; i++) {
			System.out.println(list.get(i));
		}

		 list.removeFirst();
		 list.removeLast();

		System.out.println("****************************");

		list.add(1, "index1");
		list.add(list.size(), "index");

		for (int i = 0; i <= list.size() - 1; i++) {
			
			list.set(i, "index-" + i);
			if(list.get(i) == null) {
				System.out.println("Last index is ::" + i);
			}
			System.out.println(list.get(i));
		}
	
		System.out.println(list.size());
		list.pop();
	
		System.out.println(list.size());
		
		System.out.println(list.element()); //get first element of list
		System.out.println(list.peek()); //get first element of list
		System.out.println(list.peekFirst()); //get first element of list
		System.out.println(list.getFirst());//get first element of list
		
		System.out.println(list.getLast().hashCode()); //get last element of list
		System.out.println(list.peekLast()); //get last element of list
		
		list.poll();
		list.pollFirst();
		list.pollLast();	
		
		
	}

}
