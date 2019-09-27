package com.assignments.factory;


import com.assignments.domain.Demographic;

public class DemographicFactory {


    public static Demographic getDemo(String race, String gender) {
        return new Demographic.Builder()
               .race(race)
                .gender(gender)
                .build();

    }
}


