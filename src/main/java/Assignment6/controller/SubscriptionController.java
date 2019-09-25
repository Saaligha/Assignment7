package Assignment6.controller;

import Assignment6.domain.Payment.Subscription;
import Assignment6.services.Payment.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Subscription")
public class SubscriptionController {

    @Autowired
    @Qualifier("SubscriptionServiceImpl")
    private SubscriptionService subscriptionService;

    @PostMapping("/create")
    public Subscription create(@RequestBody Subscription s){
        return subscriptionService.create(s);
    }

    @PutMapping("/update")
    public Subscription update(@RequestBody Subscription s){
        return subscriptionService.update(s);
    }

    @DeleteMapping(path ="/delete{id}")
    public void delete(@PathVariable String id){
        subscriptionService.delete(id);}

    @GetMapping(path ="/read/{id}")
    @ResponseBody
    public Subscription read(@PathVariable String id){
        return subscriptionService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Subscription> getAll(){
        return subscriptionService.getAll();
    }
}
