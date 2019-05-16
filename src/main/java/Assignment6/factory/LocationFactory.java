package Assignment6.factory;

import Assignment6.domain.Location;


public class LocationFactory {

    public static Location UserRegion(String region) {
        return new Location.Builder().region().build();
    }
}


