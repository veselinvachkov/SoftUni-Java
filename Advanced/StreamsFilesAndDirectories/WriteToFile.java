package Advanced.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Set<Character> elements = Set.of(',', '.', '!', '?');

        String path = "C:\\Users\\vesko\\OneDrive\\Desktop\\Programming\\SoftUni\\SoftUni\\src\\Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String path2 = "C:\\Users\\vesko\\OneDrive\\Desktop\\Programming\\SoftUni\\SoftUni\\src\\Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\WriteToFileOutput.txt";

        try (FileInputStream fileInput = new FileInputStream(path);
             FileOutputStream fileOutput = new FileOutputStream(path2)) {

            int oneByte = fileInput.read();

            while (oneByte != -1) {
                char symbol = (char) oneByte;
                if (!elements.contains(symbol)) {
                    fileOutput.write(symbol);
                }
                oneByte = fileInput.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}