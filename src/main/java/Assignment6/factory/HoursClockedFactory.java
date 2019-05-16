package Assignment6.factory;

import Assignment6.domain.HoursClocked;

public class HoursClockedFactory {

    public static HoursClocked hours(int hours){
        return new HoursClocked.Builder().hours(hours).build();
    }
}
