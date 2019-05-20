package Assignment6.controller;

import Assignment6.domain.Course;
import Assignment6.domain.DifficultyLevel;
import Assignment6.services.CourseService;
import Assignment6.services.DifficultyLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("")
public class DifficultyLevelController {


    @Autowired
    @Qualifier("")
    private DifficultyLevelService service;

    @PostMapping("")
    @ResponseBody
    public DifficultyLevel create(DifficultyLevel difficulty){
        return service.create(difficulty);
    }

    @PostMapping("/update")
    @ResponseBody
    public DifficultyLevel update(DifficultyLevel difficulty){
        return service.update(difficulty);
    }

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public DifficultyLevel read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<DifficultyLevel> getAll(){
        return service.getAll();
    }}

