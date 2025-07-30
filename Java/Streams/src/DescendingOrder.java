import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DescendingOrder {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(12,2,3,34,56,5,6,7,7,88,9,99,100);
		
		List<Integer> descending = nums.stream()
				.sorted(Comparator.reverseOrder()).toList();
		
		System.out.println(descending);

	}

}
