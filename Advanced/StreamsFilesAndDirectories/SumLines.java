package Advanced.StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\vesko\\OneDrive\\Desktop\\Programming\\SoftUni\\SoftUni\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null){
                int sum = 0;
                for (char c : line.toCharArray()) {
                    sum += (int) c;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
