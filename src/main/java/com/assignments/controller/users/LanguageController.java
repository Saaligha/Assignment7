package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.User;
import za.ac.cput.service.users.impl.UserServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    @Qualifier("HODServiceImpl")
    private UserServiceImpl service;

    @PostMapping("/new")
    public User create(@RequestBody User user){

        return service.create(user);
    }

    @GetMapping(path = "/find/{id}")
    public User findById(@PathVariable String id){

        User user = service.read(id);

        return user;
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){

        service.update(user);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<User> getAll(){
        return service.getAll();
    }

}
