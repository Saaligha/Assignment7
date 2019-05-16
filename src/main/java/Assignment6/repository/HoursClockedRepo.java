package Assignment6.repository;

import Assignment6.domain.HoursClocked;
import Assignment6.domain.User;

import java.util.Set;

public interface HoursClockedRepo extends RepoA<HoursClocked, String> {
    Set<HoursClocked> getAll();
}
