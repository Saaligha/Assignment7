package Assignment6.services;

import Assignment6.domain.HoursClocked;

import java.util.Set;

public interface HoursClockedService extends IService<HoursClocked, String> {
    Set<HoursClocked> getAll();
}
