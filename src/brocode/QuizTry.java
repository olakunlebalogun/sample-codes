package src.brocode;

import java.util.Scanner;

public class QuizTry {
    public static String SearchingChallenge(String str) {
        String answer = "";
        String finalAnswer = "";
        // code goes here
        for (int i = 0; i < str.length(); i++) {
            String currentIndex = str.split("")[i]; // There might be an error here
            String leftOver = str.substring(0,i) + str.substring(i+1);

            if(!leftOver.contains(currentIndex)){
                answer = currentIndex;
                break;
            }
        }

        // return answer;
        String challengeToken = "lj3g5eurac";
        String appendedToken = answer + challengeToken;

        for (int j = 3; j < appendedToken.length(); j+=4){
            String atPosition = appendedToken.substring(j, j+1);
            String replacer = "_";
            finalAnswer = appendedToken.replace(atPosition, replacer);
            appendedToken = finalAnswer;
        }

        return finalAnswer;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }
}
