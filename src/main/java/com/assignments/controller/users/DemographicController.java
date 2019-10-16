package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Demographic;
import za.ac.cput.service.users.impl.DemographicServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/demographic")
public class DemographicController {

    @Autowired
    @Qualifier("VenueServiceImpl")
    private DemographicServiceImpl service;

    @PostMapping("/new")
    public Demographic create(@RequestBody Demographic demographic){

        return service.create(demographic);
    }

    @GetMapping(path = "/find/{id}")
    public Demographic findById(@PathVariable String id){

        Demographic demographic = service.read(id);

        return demographic;
    }

    @PutMapping("/update")
    public void update(@RequestBody Demographic demographic){

        service.update(demographic);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Demographic> getAll(){
        return service.getAll();
    }

}
