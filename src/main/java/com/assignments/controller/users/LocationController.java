package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Location;
import za.ac.cput.service.users.impl.LocationServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    @Qualifier("UniversityServiceImpl")
    private LocationServiceImpl service;

    @PostMapping("/new")
    public Location create(@RequestBody Location location){

        return service.create(location);
    }

    @GetMapping(path = "/find/{id}")
    public Location findById(@PathVariable String id){

        Location location = service.read(id);

        return location;
    }

    @PutMapping("/update")
    public void update(@RequestBody Location location){

        service.update(location);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Location> getAll(){
        return service.getAll();
    }

}
