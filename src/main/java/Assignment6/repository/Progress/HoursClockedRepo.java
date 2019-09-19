package Assignment6.repository.Progress;

import Assignment6.domain.Progress.HoursClocked;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface HoursClockedRepo extends RepoA<HoursClocked, String> {
    Set<HoursClocked> getAll();
}
