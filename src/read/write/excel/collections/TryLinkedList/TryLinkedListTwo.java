package read.write.excel.collections.TryLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class TryLinkedListTwo {
    public static void main(String[] args) {
        var a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        var b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        // merge the words from b into a
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);

// remove every second word from b

        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next(); // skip one element
            if (bIter.hasNext()) {
                bIter.next(); // skip next element
                bIter.remove(); // remove that element
            }
        System.out.println(b);

// bulk operation: remove all words in b from a
        a.removeAll(b);
        System.out.println(a);
        }

        System.out.println("--------------------------------");
        var sorter = new TreeSet<String>();
        sorter.add("bob");
        sorter.add("Ba");
        sorter.add("Bob");

        sorter.add("Amy");
        sorter.add("Carl");
        for (String s : sorter) System.out.println(s);

        System.out.println(null != null);
    }
}
