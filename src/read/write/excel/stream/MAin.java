package src.read.write.excel.stream;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MAin {
    public static void main(String[] args) {
        Optional opt = List.of("Berkley", "Shirley", "Marcus", "Berlin").stream().findAny();

        List<Book> books = new ArrayList<>();
        books.add(new Book("JK Rowling", "Harry Porter", 30.00));
        books.add(new Book("George RR Martin", "Song of Ice and Fire", 45.00));
        books.add(new Book("Jordan Peterson", "12 Rules of Life", 8.50));
        books.add(new Book("Power of Habit", "Charles Duhigg", 9.00));
        books.add(new Book("7 Habit of Highly Effective People", "Steve Covey", 10.00));

        Map<String, Double> mapAuthorAndPrice = books.stream().collect(Collectors.toMap(Book::getAuthor, Book::getPrice));
        System.out.println(mapAuthorAndPrice);

        Map<String, Book> mapAuthorAndBook = books.stream().collect(Collectors.toMap(Book::getAuthor, Function.identity()));
        System.out.println(mapAuthorAndBook);




        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        song.forEach(s -> System.out.println(s));

        String[] stringArr = new String[10];
        stringArr[0] = "How many days can it wait";
        stringArr[1] = "No more tears stuck in my eyes";
        stringArr[2] = "watch me go all over the world";
        stringArr[3] = "You can never reach me now";
        stringArr[4] = "To boys on street waging war from within";
        stringArr[5] = "To girl who refuses to be the one he abuses";
        stringArr[6] = "I'm a star";
        stringArr[7] = "Burning Bright";
        stringArr[8] = "I felt my life was left behind";
        stringArr[9] = "Struggling for peace of mind";

        Stream st = Arrays.stream(stringArr, 3, 10);
        st.forEach(i -> System.out.println(i));
//        st.filter(i -> i.startsWith("I") ).

        // This creates an Infinite Loop of String "Echo"
        System.out.println("-------------------Infinite Streams of Echo String-----------------------------------------");

        Stream<String> echos = Stream.generate(() -> "Echo");
//        echos.forEach(i -> System.out.println(i));

        System.out.println("Some Random Number: " +Math.random());

        System.out.println("-------------------Infinite Streams of random()-----------------------------------------");
        Stream<Double> randoms = Stream.generate(Math::random);
//        randoms.forEach(i -> System.out.println(i));

        System.out.println("------------------- Infinite Streams of Increasing Numbers-----------------------------------------");
        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
//        integers.forEach(i -> System.out.println(i));

        System.out.println("-------------------Finite Streams of random()-----------------------------------------");

        var limit = new BigInteger("100");
        Stream<BigInteger> finiteIntegers = Stream.iterate(BigInteger.ZERO,
                n -> n.compareTo(limit) < 0,
                n -> n.add(BigInteger.ONE));
        finiteIntegers.forEach(i -> System.out.println(i));

        System.out.println("-------------------------------code point example ------------------");
        Stream codeStream = codePoints("boa*t");
        codeStream.forEach(i -> System.out.println(i));
    }
    public static Stream<String> codePoints(String s)
    {
        var result = new ArrayList<String>();
        int i = 0;
        while (i < s.length())
        {
            int j = s.offsetByCodePoints(i, 1);
            result.add(s.substring(i, j));
            i = j;
        }
        return result.stream();
    }

}
