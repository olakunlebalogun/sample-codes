package read.write.excel.collections;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestTShirts {
    public static void main(String[] args) {
        Map<String, TShirt> roomShirts = new HashMap<>();

        TShirt sweatShirt = new TShirt("grey", 24, "Tommy Hilfilger", "cotton and wool" );
        TShirt tShirt = new TShirt("blue", 26, "Ben Sherman", "cotton" );
        TShirt polo = new TShirt("green", 23, "Levi", "cotton" );
        TShirt shirt = new TShirt("strip, with black and white", 30, "Marks and spencers", "cotton and silk" );
        TShirt strauss = new TShirt("red", 50, "George Clarke", "Silk");
        roomShirts.put("Olakunle", shirt);
        roomShirts.put("Olaoluwa", polo);
        roomShirts.put("isaac", tShirt);
        roomShirts.put("balogun", sweatShirt);
        roomShirts.put("tope", strauss);


                                // Using forEach with Lambda function
//        roomShirts.forEach((person, item)  -> {
//            System.out.println("My name is " + person + " and i own this " +item.getColour() + " shirt");
//            System.out.println(roomShirts.get("Olakunle"));
//        });

//TShirt testT = new TShirt("green", 23, "Levi", "cotton");
//        boolean isShirt = roomShirts.containsValue(strauss);
//        System.out.println(isShirt);


        Set<Map.Entry<String, TShirt>> set = roomShirts.entrySet();
//        System.out.println(set);

//        Study the instance and the static methods of Map, Set, List, Queue, Vector using Lambda too.

//        System.out.println(Map.entry("isaac", tShirt));
        System.out.println(roomShirts.size());


//        System.out.println(roomShirts.values());
//        System.out.println("");
    }
}
