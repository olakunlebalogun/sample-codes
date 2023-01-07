package src.brocode;

import java.util.Scanner;

public class RegexQuiz {
    public static String SearchingChallenge(String str) {
        // code goes here

        if (str.matches("[0-9a-zA-Z|_]{4,25}+(?<!_)$")){
            return  "true";
        }
        else {
            return "false";
        }
    }

    public static void printNames (String... args) {
        for (String arg : args) {

            System.out.println(arg);
        }
    }
    public static void printName (String args) {

        System.out.println(args);
    }


    public static void main (String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(SearchingChallenge(s.nextLine()));
//        u__hello_world123

        printNames("Olakunle", "Balogun", "Olaoluwa");
        printName("Hi");
    }
}
