interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C");
    }
}

class D implements B, C {
    // To resolve the diamond problem, override the conflicting method
    @Override
    public void show() {
        B.super.show(); // Call the show() method from interface B
        C.super.show(); // Call the show() method from interface C
    }
}

public class Diamond_problem {
    public static void main(String[] args) {
        D d = new D();
        d.show();
    }
}
