package src.questions;

public class RandomlyGeneratedID {
    public static void main(String[] args) {

//        System.out.println(Math.floor(Math.random()*36));
        String allPosValues = "0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < 6; i++) {

            answer.append(allPosValues.charAt((int)Math.floor(Math.random()*allPosValues.length())));

        }
        System.out.println(answer);

//        System.out.printf("Hello, %s. Next year, you'll be %d", name, age);
        String name = "lanre";
        System.out.printf("The generated code is %s", name );
        System.out.println();
//        System.out.println(allPosValues.length());

        System.out.printf("%0.2f", 10000.0 / 3.0);

    }

    public static String generateRandom () {
        String allPosValues = "0123456789abcdefghijklmnopqrstuvwxyz";


        return "";
    }
}
