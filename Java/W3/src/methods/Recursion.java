package methods;

public class Recursion {
	
	static int add(int x, int y,int z) {
		if(y == 0) {
			return x+z;
		}else 
		{
			return add(x+1,y-1,z);
		}
	}
	
	
	
	public static void main(String args[]) {
		
		int x = 1;
		int y = 2;
		int z = 1000;
		
		
		System.out.println(add(x,y,z));
		
	}

}
