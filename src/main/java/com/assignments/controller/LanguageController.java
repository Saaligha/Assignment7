package com.assignments.controller;

import com.assignments.domain.Language;
import com.assignments.service.impl.LanguageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/lang")
public class LanguageController {

    @Autowired
    @Qualifier("LanguageServiceInMemory")
    private LanguageServiceImpl service;


    @PostMapping("/new")
    public Language create(@RequestBody Language Language){

        return service.create(Language);
    }
    @GetMapping(path = "/find/{id}")
    public Language findById(@PathVariable String id){

        Language Language = service.read(id);

        return Language;
    }
    @PutMapping("/update")
    public void update(@RequestBody Language Language){

        service.update(Language);

    }
    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Language> getAll(){
        return service.getAll();
    }

}
