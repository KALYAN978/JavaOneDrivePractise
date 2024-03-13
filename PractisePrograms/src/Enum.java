

class FreshJuice{
	
	enum FreshJuiceSize{small,medium,large}
	FreshJuiceSize size;
}



public class Enum {
	
	public static void main(String args[]) {
	
	FreshJuice juice = new FreshJuice();
	
	juice.size = FreshJuice.FreshJuiceSize.large;
	
	System.out.println("Size : " + juice.size);
		}
	
	

}
