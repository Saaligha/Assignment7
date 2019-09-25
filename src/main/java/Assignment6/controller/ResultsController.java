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
    @Qualifier("ResultsServiceImpl")
    private ResultsServices resultsServices;


    @PostMapping("/create")
    public Results create(@RequestBody Results r){
        return resultsServices.create(r);
    }

    @PutMapping("/update")
    public Results update(@RequestBody Results r){
        return resultsServices.update(r);
    }

    @DeleteMapping(path = "/delete{id}")
    public void delete(@PathVariable String id){
        resultsServices.delete(id);}

    @GetMapping("/read/{id}")
    public Results read(@PathVariable String id){
        Results r = resultsServices.read(id);
        return r;
    }

    @GetMapping("/getAll")

    public Set<Results> getAll(){
        return resultsServices.getAll();
    }
}
