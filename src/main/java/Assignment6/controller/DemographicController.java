package Assignment6.controller;

import Assignment6.domain.Demographic.Demographic;
import Assignment6.services.Demographic.DemographicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Demographic")
public class DemographicController {


    @Autowired
    @Qualifier("DemographicServiceImpl")
    private DemographicService service;

    @PostMapping("/create")
    public Demographic create(@RequestBody Demographic demo){
        return service.create(demo);
    }
    @PutMapping("/update")
    public Demographic update(@RequestBody Demographic demo){
        return service.update(demo);
    }

    @DeleteMapping(path ="/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping(path = "/read/{id}")
    public Demographic read(@PathVariable String id){
       Demographic d = service.read(id);
       return d;
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Demographic> getAll(){
        return service.getAll();
    }}
