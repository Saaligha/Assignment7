package Assignment6.controller;

import Assignment6.domain.Results.Results;
import Assignment6.services.Results.ResultsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Results")
public class ResultsController {


    @Autowired
    @Qualifier("ResultsSerImpl")
    private ResultsServices service;


    @PostMapping("/create")
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
