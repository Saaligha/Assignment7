package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.domain.Demographic;
import Assignment6.repository.CourseRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("CourseImp")
public class CourseImp implements CourseRepo {



    private static CourseImp repository = null;
    private Map<String, Course> courses;

    private CourseImp() {
        this.courses = new HashMap<>();
    }


    public static CourseImp getRepository(){
        if(repository == null) repository = new CourseImp();
        return repository;
    }


    @Override
    public Course create(Course course) {
       this.courses.put(course.getCourseId(), course);
       return course;
    }

    public Course update(Course course){
        this.courses.replace(course.getCourseId(), course);
        return course;
    }

    @Override
    public void delete(String s) {
        this.courses.remove(s);
    }

    public Course delete(Course course){
        this.courses.remove(course);
        return course;
    }



    @Override
    public Course read(final String courseId) {
return this.courses.get(courseId);
    }

    public Set<Course> getAll(){

        Collection<Course> courses = this.courses.values();
        Set<Course> set = new HashSet<>();
        set.addAll(courses);
        return set;
}}
