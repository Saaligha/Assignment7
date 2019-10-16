package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Subject;
import za.ac.cput.service.users.impl.SubjectServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    @Qualifier("SubjectServiceImpl")
    private SubjectServiceImpl service;

    @PostMapping("/new")
    public Subject create(@RequestBody Subject subject){

        return service.create(subject);
    }

    @GetMapping(path = "/find/{id}")
    public Subject findById(@PathVariable String id){

        Subject subject = service.read(id);

        return subject;
    }

    @PutMapping("/update")
    public void update(@RequestBody Subject subject){

        service.update(subject);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Subject> getAll(){
        return service.getAll();
    }

}
