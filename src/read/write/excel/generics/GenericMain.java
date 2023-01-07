package read.write.excel.generics;

public class GenericMain {
    public static void main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg2.minmax(words);
//        Pair<String> mm = ArrayAlg.minmax(new String[]{"you", "pinky", "little", "bum"});

        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());









        String a = "relax";
        String b = "Rdmin";
        System.out.println(a.compareTo(b)); // This arranges basic on ASCII order, therefore 'A' < 'a'
    }
}

class ArrayAlg {
    /**
     Gets the minimum and maximum of an array of objects of type T.
     @param a an array of objects of type T
     @return a pair with the min and max values, or null if a is null or empty
     */
    public static Pair<String> minmax (String[] a) {
        if ( a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];


        for (int i = 1; i < a.length; i++){
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return  new Pair<>(min, max);
    }
}