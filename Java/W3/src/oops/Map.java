package oops;

import java.util.TreeMap;

public class Map {

	
	
	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> m = new TreeMap<Integer,String>();
		
		m.put(100, "akhila");
		m.put(2, "reddy");
		
		System.out.println(m.subMap(100,300));
		
	}

}
