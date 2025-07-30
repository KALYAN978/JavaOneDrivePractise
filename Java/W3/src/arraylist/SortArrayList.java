package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	
	
	public static void main(String args[]) {

	
	ArrayList<Integer> num = new ArrayList<Integer>();
	
	num.add(232);
	num.add(2344);
	num.add(235);
	num.add(34);
	Collections.sort(num);
	
	for(Integer i : num) {
		System.out.println(i);
	}
	
	
	
	
	
	}
	
	
}
