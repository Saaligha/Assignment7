package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Student;
import za.ac.cput.service.users.impl.StudentServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentServiceImpl service;

    @PostMapping("/new")
    public Student create(@RequestBody Student student){

        return service.create(student);
    }

    @GetMapping(path = "/find/{id}")
    public Student findById(@PathVariable String id){

        Student student = service.read(id);

        return student;
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){

        service.update(student);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Student> getAll(){
        return service.getAll();
    }

}
