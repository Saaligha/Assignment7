package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.Progress;

import java.util.Set;

public interface ProgressRepo extends RepoA<Course, String> {
    Set<Progress> getAll();
}
