package Assignment6.util;

import java.util.UUID;

public class GenerateId {

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

}
