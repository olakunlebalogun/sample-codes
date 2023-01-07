package read.write.excel.generics;

import java.time.LocalDate;

public class LocalDateSample {
    public static void main(String[] args) {
        //         LocalDate dt = LocalDate.ofEpochDay(LocalDate.now());
        String dt = LocalDate.now().toString();
        System.out.println(dt);

    }
}
