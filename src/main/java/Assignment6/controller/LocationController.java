package Assignment6.controller;

import Assignment6.domain.Course;
import Assignment6.domain.Location;
import Assignment6.services.CourseService;
import Assignment6.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("")
public class LocationController {
    @Autowired
    @Qualifier(
            "")
    private LocationService service;


    @PostMapping("")
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
