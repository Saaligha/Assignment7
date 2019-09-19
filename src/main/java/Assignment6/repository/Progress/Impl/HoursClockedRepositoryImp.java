package Assignment6.repository.Progress.Impl;

import Assignment6.domain.Progress.HoursClocked;
import Assignment6.repository.Progress.HoursClockedRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("HoursClockedRepositoryImp")
public class HoursClockedRepositoryImp implements HoursClockedRepo {

    private static HoursClockedRepositoryImp repository = null;
    private Set<HoursClocked> h;

    private HoursClockedRepositoryImp(){
        this.h = new HashSet<>();
    }



    public static HoursClockedRepo getRepository(){
        if(repository == null) repository = new HoursClockedRepositoryImp();
        return repository;
    }

    @Override
    public Set<HoursClocked> getAll() {
        return h;
    }

    @Override
    public HoursClocked create(HoursClocked hoursClocked) {
        h.add(hoursClocked);
        return hoursClocked;
    }

    @Override
    public HoursClocked update(HoursClocked hoursClocked) {
      //  HoursClockedRepositoryImp inDB = read(h.g);

     //   if(inDB != null){
       //     h.remove(inDB);
//            return h;
        return null;
        }

      //  return null;


    @Override
    public void delete(String s) {
        h.remove(s);
    }

    @Override
    public HoursClocked read(String s) {
        return null;
    }
}
