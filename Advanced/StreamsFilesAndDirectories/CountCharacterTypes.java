package Advanced.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CountCharacterTypes {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\vesko\\OneDrive\\Desktop\\Programming\\SoftUni\\SoftUni\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "C:\\Users\\vesko\\OneDrive\\Desktop\\Programming\\SoftUni\\SoftUni\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        int countVowels = 0;
        int countSymbols = 0;
        int countPunctuation = 0;

        try(BufferedReader bufferedReader = Files.newBufferedReader(Path.of(inputPath));
            BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(outputPath))){

            String line = bufferedReader.readLine();
            while (line != null){
                String[] lineList = line.split("");
                for (int i = 0; i < line.length(); i++){
                    switch (lineList[i]){
                        case "a":
                        case "e":
                        case "i":
                        case "o":
                        case "u":
                            countVowels += 1;
                            break;
                        case "!":
                        case ",":
                        case ".":
                        case "?":
                            countPunctuation += 1;
                            break;
                        case " ":
                            break;
                        default:
                            countSymbols += 1;
                            break;
                    }
                }
                line = bufferedReader.readLine();
            }

            bufferedWriter.write("Vowels: " + countVowels);
            bufferedWriter.newLine();
            bufferedWriter.write("Other symbols: " + countSymbols);
            bufferedWriter.newLine();
            bufferedWriter.write("Punctuation: " + countPunctuation);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
