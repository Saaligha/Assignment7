package Assignment6.services.Progress;

import Assignment6.domain.Progress.HoursClocked;
import Assignment6.services.IService;

import java.util.Set;

public interface HoursClockedService extends IService<HoursClocked, String> {
    Set<HoursClocked> getAll();
}
