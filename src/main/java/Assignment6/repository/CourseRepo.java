package Assignment6.repository;

import Assignment6.domain.Course;

import java.util.Set;

public interface CourseRepo extends RepoA<Course, String> {
    Set<Course> getAll();
}
