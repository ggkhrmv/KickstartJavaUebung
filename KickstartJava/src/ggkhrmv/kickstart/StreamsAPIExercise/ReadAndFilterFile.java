package ggkhrmv.kickstart.StreamsAPIExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadAndFilterFile {

    public static void main(String[] args) throws IOException {

        String IntelliJA = "KickstartJava/ExampleFiles/IntelliJArticle.txt";
        String JavaA = "KickstartJava/ExampleFiles/JavaArticle.txt";
        String PythonA = "KickstartJava/ExampleFiles/PythonArticle.txt";

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
        regex = s.next()+"[^.]*";


        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);


        switch (userIn) {
            case 1:
                Stream<String> stream = Files.lines(Paths.get(IntelliJA));
                String text = stream.collect(Collectors.joining());
                Matcher matcher = pattern.matcher(text);
                while (matcher.find()) {
                    System.out.println(matcher.group(0));
                }
            case 2:
                Stream<String> stream1 = Files.lines(Paths.get(JavaA));
                String text1 = stream1.collect(Collectors.joining());
                Matcher matcher1 = pattern.matcher(text1);
                while (matcher1.find()) {
                    System.out.println(matcher1.group(0));
                }
            case 3:
                Stream<String> stream2 = Files.lines(Paths.get(PythonA));
                String text2 = stream2.collect(Collectors.joining());
                Matcher matcher2 = pattern.matcher(text2);
                while (matcher2.find()) {
                    System.out.println(matcher2.group(0));
                }
        }
    }

}
