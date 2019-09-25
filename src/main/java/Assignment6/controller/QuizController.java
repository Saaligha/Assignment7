package Assignment6.controller;

import Assignment6.domain.Progress.Quiz;
import Assignment6.services.Progress.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Quiz")
public class QuizController {
    @Autowired
    @Qualifier("QuizServiceImpl")
    private QuizService quizService;

    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz q){
        return quizService.create(q);
    }

    @PutMapping("/update")
    public Quiz update(@RequestBody Quiz q){
        return quizService.update(q);
    }

    @DeleteMapping(path ="/delete{id}")
    public void delete(@PathVariable String id){
        quizService.delete(id);}

    @GetMapping(path="/read/{id}")
    public Quiz read(@PathVariable String id){
Quiz q = quizService.read(id);
return q;
    }

    @GetMapping("/read/all")
    public Set<Quiz> getAll(){
        return quizService.getAll();
    }

}
