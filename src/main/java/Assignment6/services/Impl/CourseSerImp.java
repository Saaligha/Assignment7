package Assignment6.services.Impl;

import Assignment6.domain.Course;
import Assignment6.repository.CourseRepo;
import Assignment6.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CourseSerImpl")
public class CourseSerImp implements CourseService {
@Autowired
@Qualifier("CourseRepo")
private CourseRepo repository;

    public CourseSerImp(CourseRepo repository) {
        this.repository = repository;
    }


    @Override
    public Set<Course> getAll() {
        Set<Course> courses = this.repository.getAll();
        System.out.println("getAll:" +courses);
        return courses;
    }

    @Override
    public Course create(Course type) {
        return repository.create(type);
    }

    @Override
    public Course update(Course type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Course read(String s) {
        return repository.read(s);
    }
}
