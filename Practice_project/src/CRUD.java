import java.io.*;
import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
        try {
            // Create a new file
            File file = new File("sample.txt");
            
            // Write data to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, World!");
            writer.close();
            
            // Read data from the file
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("File Content: " + line);
            }
            scanner.close();
            
            // Update data in the file
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("\nThis is an updated line.");
            appendWriter.close();
            
            // Read updated data
            Scanner updatedScanner = new Scanner(file);
            while (updatedScanner.hasNextLine()) {
                String updatedLine = updatedScanner.nextLine();
                System.out.println("Updated File Content: " + updatedLine);
            }
            updatedScanner.close();
            
            // Delete the file
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
