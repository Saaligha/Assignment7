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
    @Qualifier("CourseSerImpl")
    private CourseService service;

    @PostMapping("/create")
    @ResponseBody
    public Course create(Course course){
        return service.create(course);
    }

    @PostMapping("/update")
    @ResponseBody
    public Course update(Course course){
        return service.update(course);
    }

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public Course read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Course> getAll(){
    return service.getAll();
}}