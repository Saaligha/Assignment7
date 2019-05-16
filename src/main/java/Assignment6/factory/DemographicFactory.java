package Assignment6.factory;

import Assignment6.domain.Demographic;

public class DemographicFactory {


    public static Demographic demo(String race) {
        return new Demographic.Builder()
                .setRace(race)
                .build();

    }
}


