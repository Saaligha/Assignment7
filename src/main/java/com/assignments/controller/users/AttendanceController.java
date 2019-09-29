package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Language;
import za.ac.cput.service.users.impl.LanguageServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    @Qualifier("AttendanceServiceImpl")
    private LanguageServiceImpl service;

    @PostMapping("/new")
    public Language create(@RequestBody Language language){

        return service.create(language);
    }

    @GetMapping(path = "/find/{id}")
    public Language findById(@PathVariable String id){

        Language language = service.read(id);

        return language;
    }

    @PutMapping("/update")
    public void update(@RequestBody Language language){

        service.update(language);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Language> getAll(){
        return service.getAll();
    }

}
