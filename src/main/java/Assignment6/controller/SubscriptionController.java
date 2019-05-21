package Assignment6.controller;

import Assignment6.domain.Course;
import Assignment6.domain.Subscription;
import Assignment6.services.CourseService;
import Assignment6.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Subscription")
public class SubscriptionController {

    @Autowired
    @Qualifier("SubscriptionSerImpl")
    private SubscriptionService service;

    @PostMapping("/create")
    @ResponseBody
    public Subscription create(Subscription s){
        return service.create(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Subscription update(Subscription s){
        return service.update(s);
    }

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public Subscription read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Subscription> getAll(){
        return service.getAll();
    }
}
