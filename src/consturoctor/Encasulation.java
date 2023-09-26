package consturoctor;

public class Encasulation {
	public class Person {
	    private String name;
	    private int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }

	    // Setter for age
	    public void setAge(int age) {
	        if (age >= 0 && age <= 150) { // Assuming a reasonable age range
	            this.age = age;
	        } else {
	            System.out.println("Invalid age");
	        }
	    }

	    public static void main(String[] args) {
	        // Create a new Person object
	        Person p1 = new Person("John", 30);

	        // Access and modify the object's properties using encapsulation
	        System.out.println("Name: " + p1.getName());
	        System.out.println("Age: " + p1.getAge());

	        p1.setName("Alice");
	        p1.setAge(25);

	        System.out.println("Updated Name: " + p1.getName());
	        System.out.println("Updated Age: " + p1.getAge());
	    }
	}
}



