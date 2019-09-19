package Assignment6.services.Progress;

import Assignment6.domain.Progress.Course;
import Assignment6.services.IService;

import java.util.Set;

public interface CourseService extends IService<Course, String> {
    Set<Course> getAll();
}
