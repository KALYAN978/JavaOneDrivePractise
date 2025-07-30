import java.util.Arrays;
import java.util.List;

public class TotalElements {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList();
		
		
		long total = nums.stream().count();
		
		if(total == 0) {
			System.out.println("The given list is empty");
		}else {
			System.out.println(total);
		}
		
		System.out.println(total);
		
		

	}

}
