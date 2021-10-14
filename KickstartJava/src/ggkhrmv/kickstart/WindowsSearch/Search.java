package ggkhrmv.kickstart.WindowsSearch;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Search implements Runnable {

    private Thread t;
    private File dir;
    String search;


    Search(File dir, String search) {
        this.dir = dir;
        this.search = search;
    }

    public void run() {
        List<Search> multiThreads = new ArrayList<>();
        File[] contents = dir.listFiles();

        int i = 0;

        if (contents == null) {
        } else {
            for (File f : contents) {

                String name = f.getName().toLowerCase(Locale.ROOT);
                if (name.contains(search)) {
                    System.out.println(f.getAbsoluteFile());
                }

                if (f.isDirectory()) {
                    Search s = new Search(contents[i], search);
                    multiThreads.add(s);
                }
                i++;
            }
        }
        for (Search multiThread : multiThreads) {
            multiThread.start();
        }
    }


    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

}
