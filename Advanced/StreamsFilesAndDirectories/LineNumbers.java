package Advanced.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) {


        String textPath = "C:\\Users\\vesko\\OneDrive\\Desktop\\Programming\\SoftUni\\SoftUni\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        String wordsPath = "C:\\Users\\vesko\\OneDrive\\Desktop\\Programming\\SoftUni\\SoftUni\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String outputPath = "C:\\Users\\vesko\\OneDrive\\Desktop\\Programming\\SoftUni\\SoftUni\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        List<String> wordsList = new ArrayList<>();
        int word1 = 0;
        int word2 = 0;
        int word3 = 0;

        try(BufferedReader bufferedReaderText = Files.newBufferedReader(Path.of(textPath));
            BufferedReader bufferedReaderWords = Files.newBufferedReader(Path.of(wordsPath));
            BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(outputPath))){

            String line = bufferedReaderWords.readLine();
            while (line != null){
                String[] n = line.split(" ");
                wordsList.addAll(Arrays.asList(n));
                line = bufferedReaderWords.readLine();
            }

            String line1 = bufferedReaderText.readLine();
            while (line1 != null){
                String[] textInfo = line1.split(" ");

                for (String string : textInfo) {
                    if (wordsList.get(0).contains(string)){
                        word1 += 1;
                    }else if (wordsList.get(1).contains(string)){
                        word2 += 1;
                    } else if (wordsList.get(2).contains(string)) {
                        word3 += 1;
                    }
                }

                line1 = bufferedReaderWords.readLine();
            }
            bufferedWriter.write(wordsList.get(0) + " - " + word1);
            bufferedWriter.newLine();
            bufferedWriter.write(wordsList.get(1) + " - " + word2);
            bufferedWriter.newLine();
            bufferedWriter.write(wordsList.get(2) + " - " + word3);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
