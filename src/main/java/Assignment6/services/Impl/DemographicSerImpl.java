package Assignment6.services.Impl;

import Assignment6.domain.Demographic;
import Assignment6.repository.DemographicRepo;
import Assignment6.repository.implementation.DemographicImp;
import Assignment6.services.DemographicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("DemographicService")
public class DemographicSerImpl implements DemographicService {

@Autowired
@Qualifier("DemographicImp")

private DemographicRepo repository;

public DemographicSerImpl(DemographicRepo repository){this.repository = repository; }


    @Override
    public Set<Demographic> getAll() {
        return null;
    }

    @Override
    public Demographic create(Demographic type) {
        return this.repository.create(type);
    }

    @Override
    public Demographic update(Demographic type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Demographic read(String s) {
        return repository.read(s);
    }
}
