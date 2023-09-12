import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs (String to Integer)
        Map<String, Integer> studentScores = new HashMap<>();

        // Add key-value pairs to the map
        studentScores.put("Ram", 85);
        studentScores.put("ramesh", 92);
        studentScores.put("Sita", 78);
        studentScores.put("dev", 94);

        // Access values by keys
        int aliceScore = studentScores.get("Ram");
        System.out.println("Ram's Score: " + aliceScore);

        // Check if a key exists
        boolean exists = studentScores.containsKey("Shyam");
        System.out.println("Shyam's Score Exists: " + exists);

        // Iterate through the map
        System.out.println("\nStudent Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String studentName = entry.getKey();
            int score = entry.getValue();
            System.out.println(studentName + ": " + score);
        }

        // Remove a key-value pair
        studentScores.remove("Sita");

        // Check if the map is empty
        boolean isEmpty = studentScores.isEmpty();
        System.out.println("\nIs the Map Empty: " + isEmpty);
    }
}
