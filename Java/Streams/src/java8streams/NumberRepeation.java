package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberRepeation {

	public static void main(String[] args) {
		
	
	
	List<Integer> nums = Arrays.asList(2,3,34,5,5,4,3,3,3);
	
	
	Map<Integer, Long> map = nums.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	
	List<Entry<Integer, Long>> count = map.entrySet().stream()
			.collect(Collectors.toList());
	
	System.out.println(count);
	
	
//	Map<Integer, Long> map = nums.stream()
//			.collect(Collectors.groupingBy(n -> n,Collectors.counting()));
//	
//	
//	map.forEach((n,count) -> System.out.println(n + "-" +count));
	
	}
}
