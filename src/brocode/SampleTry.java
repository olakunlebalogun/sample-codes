package src.brocode;

import java.util.Scanner;

public class SampleTry {
    public static String SearchingChallenge(String str) {
        // code goes here
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(0));
        }
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(SearchingChallenge(s.nextLine()));

        String str = "agettkgaeee";

        for (int i = 0; i < str.length(); i++) {
            String index = str.split("")[i];
            String leftOver = str.substring(0,i) + str.substring(i+1);
//            System.out.println(leftOver);
//            System.out.println(index);
            if (!leftOver.contains(index)){
                System.out.println(index);
            }


        }
    }

}
