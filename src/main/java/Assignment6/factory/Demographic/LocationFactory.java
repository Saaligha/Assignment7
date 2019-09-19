package Assignment6.factory.Demographic;

import Assignment6.domain.Demographic.Location;


public class LocationFactory {

    public static Location getUserRegion(String region) {
        return new Location.Builder().region(region).build();
    }
}


