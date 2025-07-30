package java8streams;

import java.util.stream.Stream;

public class ConcatTwoStreams {

	public static void main(String[] args) {
		
		Stream<Integer> stream1 = Stream.of(1,2,3);
		
		Stream<Integer> stream2 = Stream.of(4,5,6);
		
		Stream<Integer> stream3 = Stream.of(7,8,9);
		
		Stream<Integer> stream4 = Stream.concat(stream1, stream2);
		
		stream4.forEach(System.out::println);
		
		
//		Stream<Integer> finalStream = Stream.concat(stream4, stream3);
//		finalStream.forEach(System.out::println);
		
		System.out.println("\n");
		
		Stream<Integer> stream4Again = Stream.concat(Stream.of(1,2,3), Stream.of(4,5,6));
		
		Stream<Integer> finalStream = Stream.concat(stream4Again, stream3);
		
		finalStream.forEach(System.out::println);
 
	}

}
