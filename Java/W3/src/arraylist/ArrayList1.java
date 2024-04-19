package arraylist;

import java.util.ArrayList;

public class ArrayList1 {

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
		
		num.set(0, 45);
		
		for(int i = 0; i<num.size(); i++) {
			System.out.println(num.get(i));
		}
		
		

	}

}
