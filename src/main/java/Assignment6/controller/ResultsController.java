package Assignment6.controller;

import Assignment6.domain.Course;
import Assignment6.domain.Results;
import Assignment6.services.CourseService;
import Assignment6.services.ResultsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("")
public class ResultsController {


    @Autowired
    @Qualifier("")
    private ResultsServices service;


    @PostMapping("")
    @ResponseBody
    public Results create(Results r){
        return service.create(r);
    }

    @PostMapping("/update")
    @ResponseBody
    public Results update(Results r){
        return service.update(r);
    }

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public Results read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Results> getAll(){
        return service.getAll();
    }
}
