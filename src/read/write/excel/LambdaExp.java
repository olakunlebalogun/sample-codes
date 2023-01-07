package read.write.excel;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class LambdaExp {

    public static void main(String[] args) {
        var planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };
        System.out.println(Arrays.toString(planets));
        System.out.println("-----------------------------------------------------");
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("-----------------------------------------------------");
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
        System.out.println("-----------------------------------------------------------");
//        Arrays.sort(planets, (a,b) -> a.substring(1).compareTo(b.substring(1)));

        Arrays.sort(planets, Comparator.comparing(a -> a.substring(1)));
        System.out.println(Arrays.toString(planets));
//        Earth, Mars, Saturn, Mercury, Neptune, Venus, Pluto, Uranus, Jupiter



        System.out.println("---=============================================================---");

        var timer = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }


}
