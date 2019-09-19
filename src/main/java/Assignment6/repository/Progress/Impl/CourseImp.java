package Assignment6.repository.Progress.Impl;

import Assignment6.domain.Progress.Course;
import Assignment6.repository.Progress.CourseRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("CourseImp")
public class CourseImp implements CourseRepo {



    private static CourseImp repository = null;
    private Set< Course> courses;

    private CourseImp() {
        this.courses = new HashSet<>();
    }


    public static CourseImp getRepository(){
        if(repository == null) repository = new CourseImp();
        return repository;
    }


    @Override
    public Course create(Course course) {
       courses.add(course);
       return course;
    }

    public Course update(Course course){
        Course inDB = read(course.getCourseId());

        if(inDB != null){
            courses.remove(inDB);
            courses.add(course);
            return course;
        }

        return null;
    }

    @Override
    public void delete(String id) {
        this.courses.remove(id);
    }

    public void delete(Course c){
        Course inDB= read(String.valueOf(c));
        courses.remove(inDB);
    }



    @Override
    public Course read(String courseId) {
        return courses.stream().filter(course -> course.getCourseId().equals(courseId)).findAny().orElse(null);

    }

    public Set<Course> getAll(){
        return courses;
}}
