package src.read.write.excel.stream;

import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        Map<String, String> languageNames = locales.collect(
                Collectors.toMap(
                        Locale::getDisplayLanguage,
                        loc -> loc.getDisplayLanguage(loc),
                        (existingValue, newValue) -> existingValue));

        System.out.println(languageNames);


//        locales.forEach(s -> System.out.println(s));
//        locales.filter(s -> s.getCountry() == "en").forEach(s -> System.out.println(s));
    }
}
