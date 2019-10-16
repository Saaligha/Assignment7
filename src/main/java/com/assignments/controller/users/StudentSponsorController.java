package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.StudentSponsor;
import za.ac.cput.service.users.impl.StudentSponsorServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/studentSponsor")
public class StudentSponsorController {

    @Autowired
    @Qualifier("StudentSponsorServiceImpl")
    private StudentSponsorServiceImpl service;

    @PostMapping("/new")
    public StudentSponsor create(@RequestBody StudentSponsor studentSponsor){

        return service.create(studentSponsor);
    }

    @GetMapping(path = "/find/{id}")
    public StudentSponsor findById(@PathVariable String id){

        StudentSponsor studentSponsor = service.read(id);

        return studentSponsor;
    }

    @PutMapping("/update")
    public void update(@RequestBody StudentSponsor studentSponsor){

        service.update(studentSponsor);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<StudentSponsor> getAll(){
        return service.getAll();
    }

}
