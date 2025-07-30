package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfStrings {

	public static void main(String[] args) {
		
		
		List<String> string = Arrays.asList("cap","kjashdk","hasgdjh","sudgyufgdk","jahd","hauda");
		
		
		long count = string.stream()
				.filter(s -> s.length() > 5)
				.count();
		
		System.out.println(count);

	}

}
