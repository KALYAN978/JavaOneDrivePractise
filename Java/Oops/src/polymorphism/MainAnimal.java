package polymorphism;



 class Animal {
	 
	 public void animalSound() {
		 System.out.println("The animal makes a Sound");
	 }
 }
 
 
 class Lion extends Animal{
	 public void animalSound() {
		 System.out.println("Lion a sound");
	 }
 }
 
 
 
 class Goat extends Animal{
	 public void animalSound() {
		 System.out.println("Goat sound");
	 }
 }

public class MainAnimal {

	public static void main(String[] args) {
		
		
		Animal animal = new Animal();
		
		Animal lion = new Lion();
		
		Animal goat = new Goat();
		
		animal.animalSound();
		lion.animalSound();
		goat.animalSound();
		

	
	}
}
