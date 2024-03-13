import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		
		for(Integer x : numbers) {
			System.out.println(x);
			System.out.println(",");
		}
		

	}

}
