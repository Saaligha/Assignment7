package Assignment6.factory.Progress;

import Assignment6.domain.Progress.HoursClocked;


public class HoursClockedFactory {

    public static HoursClocked hours(int hours){
        return new HoursClocked.Builder().hours(hours).build();
    }
}
