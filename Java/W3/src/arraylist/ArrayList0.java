package arraylist;

import java.util.ArrayList;

public class ArrayList0 {
	
	
	/*
	 * Syntax: 
	 * ArrayList<String> cars = new ArrayList<String>();
	 * ArrayList<Integer> numbers = new ArrayList<Integer>();
	 * ArrayList<Float> fNum = new ArrayList<Float>();
	 * ArrayList<double> dnum = new ArrayList<Double<();
	 */

	public static void main(String[] args) {
		
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("ferrari");
		cars.add("BMW");
		cars.add("bolero");
		
		System.out.println(cars);
		System.out.println(cars.get(0));
		System.out.println(cars.get(1));
		System.out.println(cars.get(2));
		System.out.println(cars.set(0,"cap"));
		System.out.println(cars.remove(0));
		System.out.println(cars);
		cars.clear();
		System.out.println(cars);
		System.out.println(cars.size());

	}

}
