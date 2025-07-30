import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		
		String name = "ravisivar";
		
		
//		//Counting occurences using an array
//		int charCount[] = new int[256];  //size 256 will cover all the ascii Characters
//		
//		
//		//Finding the first Repeated Character
//		Optional<Character> firstRepeat = IntStream.range(0, input.length())
//				.mapToObj(input::charAt)   //Mapping the each index to corresponding charcater
//				.filter(c -> {
//					charCount[c]++;
//					return charCount[c] > 1;
//				})
//				.findFirst();
//		
//		
//		System.out.println(firstRepeat);
//		
//		if(firstRepeat.equals(null)) {
//			System.out.println("There are No characters in the list");
//		}else {
//			System.out.println(firstRepeat.get());
//		}
		
		
		Stream<Character> streamChar = name.chars()
				.mapToObj(c -> (char) c);
		
				

Map<Character, Long> mapChar =  streamChar.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		
		Character ch = mapChar.entrySet().stream().filter(c -> c.getValue() > 1).map(c -> c.getKey()).findFirst().get();
		
		System.out.println(ch);
	}

}
