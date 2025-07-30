import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumNumber {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(1,223,34,45,67,7878,9);
		
		Optional<Integer> maxNum = nums.stream()
				.max(Integer::compareTo);
		
		System.out.println(maxNum + "\n");
		
		if(maxNum != null) {
			System.out.println(maxNum.get());
		}else {
			System.out.println(" the given list is empty");
		}

	}

}
