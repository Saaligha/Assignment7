package Assignment6.services.Results;

import Assignment6.domain.Results.Results;
import Assignment6.services.IService;

import java.util.Set;

public interface ResultsServices extends IService<Results, String> {
    Set<Results> getAll();
}
