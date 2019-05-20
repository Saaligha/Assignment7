package Assignment6.controller;

import Assignment6.domain.Course;
import Assignment6.factory.CourseFactory;
import Assignment6.repository.implementation.CourseImp;
import Assignment6.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("")
public class CourseController {

    @Autowired
    @Qualifier("")
    private CourseService service;

    @PostMapping("")
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