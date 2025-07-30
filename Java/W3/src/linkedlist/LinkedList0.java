package linkedlist;

import java.util.LinkedList;

public class LinkedList0 {
	
	
	public static void main(String args[]) {
	
	LinkedList<Integer> num = new LinkedList<Integer>();

	num.add(1);
	num.add(2);
	num.add(3);
	num.add(9);
	num.add(8);
	num.add(7);
	num.add(6);
	num.add(5);
	
	for(Integer i : num) {
		System.out.println(i);
	}
	
	}
	}
