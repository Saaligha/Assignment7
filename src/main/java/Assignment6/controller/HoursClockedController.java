package Assignment6.controller;

import Assignment6.domain.Course;
import Assignment6.domain.HoursClocked;
import Assignment6.services.CourseService;
import Assignment6.services.HoursClockedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("")
public class HoursClockedController {

    @Autowired
    @Qualifier("")
    private HoursClockedService service;

    @PostMapping("")
    @ResponseBody
    public HoursClocked create(HoursClocked hours){
        return service.create(hours);
    }

    @PostMapping("/update")
    @ResponseBody
    public HoursClocked update(HoursClocked hours){
        return service.update(hours);
    }

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public HoursClocked read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<HoursClocked> getAll(){
        return service.getAll();
    }
}
