package Assignment6.factory;

import Assignment6.domain.Demographic;

public class DemographicFactory {


    public static Demographic demo(String race, String gender) {
        return new Demographic.Builder()
               .race(race)
                .gender(gender)
                .build();

    }
}


