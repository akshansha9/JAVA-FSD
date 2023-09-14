import java.util.regex.*;

public class regular_Ex {
    public static void main(String[] args) {
        // Sample text to work with
        String text = "conscious cognitive processes that can happen independently of sensory stimulation.";

        // Pattern for matching words
        String pattern = "\\b\\w+\\b";

        // Create a Pattern object
        Pattern regexPattern = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regexPattern.matcher(text);

        // Find and print all words in the text
        System.out.println("Words in the text:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // Use regular expression to replace words
        String replacedText = text.replaceAll("fox", "cat");
        System.out.println("\nReplaced text: " + replacedText);

        // Check if the text contains a specific pattern
        boolean containsPattern = Pattern.compile("cognitive").matcher(text).find();
        System.out.println("\nContains 'cognitive': " + containsPattern);

        // Extract numbers from a string
        String textWithNumbers = "The price is rs85.99 and With 20% margin.";
        Pattern numberPattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher numberMatcher = numberPattern.matcher(textWithNumbers);

        System.out.println("\nNumbers in the text:");
        while (numberMatcher.find()) {
            System.out.println(numberMatcher.group());
        }
    }
}
