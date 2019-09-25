package Assignment6.controller;

import Assignment6.domain.User.User;
import Assignment6.services.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/User/")
public class UserController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userService.create(user);
    }
    @PutMapping("/update")
    public User update(@RequestBody User course){
        return userService.update(course);
    }
    @DeleteMapping(path ="/delete{id}")
    public void delete(@PathVariable String id){
        userService.delete(id);}
    @GetMapping(path = "/read/{id}")
    public User read(@PathVariable String id){
        User c = userService.read(id);
        return c;

    }
    public Set<User> getAll(){
        return userService.getAll();
    }
}
