package Assignment6.services;

import Assignment6.domain.Demographic;

import java.util.Set;

public interface DemographicService extends IService<Demographic, String> {
    Set<Demographic> getAll();
}
