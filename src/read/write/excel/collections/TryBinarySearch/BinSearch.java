package read.write.excel.collections.TryBinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinSearch {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        ls.add("andrew");
        ls.add("betty");
        ls.add("claire");
        ls.add("dennis");
        ls.add("emily");
        ls.add("falcao");
        ls.add("gary");
        ls.add("harry");
        ls.add("ino");
        ls.add("Jack");
        ls.add("kunle");
        ls.add("larry");
        ls.add("maxwell");
        ls.add("nada");
        ls.add("oliver");
        ls.add("peter");
        ls.add("quadri");
        ls.add("russell");
        ls.add("sinatra");
        ls.add("tom");
        ls.add("umtiti");
        ls.add("vivian");
        ls.add("wallace");
        ls.add("xerxes");



        final long startTime = System.currentTimeMillis();
//        for (String i: ls) {
//            if(i.equalsIgnoreCase("umtiti"))
//                System.out.println("This is " + i);
//        }

        int index = Collections.binarySearch(ls, "umtiti", null);
        System.out.println("the search umtiti is at " + index);

        final long endTime = System.currentTimeMillis();


        System.out.println("Total execution time: " + (endTime - startTime));

    }
}
