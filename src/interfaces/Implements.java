package interfaces;
	public class Implements {
	    public static void main(String[] args) {
	        Bird sparrow = new Bird();
	        
	        // Method Overriding
	        sparrow.eat();

	        // Method Overloading
	        sparrow.fly(1000);

	        // Multiple Inheritance 
	        sparrow.swim();
	        sparrow.fly();
	    }
	}
	 // Single Inheritance
    class Animal {
    void eat() {
        System.out.println("The animal eats food.");
    }
}

// Interface for Multiple Inheritance
interface Swimmer {
    void swim();
}

interface Flyer {
	 void fly();
}

// Class that implements multiple interfaces
class Bird extends Animal implements Swimmer, Flyer {
	@Override
    void eat() { 
        System.out.println("The bird eats seeds");
    }

    // Method Overriding
    public void swim() {
        System.out.println("The bird swims in the pound");
    }

    // Method Overloading
    void fly(int distance) {
        System.out.println("The bird flies at an distance of " + distance + " meters.");
    }

	@Override
	public void fly() {
		
	}
}


