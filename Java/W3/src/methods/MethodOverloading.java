package methods;

public class MethodOverloading {
	
	static int add(int x, int y) {
		return x+y;
	}
	
	static int add(int x, int y, int z) {
		return x+y+z;
	}
	
	
	static double add(double x,double y,double z) {
		return x+y+z;
	}
	
	public static void main(String args[]) {
		System.out.println(add(2,3));
		System.out.println(add(2,3,4));
		System.out.println(add(2,4,5));
	}

}
