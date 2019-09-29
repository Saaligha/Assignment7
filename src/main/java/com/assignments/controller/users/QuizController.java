package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Quiz;
import za.ac.cput.service.users.impl.QuizServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    @Qualifier("PunishmentIfBunkedAlotServiceImpl")
    private QuizServiceImpl service;

    @PostMapping("/new")
    public Quiz create(@RequestBody Quiz quiz){

        return service.create(quiz);
    }

    @GetMapping(path = "/find/{id}")
    public Quiz findById(@PathVariable String id){

        Quiz quiz = service.read(id);

        return quiz;
    }

    @PutMapping("/update")
    public void update(@RequestBody Quiz quiz){

        service.update(quiz);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Quiz> getAll(){
        return service.getAll();
    }

}
