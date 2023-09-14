public class conversion_class {
    public static void main(String[] args) {
        // Create a String
        String str = "Hello, World!";

        // Convert String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);

        // Convert String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);

        // Display the original String
        System.out.println("Original String: " + str);

        // Display the StringBuffer
        System.out.println("StringBuffer: " + stringBuffer);

        // Display the StringBuilder
        System.out.println("StringBuilder: " + stringBuilder);
    }
}
