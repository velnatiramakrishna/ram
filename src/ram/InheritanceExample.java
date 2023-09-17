package ram;
	class Animal {
	    void eat() {
	        System.out.println("This animal is eating.");
	    }
	}

	class Dog extends Animal {
	    void bark() {
	        System.out.println("The dog is barking.");
	    }
	}

	class Cat extends Animal {
	    void meow() {
	        System.out.println("The cat is meowing.");
	    }
	}

	public class InheritanceExample {
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.eat();
	        dog.bark();

	        Cat cat = new Cat();
	        cat.eat();
	        cat.meow();
	    }
	}


