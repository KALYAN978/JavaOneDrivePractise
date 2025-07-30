package java8streams;

public class CreateThread {

	public static void main(String[] args) {
        // Creating a Runnable using a lambda expression
        Runnable task = () -> {
            System.out.println("The thread is running.");
        };

        // Creating a Thread with the Runnable
        Thread thread = new Thread(task);

       
        thread.start();
    }

}
