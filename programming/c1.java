import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class c1 {
    public static void main(String[] args) {
        String filePath = "/Users/laiminhan/Desktop/hackthissite/programming/c11.txt";
        Scanner scanner = null; // Initialize scanner outside the try block
        int noLines = 0;
        String answer = "";

        try {
            File file = new File(filePath);
            scanner = new Scanner(file);

            // Count the number of lines
            while (scanner.hasNextLine()) {
                noLines++;
                scanner.nextLine(); // Consume the line
            }

            // Reset the scanner to the beginning of the file
            scanner.close();
            scanner = new Scanner(file);

            String[] temp = new String[noLines];
            for (int i = 0; i < noLines; i++) {
                temp[i] = scanner.nextLine();
            }

            //answer = Arrays.toString(temp);
            answer = String.join(",", temp);
            System.out.println(answer);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found at " + filePath);
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close(); // Ensure scanner is closed even if an exception occurs
            }
        }
    }
}