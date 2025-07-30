import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(11,3,5,6,7,8);
		
		
		Optional<Integer> firstElement = nums.stream()
				.findFirst();
		
//		System.out.println(firstElement);
		
		if(firstElement.equals(null)) {
			System.out.println(" The given is empty");
		}else {
//			System.out.println(firstElement);
			System.out.println(firstElement.get());
		}

	}

}
