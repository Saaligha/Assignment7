package Assignment6.factory.Demographic;

import Assignment6.domain.Demographic.Demographic;

public class DemographicFactory {


    public static Demographic getDemo(String race, String gender) {
        return new Demographic.Builder()
               .race(race)
                .gender(gender)
                .build();

    }
}


