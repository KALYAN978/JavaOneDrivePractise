package exceptions;

public class NestedTryBlockCheck {

	public static void main(String[] args) {
		
		try {
			try {
				try {
					int arr[] = {1,2,3,4};
					//printing the array elements out of its bounds
					System.out.println(arr[19]);
				}catch(ArithmeticException e) {
					System.out.println("Inner try block2");
				}
			}catch(ArrayIndexOutOfBoundsException e4) {
				System.out.println(e4);
			}
		}catch(Exception e5) {
			System.out.println("handling the exception in Main try block");
		}

	}

}
