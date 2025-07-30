package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfDistinctNums {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		
		
		List<Integer> distinctNum = nums.stream()
				.distinct()
				.map(n -> n * n)
				.collect(Collectors.toList());
		
		
		System.out.println(distinctNum);

	}

}
