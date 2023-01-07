package read.write.excel.inerfaceP;

import java.time.LocalDate;
import java.util.function.Function;

public interface SimpleInterface extends Function<Integer, Integer> {

     default void getNumber() {

    }
}
