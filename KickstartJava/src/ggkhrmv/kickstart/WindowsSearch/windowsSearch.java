package ggkhrmv.kickstart.WindowsSearch;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class windowsSearch {

    public static void main(String[] args) throws IOException {


        int i = 1;
        boolean inputCorrect = false;

        Map<Integer, File> selection = new HashMap<>();

        String regexSearch;

        File[] paths;
        paths = File.listRoots();

        Scanner s = new Scanner(System.in);
        int dirIn;

        System.out.println("WINDOWS\tSEARCH");
        System.out.println("==============");
        System.out.println("Please insert the search string:");

        regexSearch = s.next();
        regexSearch = regexSearch.toLowerCase(Locale.ROOT);

        System.out.println("Please select a drive to search in.");
        for (File path : paths) {
            System.out.println(i + ". " + path);
            selection.put(i, path);
            i++;
        }

        do {

            dirIn = s.nextInt();
            if ((dirIn < i) && (dirIn > 0)) {
                inputCorrect = true;
            } else {
                System.out.println("Input incorrect, please select a drive!");
            }

        } while (!inputCorrect);

        System.out.println("Searching for \"" + regexSearch + "\" in " + selection.get(dirIn));

        File dir = selection.get(dirIn);
        Search search = new Search(dir, regexSearch);
        System.out.println("FOUND\tMATCHES");
        System.out.println("===============");
        search.start();


    }
}
