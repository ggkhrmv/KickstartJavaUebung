package ggkhrmv.kickstart.StreamsAPIExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
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

        regex = s.next() + "[^.]*";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);


        Stream<String> stream = Files.lines(Paths.get(userInput.get(userIn)));
        String text = stream.collect(Collectors.joining());

        String[] str = text.split("\\.");
        List<String> al;
        al = Arrays.asList(str);


        List<String> filtered = al.stream()
                .map(st -> st.replaceAll("\\.\\s?", "\\.\n"))
                .filter(pattern.asPredicate())
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);

    }

}
