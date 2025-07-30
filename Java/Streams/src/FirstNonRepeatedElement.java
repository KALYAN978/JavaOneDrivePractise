import java.nio.charset.CharacterCodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstNonRepeatedElement {

	public static void main(String[] args) {

		
		String name = "capgemini";
		
		
		//Counting the Occurences using an array
		
//		int charCount[] = new int[256]; //This size 256 will cover all the ascii characters
		
		
		//  Counting Occurences using a Map
		
//		Map<Character, Long> charCount = name.chars()
//				.mapToObj(c -> (char) c)  // Converting each int to a char
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		Stream<Character> streamChar = name.chars()
				.mapToObj(c -> (char) c);
		
		Map<Character, Long> mapChar =  streamChar.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		
		Character ch = mapChar.entrySet().stream().filter(c -> c.getValue() == 1).map(c -> c.getKey()).findFirst().get();
		
		System.out.println(ch);
		
		
		
		
		// Finding the first NonRepeated Character
//		
//		Optional<> firstNonRepeat = name.chars()
//				.mapToObj(c -> (char) c) //Convert each int to a char
//				.filter(c -> charCount.get(c) == 1)
//				.findFirst();
//		
	}

}
