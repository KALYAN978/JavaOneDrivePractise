
public class AssignUnicodeValuesToVariables {

	public static void main(String[] args) {

		char letterA = '\u0041';
		char letterSigma = '\u03A3';
		char copyRightSymbol = '\u00A9';

		// Storing Unicode Characters directly

		char letterZ = 'Z';
		char letterOmega = 'Ω';
		char registeredSymbol = '®';

		// printing the stored Unicode characters

		System.out.println("Stored Unicode using Escape Sequences: ");
		System.out.println("Greek Capital Letter Sigma: " + letterSigma);
		System.out.println("Copyright Symbol: " + copyRightSymbol);
		System.out.println("Letter A: " + letterA);
		System.out.println("\nStored Unicode Characters Directly:");
		System.out.println("Letter Z: " + letterZ);
		System.out.println("Greek Capital Letter Omega: " + letterOmega);
		System.out.println("Registered Symbol: " + registeredSymbol);

	}

}
