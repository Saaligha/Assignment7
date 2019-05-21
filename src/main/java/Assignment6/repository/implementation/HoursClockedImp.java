package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.domain.HoursClocked;
import Assignment6.repository.HoursClockedRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("HoursClockedRepo")
public class HoursClockedImp implements HoursClockedRepo {

    private static HoursClockedImp repository = null;
    private Map<String, HoursClocked> hoursClocked;

    private HoursClockedImp(){
        this.hoursClocked = new HashMap<>();
    }



    public static HoursClockedRepo getRepository(){
        if(repository == null) repository = new HoursClockedImp();
        return repository;
    }
    @Override
    public HoursClocked create(HoursClocked hoursClocked) {
     this.hoursClocked.put(String.valueOf(hoursClocked.getHours()),hoursClocked);
     return hoursClocked;
    }
    public Set<HoursClocked> getAll() {
        Collection<HoursClocked> hour = this.hoursClocked.values();
        Set<HoursClocked> set = new HashSet<>();
        set.addAll(hour);
        return set;
    }
    @Override
    public HoursClocked update(HoursClocked hoursClocked)
    {
        this.hoursClocked.replace(String.valueOf(hoursClocked.getHours()), hoursClocked);
        return hoursClocked;
    }

    @Override
    public void delete(String s) {
        this.hoursClocked.remove(s);
    }


    @Override
    public HoursClocked read(final String s)
    {
        return this.hoursClocked.get(s);
    }
}
