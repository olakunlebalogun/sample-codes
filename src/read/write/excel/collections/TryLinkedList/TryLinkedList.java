package read.write.excel.collections.TryLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TryLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Amy");
        linkedList.add("Bob");
        linkedList.add("Claire");

        Iterator it = linkedList.iterator();
        it.next();
//        linkedList.add("Ernest");


        ListIterator lst = linkedList.listIterator();
//        lst.next();
//        lst.previous();
        lst.add("Dray");


        System.out.println(linkedList);
    }
}
