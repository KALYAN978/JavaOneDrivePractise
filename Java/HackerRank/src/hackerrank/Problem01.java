package hackerrank;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Print the header line
		System.out.println("================================");

		while (scanner.hasNext()) {
			String str = scanner.next();
			int num = scanner.nextInt();

			// Format and print the string and integer
			System.out.printf("%-15s%03d%n", str, num);
		}

		// Print the footer line
		System.out.println("================================");

		scanner.close();
	}
}
