package Assignment6.controller;

import Assignment6.domain.Progress.HoursClocked;
import Assignment6.services.Progress.HoursClockedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/HoursClockedServiceImpl")
public class HoursClockedController {

    @Autowired
    @Qualifier("HoursClockedServiceImpl")
    private HoursClockedService hoursClockedService;

    @PostMapping("/create")
    public HoursClocked create(@RequestBody HoursClocked hours){
        return hoursClockedService.create(hours);
    }

    @PutMapping("/update")
    public HoursClocked update(@RequestBody HoursClocked hours){
        return hoursClockedService.update(hours);
    }

    @DeleteMapping(path = "/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        hoursClockedService.delete(id);}

    @GetMapping(path = "/read/{id}")
    public HoursClocked read(@PathVariable String id){
    HoursClocked h = hoursClockedService.read(id);
        return h;
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<HoursClocked> getAll(){
        return hoursClockedService.getAll();
    }
}
