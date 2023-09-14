class Person {
    private String name;
    private int age;

    // Default Constructor (No-Argument Constructor)
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class constructor {
    public static void main(String[] args) {
        // Using Default Constructor
        Person person1 = new Person();
        System.out.println("Person 1: Name=" + person1.getName() + ", Age=" + person1.getAge());

        // Using Parameterized Constructor
        Person person2 = new Person("Alice", 25);
        System.out.println("Person 2: Name=" + person2.getName() + ", Age=" + person2.getAge());

        // Using Copy Constructor
        Person person3 = new Person(person2);
        System.out.println("Person 3: Name=" + person3.getName() + ", Age=" + person3.getAge());
    }
}
