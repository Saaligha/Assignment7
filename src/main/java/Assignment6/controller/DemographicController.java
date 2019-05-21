package Assignment6.controller;

import Assignment6.domain.Demographic;
import Assignment6.services.CourseService;
import Assignment6.services.DemographicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Demographic")
public class DemographicController {


    @Autowired
    @Qualifier("DemographicSerImpl")
    private DemographicService service;

    @PostMapping("/create")
    @ResponseBody
    public Demographic create(Demographic demo){
        return service.create(demo);
    }
    @PostMapping("/update")
    @ResponseBody
    public Demographic update(Demographic demo){
        return service.update(demo);
    }


    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public Demographic read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Demographic> getAll(){
        return service.getAll();
    }}
