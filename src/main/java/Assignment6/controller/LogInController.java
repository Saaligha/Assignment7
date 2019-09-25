package Assignment6.controller;

import Assignment6.domain.LogIn.LogIn;
import Assignment6.services.LogIn.LogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/LogIn")
public class LogInController {

    @Autowired
    @Qualifier("LogInServiceImpl")
    private LogInService logInService;

    @PostMapping("/create")
    public LogIn create(@RequestBody LogIn log){
        return logInService.create(log);
    }

    @PutMapping("/update")
    public LogIn update(@RequestBody LogIn log){
        return logInService.update(log);
    }

    @DeleteMapping(path ="/delete{id}")
    public void delete(@PathVariable String id){
        logInService.delete(id);}

    @GetMapping(path ="/read/{id}")
    public LogIn read(@PathVariable String id){
     LogIn l = logInService.read(id);
     return l;
    }

    @GetMapping("/getAll")
    public Set<LogIn> getAll(){
        return logInService.getAll();
    }
}
