package Assignment6.repository;

import Assignment6.domain.CompletedCourses;
import Assignment6.domain.Course;

import java.util.Set;

public interface CompletedCourseRepo extends RepoA<Course, String> {
    Set<CompletedCourses> getAll();
}
