//package Assignment6.services.Progress.Impl;

import Assignment6.domain.Progress.HoursClocked;
import Assignment6.repository.Progress.HoursClockedRepo;
import Assignment6.repository.Progress.Impl.HoursClockedRepositoryImp;
import Assignment6.services.Progress.HoursClockedService;
import org.springframework.stereotype.Service;

import java.util.Set;
/*
@Service("HoursClockedServiceImpl")
public class HoursSerImpl implements HoursClockedService {

    private HoursClockedRepo repository;
    private HoursSerImpl service = null;

    public HoursSerImpl( ){this.repository= HoursClockedRepositoryImp.getRepository();}

    public HoursSerImpl getService(){
        if(service==null){
           // service=new HoursClockedRepositoryImp.getRepository();
        }
    //}

    @Override
    public Set<HoursClocked> getAll() {
        return this.repository.getAll();
    }

    @Override
    public HoursClocked create(HoursClocked type) {
        return repository.create(type);
    }

    @Override
    public HoursClocked update(HoursClocked type) {
        return repository.update(type);
    }

    @Override
    public void delete(String s) {
    repository.delete(s);
    }

    @Override
    public HoursClocked read(String s) {
        return repository.read(s);
    }
}*/
