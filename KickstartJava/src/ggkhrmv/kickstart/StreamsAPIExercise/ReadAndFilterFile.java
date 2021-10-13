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

        String regex;

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

        System.out.println("The filter will output a line containing the word you filter for.");
        System.out.println("Please type in a word you want to filter for:");

        regex = s.next();
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);


        Stream<String> stream = Files.lines(Paths.get(userInput.get(userIn)));
        String text = stream.collect(Collectors.joining());

        String[] sWords;
        sWords = text.split("[(\\s+)(\\.)]");
        List<String> aWords;
        aWords = Arrays.asList(sWords);

        String[] sSentence;
        sSentence = text.split("\\.");
        List<String> aSentence;
        aSentence = Arrays.asList(sSentence);


        List<String> filteredWords = aWords.stream()
                .map(st -> st.replaceAll("[[\\[[0-9]\\]][\\,]]", ""))
                .filter(pattern.asPredicate())
                .collect(Collectors.toList());

        List<String> filteredSentence = aSentence.stream()
                .map(st -> st.replaceAll("..[0-9]\\]", ""))
                .filter(pattern.asPredicate())
                .collect(Collectors.toList());

        filteredSentence.forEach(System.out::println);
        System.out.println();
        System.out.println("The filtered word occurs "+filteredWords.size()+" times");

    }

}
