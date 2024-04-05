package stringall;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String birthDate = "25/11/1982";
		int startingIndex = birthDate.indexOf("1982");
		
		System.out.println(startingIndex);
		System.out.println("Birth Year = " + birthDate.substring(startingIndex));
		
		
		String newDate = String.join("/", "25", "11", "1982");
		System.out.println("NewDate = " + newDate);
		
		newDate = "25";
		newDate = newDate.concat("/");
		newDate = newDate.concat("11");
		newDate = newDate.concat("/");
		newDate = newDate.concat("1982");
		System.out.println(newDate);
		
		
		newDate = "23" + "/" + "22" + "1923";
		System.out.println(newDate);
		
		
		newDate = "25".concat("/").concat("11").concat("/").concat("1983");
		System.out.println(newDate);
		
		System.out.println(newDate.replace("/","-"));

	}

}
