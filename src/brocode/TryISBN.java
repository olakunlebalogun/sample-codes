package src.brocode;

public class TryISBN {
    public static void main(String[] args) {
        System.out.println(Math.round(Math.random() * (Math.pow(10, 10))));

    }

    public static String generateISBN () {
        Integer cg1 = 987;
        Long otherNumber = Math.round(Math.random() * (Math.pow(10, 10)));
        String answer = cg1 + "-" + otherNumber;

        return answer;
    }
}
