public class typecasting {
    public static void main(String[] args) {
        // Implicit Type Casting
        int intValue = 55;
        float floatValue = intValue; // Implicit casting ( int to float )

        System.out.println("int value: " + intValue);
        System.out.println("float value (after implicit casting): " + floatValue);
        
        // Explicit Type Casting
        float floatValue2 = 4;
        int intValue2 = (int) floatValue2; // Explicit casting ( float to int )

        System.out.println("float value: " + floatValue2);
        System.out.println("int value (after explicit casting): " + intValue2);
    }
}
