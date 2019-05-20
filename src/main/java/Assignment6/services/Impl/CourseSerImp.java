package Assignment6.services.Impl;

import Assignment6.domain.Course;
import Assignment6.repository.CourseRepo;
import Assignment6.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.Set;
@Service("CourseImpl")
public class CourseSerImp implements CourseService {

   //@Autowired
   // @Qualifier("Memory");
    private CourseRepo repository;

    public CourseSerImp(CourseRepo repository) {
        this.repository = repository;
    }


    @Override
    public Set<Course> getAll() {
        return null;
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
