package Assignment6.controller;

import Assignment6.domain.Course;
import Assignment6.domain.LogIn;
import Assignment6.services.CourseService;
import Assignment6.services.LogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/LogIn")
public class LogInController {

    @Autowired
    @Qualifier("LogInSerImpl")
    private LogInService service;

    @PostMapping("/create")
    @ResponseBody
    public LogIn create(LogIn log){
        return service.create(log);
    }

    @PostMapping("/update")
    @ResponseBody
    public LogIn update(LogIn log){
        return service.update(log);
    }

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public LogIn read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<LogIn> getAll(){
        return service.getAll();
    }
}
