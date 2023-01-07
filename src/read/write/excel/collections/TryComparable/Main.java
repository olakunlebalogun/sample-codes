package read.write.excel.collections.TryComparable;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Person psnOne = new Person("olakunle");
        Person psnTwo = new Person("olaoluwa");

        System.out.println(psnOne.compareTo(psnTwo));
        String hello = "Hello";
        System.out.println(hello);

        Set<String> testNames = new TreeSet<>();
        testNames.add("Abigail");
        testNames.add("Clara");
        testNames.add("Belinda");
        System.out.println(testNames);
    }
}
