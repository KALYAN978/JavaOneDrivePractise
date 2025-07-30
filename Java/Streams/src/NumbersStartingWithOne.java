import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1,2,12,23,13,24,45,100,200);
		
		List<Integer> nums = numbers.stream()
				.map(String::valueOf)
				.filter(s -> s.startsWith("1"))
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		
		
		System.out.println(nums);
				
	}

}
