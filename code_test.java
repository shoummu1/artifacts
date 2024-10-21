import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Get source and destination file paths from the user
            System.out.print("Enter the source file path: ");
            String sourceFile = reader.readLine();
            System.out.print("Enter the destination file path: ");
            String destFile = reader.readLine();

            // FileInputStream and FileOutputStream are legacy IO classes
            FileInputStream in = new FileInputStream(sourceFile);
            FileOutputStream out = new FileOutputStream(destFile);
            
            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
            }

            // Close the streams
            in.close();
            out.close();
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
