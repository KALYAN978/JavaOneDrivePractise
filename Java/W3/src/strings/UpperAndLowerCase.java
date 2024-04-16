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

		
		System.out.println(Math.max(12, 23));
		
		System.out.println(Math.min(232, 43));
		
		
		System.out.println(Math.sqrt(45));
		
		System.out.println(Math.abs(-4.5));
		
		System.out.println(Math.round(-45.6));
		

	}

}
