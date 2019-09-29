package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Demographic;

public class DemographicFactory {
    public static Demographic getDemographic(String venueID, String venueName, String venueDisc, String venueLevel) {
        return new Demographic.Builder().venueID(venueID).venueName(venueName).venueDisc(venueDisc).venueLevel(venueLevel).build();
    }
}


