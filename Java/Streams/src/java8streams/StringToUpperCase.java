package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {

	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		
		
		String conversion = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.joining(","));
		
		
		System.out.println(conversion);
		

	}

}
