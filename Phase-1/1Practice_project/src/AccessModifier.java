// A class with various access modifiers
public class AccessModifier {
    public int publicVar = 15;
    private int privateVar = 35;
    protected int protectedVar = 43;
    int defaultVar = 40; // Default (package-private)

    
    public void publicMethod() {
        System.out.println("public method.");
    }

    // Private method 
    private void privateMethod() {
        System.out.println("private method.");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("protected method.");
    }

    // Default method 
    void defaultMethod() {
        System.out.println("default (package-private) method.");
    }

    // Main method 
    public static void main(String[] args) {
        AccessModifier example = new AccessModifier();

        // Accessing public members and methods
        System.out.println("Public variable: " + example.publicVar);
        example.publicMethod();

        
        System.out.println("Protected variable: " + example.protectedVar);
        example.protectedMethod();

        // Accessing default 
        System.out.println("Default variable: " + example.defaultVar);
        example.defaultMethod();
    }
}

// Subclass
class Subclass extends AccessModifier {
    public void accessProtectedMethod() {
        // Protected method can be accessed in the subclass
        protectedMethod();
    }
}
