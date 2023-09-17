package ram;

class ram {
    String name;

    ram(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name from Parent class: " + name);
    }
}

class krish extends Parent {
    int age;

    krish(String name, int age) {
        super(name); // Calling the constructor of the parent class
        this.age = age;
    }

    void display() {
        super.display(); // Calling the method of the parent class
        System.out.println("Age from Child class: " + age);
    }
}

public class Super {
    public static void main(String[] args) {
        Child child = new Child("Alice", 10);
        child.display();
    }
}