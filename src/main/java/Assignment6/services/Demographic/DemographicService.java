package Assignment6.services.Demographic;

import Assignment6.domain.Demographic.Demographic;
import Assignment6.services.IService;

import java.util.Set;

public interface DemographicService extends IService<Demographic, String> {
    Set<Demographic> getAll();
}
