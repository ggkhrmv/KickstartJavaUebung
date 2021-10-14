package ggkhrmv.kickstart.StreamsAPIExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadAndFilterFile {

    public static void main(String[] args) throws IOException {

        Map<Integer, String> userInput = new HashMap<>();
        userInput.put(1, "KickstartJava/ExampleFiles/IntelliJArticle.txt");
        userInput.put(2, "KickstartJava/ExampleFiles/JavaArticle.txt");
        userInput.put(3, "KickstartJava/ExampleFiles/PythonArticle.txt");

        int userIn;

        String regexFilter;

        Scanner s = new Scanner(System.in);

        System.out.println("FILTER\tYOUR\tFILES");
        System.out.println();
        System.out.println("With this program you can filter sample wiki articles for words.");
        System.out.println("""
                To start please select on of these files by typing in the number:
                1. IntelliJ Article
                2. Java Article
                3. Python Article
                """);

        userIn = s.nextInt();

        System.out.println("The filter will output a line/lines containing the word you filter for.");
        System.out.println("Please type in a word you want to filter for:");

        regexFilter = s.next();
        Pattern pattern = Pattern.compile(regexFilter, Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);

        String regexWords = "[(\\s+)(\\.)]"; // split after every dot, white space, break etc. -> split into words
        String regexSentence = "\\."; // split after every dot -> split into sentences

        String regexCommaRef = "\\[..\\]|[\\,]"; //replace every reference([xy]) and every comma
        String regexRef = "..[0-9]\\]"; //replace every reference

        List<String> sentenceFiltered = Files.lines(Paths.get(userInput.get(userIn)))
                .map(st -> st.replaceAll(regexRef, ""))
                .map(line -> line.split(regexSentence))
                .flatMap(Arrays::stream)
                .filter(pattern.asPredicate())
                .collect(Collectors.toList());

        List<String> wordsFiltered = Files.lines(Paths.get(userInput.get(userIn)))
                .map(st -> st.replaceAll(regexCommaRef, ""))
                .map(line -> line.split(regexWords))
                .flatMap(Arrays::stream)
                .filter(pattern.asPredicate())
                .collect(Collectors.toList());


        sentenceFiltered.forEach(System.out::println);
        System.out.println();
        System.out.println("The filtered word occurs " + wordsFiltered.size() + " times");

    }

}
