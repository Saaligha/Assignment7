package Assignment6.services.Impl;

import Assignment6.domain.HoursClocked;
import Assignment6.repository.HoursClockedRepo;
import Assignment6.services.HoursClockedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("HoursSerImpl")
public class HoursSerImpl implements HoursClockedService {
    @Autowired
    @Qualifier("HoursClockedImp")
    private HoursClockedRepo repository;


    public HoursSerImpl(HoursClockedRepo repository){this.repository= repository;}


    @Override
    public Set<HoursClocked> getAll() {
        return null;
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
}
