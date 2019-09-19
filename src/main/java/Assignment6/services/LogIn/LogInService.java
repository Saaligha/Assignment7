package Assignment6.services.LogIn;

import Assignment6.domain.LogIn.LogIn;
import Assignment6.services.IService;

import java.util.Set;

public interface LogInService extends IService<LogIn, String> {
    Set<LogIn> getAll();
}
