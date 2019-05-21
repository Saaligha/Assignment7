package Assignment6.controller;

import Assignment6.domain.Course;
import Assignment6.domain.Quiz;
import Assignment6.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Quiz")
public class QuizController {
    @Autowired
    @Qualifier("/QuizSerImpl")
    private QuizService service;

    @PostMapping("/create")
    @ResponseBody
    public Quiz create(Quiz q){
        return service.create(q);
    }

    @PostMapping("/update")
    @ResponseBody
    public Quiz update(Quiz q){
        return service.update(q);
    }

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public Quiz read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Quiz> getAll(){
        return service.getAll();
    }

}
