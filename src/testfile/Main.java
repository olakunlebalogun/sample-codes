package testfile;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File f = new File("/home/olakunle/Folders/Work/Swipe/Assignment/application.properties");
        if (f.exists()) {
            System.out.println("Yeah, carry on!");

        }

        else {
            System.out.println("This one i no understand o");
        }
    }
}
