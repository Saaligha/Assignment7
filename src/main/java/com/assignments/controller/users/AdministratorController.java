package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Administrator;
import za.ac.cput.service.users.impl.AdministratorServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @Autowired
    @Qualifier("AdministratorServiceImpl")
    private AdministratorServiceImpl service;

    @PostMapping("/new")
    public Administrator create(@RequestBody Administrator administrator){

        return service.create(administrator);
    }

    @GetMapping(path = "/find/{id}")
    public Administrator findById(@PathVariable String id){

        Administrator administrator = service.read(id);

        return administrator;
    }

    @PutMapping("/update")
    public void update(@RequestBody Administrator administrator){

        service.update(administrator);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Administrator> getAll(){
        return service.getAll();
    }

}
