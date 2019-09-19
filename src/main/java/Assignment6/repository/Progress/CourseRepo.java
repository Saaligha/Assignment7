package Assignment6.repository.Progress;

import Assignment6.domain.Progress.Course;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface CourseRepo extends RepoA<Course, String> {
    Set<Course> getAll();
}
