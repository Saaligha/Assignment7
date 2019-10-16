package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Location;

public class LocationFactory {
    public static Location getLoc(String universityID, String universityName, String universityDisc, String universityLevel) {
        return new Location.Builder().universityID(universityID).universityName(universityName).universityDisc(universityDisc).universityLevel(universityLevel).build();
    }
}


