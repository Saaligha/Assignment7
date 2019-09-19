package Assignment6.controller;

import Assignment6.domain.Demographic.Location;
import Assignment6.services.Demographic.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Location")
public class LocationController {
    @Autowired
    @Qualifier("LocationSerImpl")
    private LocationService service;


    @PostMapping("/create")
    @ResponseBody
    public Location create(Location loc){
        return service.create(loc);
    }

    @PostMapping("/update")
    @ResponseBody
    public Location update(Location loc){
        return service.update(loc);
    }

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public Location read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Location> getAll(){
        return service.getAll();
    }
}
