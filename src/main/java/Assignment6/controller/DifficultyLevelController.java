package Assignment6.controller;

import Assignment6.domain.Progress.DifficultyLevel;
import Assignment6.services.Progress.DifficultyLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/DifficultyLevel")
public class DifficultyLevelController {


    @Autowired
    @Qualifier("DifficultyLevelServiceImpl")
    private DifficultyLevelService difficultyLevelService;

    @PostMapping("/create")

    public DifficultyLevel create(@RequestBody DifficultyLevel difficulty){
        return difficultyLevelService.create(difficulty);
    }

    @PutMapping("/update")
    public DifficultyLevel update(@RequestBody DifficultyLevel difficulty){
        return difficultyLevelService.update(difficulty);
    }

    @DeleteMapping(path = "/delete{id}")
    public void delete(@PathVariable String id){
        difficultyLevelService.delete(id);}

    @GetMapping(path ="/read/{id}")
    public DifficultyLevel read(@PathVariable String id){
        DifficultyLevel c = difficultyLevelService.read(id);
        return c;

    }
    @GetMapping("/getAll")
    public Set<DifficultyLevel> getAll(){
        return difficultyLevelService.getAll();
    }}

