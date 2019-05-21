package Assignment6.controller;

import Assignment6.domain.Course;
import Assignment6.domain.Language;
import Assignment6.services.CourseService;
import Assignment6.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Language")
public class LanguageController {
    @Autowired
    @Qualifier("LanguageSerImpl")
    private LanguageService service;

    @PostMapping("/create")
    @ResponseBody
    public Language create(Language language){
        return service.create(language);
    }

    @PostMapping("/update")
    @ResponseBody
    public Language update(Language language){
        return service.update(language);
    }

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public Language read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Language> getAll(){
        return service.getAll();
    }
}
