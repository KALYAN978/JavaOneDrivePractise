package strings;

public class UpperAndLowerCase {
	
	private static String txt = "kjUHdjsuhsHGJH is prepare java";

	public static void main(String[] args) {
		
		String s = "12736876";
		
		
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
		
		System.out.println(txt.indexOf(4));
		System.out.println(txt.indexOf("is"));
		
		
//		concatenation
		
		System.out.println(txt +" "+ s);
		System.out.println(txt.concat(s));
		
		

	}

}
