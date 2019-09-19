package Assignment6.services.Demographic.Impl;

import Assignment6.domain.Demographic.Demographic;
import Assignment6.repository.Demographic.DemographicRepo;
import Assignment6.repository.Demographic.Impl.DemographicImp;
import Assignment6.services.Demographic.DemographicService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("DemographicService")
public class DemographicServiceImpl implements DemographicService {

private DemographicServiceImpl service = null;
private DemographicRepo repository;

public DemographicServiceImpl(DemographicRepo repository){this.repository = DemographicImp.getDemographicRepo(); }
 

    @Override
    public Set<Demographic> getAll() {
        return this.repository.getAll();
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
