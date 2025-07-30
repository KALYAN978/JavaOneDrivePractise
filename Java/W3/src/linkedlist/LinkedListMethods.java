package linkedlist;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String args[]) {
		
		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("volvo");
		cars.add("BMW");
		cars.add("Ford");
		
		// Using addFirst() to add The item in the beginning
		
		cars.addFirst("Madara Uchiha");
		
		// Using addLast() to add the item in the end
		cars.addLast("Last car");
		
		//Using removeFirst( to remove the firstItem)
		cars.removeFirst();
		
		
		//Using removeLast() to remove the lastItem
		cars.removeLast();
		
		
		
		
		// Getting the First Item using getFirst
		System.out.println(cars.getFirst());
		
		System.out.println(cars.getLast());
		
		

		
	}

}
