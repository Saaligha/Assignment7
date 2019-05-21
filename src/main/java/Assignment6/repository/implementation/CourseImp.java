package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.domain.Demographic;
import Assignment6.repository.CourseRepo;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
@Repository("CourseRepo")
public class CourseImp implements CourseRepo {



    private static CourseImp repository = null;
    private Set<Course> courses;

    private CourseImp() {
        this.courses = new HashSet<>();
    }

    public static CourseImp getRepository(){
        if(repository == null) repository = new CourseImp();
        return repository;
    }


    @Override
    public Course create(Course course) {
        return null;
    }

    public Course update(Course course){
        this.courses.add(course);
        return course;
    }
    public Course delete(Course course){
        this.courses.remove(course);
        return course;
    }

    public void delete(String courseId) {
        //find the student and delete it if it exists

    }

    @Override
    public Course read(String s) {
        return null;
    }

    public Set<Course> getAll(){
        return this.courses;
    }

}
