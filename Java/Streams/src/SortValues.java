import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(56,4,3,32,56,678,7,765,47,78,99);
		
		List<Integer> sorted = nums.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(sorted);

	}

}
