package Assignment6.services;

import Assignment6.domain.LogIn;

import java.util.Set;

public interface LogInService extends IService<LogIn, String> {
    Set<LogIn> getAll();
}
