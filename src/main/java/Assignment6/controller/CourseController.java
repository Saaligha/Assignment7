package Assignment6.controller;

import Assignment6.domain.Progress.Course;
import Assignment6.services.Progress.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Course/")
public class CourseController {

    @Autowired
    @Qualifier("CourseServiceImpl")
    private CourseService CourseService;

    @PostMapping("/create")
    public Course create(@RequestBody Course course){
        return CourseService.create(course);
    }

    @PutMapping("/update")
    public Course update(@RequestBody Course course){
        return CourseService.update(course);
    }

    @DeleteMapping(path ="/delete{id}")
    public void delete(@PathVariable String id){
        CourseService.delete(id);}

    @GetMapping(path = "/read/{id}")
    public Course read(@PathVariable String id){
        Course c = CourseService.read(id);
        return c;

    }

    public Set<Course> getAll(){
    return CourseService.getAll();
}}