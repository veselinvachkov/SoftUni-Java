package Advanced.StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ALLCAPITALS {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\vesko\\OneDrive\\Desktop\\Programming\\SoftUni\\SoftUni\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "C:\\Users\\vesko\\OneDrive\\Desktop\\Programming\\SoftUni\\SoftUni\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";


        try(BufferedReader bufferedReader = Files.newBufferedReader(Path.of(inputPath));
            BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(outputPath))){

            String line = bufferedReader.readLine();
            while (line != null){
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
