public class Method {

    // Static method with no parameters
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method with parameters
    void instanceMethod(String message) {
        System.out.println("Instance method: " + message);
    }

    // Method with a return value
    int add(int a, int b) {
        return a + b;
    }

    // Method with varargs (variable number of arguments)
    void printNumbers(String label, int... numbers) {
        System.out.print(label + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Calling static method using class name
        Method.staticMethod();

        // Creating an instance of the class to call instance methods
        Method m = new Method();
        m.instanceMethod("Hello from instance method!");

        // Calling a method with a return value and displaying the result
        int result = m.add(5, 7);
        System.out.println("Result of addition: " + result);

        // Calling a method with varargs
        m.printNumbers("Even numbers", 2, 4, 6, 8);
        m.printNumbers("Odd numbers", 1, 3, 5, 7);
    }
}
