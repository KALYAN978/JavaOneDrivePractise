import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		
		
		
		List<Integer> nums = Arrays.asList(1,2,1,2,3,44,5,44,6,7,8,9,10,8);
		
		
		//For counting each number of occurences we are using map(Key,value)
		
		Map<Integer, Long> countNums = nums.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		// Filtering numbers that have more than one Occurences
		
		List<Integer> duplicates = countNums.entrySet().stream()
				.filter(n -> n.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		
		
		System.out.println(duplicates);
	}

}
