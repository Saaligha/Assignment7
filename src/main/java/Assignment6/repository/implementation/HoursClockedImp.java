package Assignment6.repository.implementation;

import Assignment6.domain.HoursClocked;
import Assignment6.repository.HoursClockedRepo;

import java.util.HashSet;
import java.util.Set;

public class HoursClockedImp implements HoursClockedRepo {

    private static HoursClockedImp repository = null;
    private Set <HoursClocked> hoursClocked;

    private HoursClockedImp(){
        this.hoursClocked = new HashSet<>();
    }
    public Set<HoursClocked> getAll() {
        return null;
    }

    @Override
    public HoursClocked create(HoursClocked hoursClocked) {
     this.hoursClocked.add((hoursClocked));
     return hoursClocked;
    }

    @Override
    public HoursClocked update(HoursClocked hoursClocked)
    {
        this.hoursClocked.add((hoursClocked));
        return hoursClocked;
    }

    @Override
    public void delete(String s) {
    this.hoursClocked.remove(hoursClocked);
    }

    @Override
    public HoursClocked read(String s) {
        return null;
    }
}
