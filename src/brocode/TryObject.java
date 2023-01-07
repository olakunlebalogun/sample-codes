package src.brocode;

import java.util.UUID;

public class TryObject {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        System.out.println(randomUUIDString);
        System.out.println(uuid);
    }
}
