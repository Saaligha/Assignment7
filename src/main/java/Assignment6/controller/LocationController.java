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
    @Qualifier("LocationServiceImp")
    private LocationService locationService;


    @PostMapping("/create")
    public Location create(@RequestBody Location loc){
        return locationService.create(loc);
    }

    @PutMapping("/update")
    public Location update(@RequestBody Location loc){
        return locationService.update(loc);
    }

    @DeleteMapping(path = "/delete{id}")
    public void delete(@PathVariable String id){
        locationService.delete(id);}

    @GetMapping(path = "/read/{id}")
    public Location read(@PathVariable String id){
    Location l = locationService.read(id);
    return l;
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Location> getAll(){
        return locationService.getAll();
    }
}
