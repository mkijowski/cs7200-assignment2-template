//#######
//
// CEG 7200: Algorithm Design and Analysis
//
// Template java file with sample code for reading files in java
//
// Taken from https://gist.github.com/halolimat/362434158a97dfd12b235f2d30b2047b
//
// Be sure to put your names and assignment info in comments up here
//
// If you are using JAVA package your code as a jar:
// https://www.webucator.com/how-to/how-create-jar-file-java.cfm
// https://stackoverflow.com/questions/8123058/passing-on-command-line-arguments-to-runnable-jar
//
//########

with open("input.txt") as f:


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class ReadFileClass {

    public static void main(String args[]) {

        String fileName = "input.txt";
        List<int[]> B = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            B = stream.map(line -> line.split(", ")).map(str -> Stream.of(str).mapToInt(Integer::parseInt).toArray()).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
