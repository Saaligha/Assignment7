package Assignment6.services.Progress.Impl;

import Assignment6.domain.Progress.Course;
import Assignment6.repository.Progress.CourseRepo;
import Assignment6.services.Progress.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CourseServiceImpl")
public class CourseSerImp implements CourseService {

private CourseRepo repository;
private CourseSerImp service = null;
    public CourseSerImp() {
        this.repository = repository;
    }
    public CourseSerImp getService(){
        if(service==null){
            service=new CourseSerImp();
        }
        return service;
    }

    @Override
    public Set<Course> getAll() {
        return this.repository.getAll();
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
