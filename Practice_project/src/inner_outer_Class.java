// Outer class
class Outer {
    private int outerData = 15;

    // Inner class
    class Inner {
        void displayInner() {
            System.out.println("Inner class: outerData = " + outerData);
        }
    }

    void displayOuter() {
        System.out.println("Outer class: outerData = " + outerData);
    }
}

public class inner_outer_Class {
    public static void main(String[] args) {
        // Create an instance of the outer class
        Outer outerObj = new Outer();

        // Access the outer class's method
        outerObj.displayOuter();

        // Create an instance of the inner class using the outer class instance
        Outer.Inner innerObj = outerObj.new Inner();

        // Access the inner class's method
        innerObj.displayInner();
    }
}
