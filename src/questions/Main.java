package src.questions;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String answer = replaceWordInSentence("My name is Isaiah , I hate other people name Isaiah ,because i am the only true Isaiah", "Isaiah", "David");
        System.out.println(answer);

        Date today = new Date();
        LocalDateTime ldt = LocalDateTime.now();

        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(today));
//        System.out.println(today);
//        System.out.println(ldt);


    }


    // My name is Isaiah // Isaiah // David
    public static String replaceWordInSentence ( String sentence, String oldWord, String newWord) {

        String result = "";
        String[] data = {};
        if (!sentence.equals("") && sentence.contains(oldWord) ) {
            String [] words = sentence.split(" ");

            for (String word : words) {

                if (word.equals(oldWord)){
                    word = newWord;

                }
//                result += " " + word;
                String.join(" ", word);
            }
        }
        else {
            return "THE SENTENCE IS EITHER EMPTY OR IT DOES NOT CONTAIN THE OLDWORD";
        }

        return result;
    }

}
