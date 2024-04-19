package arraylist;

import java.util.ArrayList;

public class ArrayList11 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		
		
		System.out.println(num);
		
		num.set(0,23);
		num.set(1,24);
		num.remove(3);
		num.remove(5);
		
		System.out.println(num);

	}

}
