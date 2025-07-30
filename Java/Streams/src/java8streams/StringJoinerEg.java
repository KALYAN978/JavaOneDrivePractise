package java8streams;

import java.util.StringJoiner;

public class StringJoinerEg {

	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner(", ");
		
		joiner.add("cap");
		joiner.add("gemnini");
		joiner.add("quocket");
		
		
		System.out.println(joiner);
		
		
		//Creating a STring Joiner with a delimiter(","), Prefix("["), and Suffix("]")

		
		StringJoiner joinerPrefixSuffix = new StringJoiner(",");
		
		joinerPrefixSuffix.add("Library->");
		joinerPrefixSuffix.add("Books->");
		joinerPrefixSuffix.add("Java With Prefix");
		
		
		System.out.println(joinerPrefixSuffix);
	}

}
