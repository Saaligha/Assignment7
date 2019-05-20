package Assignment6.services;

import Assignment6.domain.Course;

import java.util.Set;

public interface CourseService extends IService<Course, String> {
    Set<Course> getAll();
}
