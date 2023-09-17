package ram;

public class Parent {

	String name;

    Parent(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name from Parent class: " + name);
    }
}

class Child extends Parent {
    int age;

    Child(String name, int age) {
        super(name); // Calling the constructor of the parent class
        this.age = age;
    }

    void display() {
        super.display(); // Calling the method of the parent class
        System.out.println("Age from Child class: " + age);
    }
}

public class  main {
    public static void main(String[] args) {
        Child child = new Child("Alice", 10);
        child.display();
    }
}
