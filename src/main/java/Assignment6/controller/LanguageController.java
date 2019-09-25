package Assignment6.controller;

import Assignment6.domain.Progress.Language;
import Assignment6.services.Progress.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Language")
public class LanguageController {
    @Autowired
    @Qualifier("LanguageServiceImp")
    private LanguageService languageService;

    @PostMapping("/create")
    public Language create(@RequestBody Language language){
        return languageService.create(language);
    }

    @PutMapping("/update")
    public Language update(@RequestBody Language language){
        return languageService.update(language);
    }

    @DeleteMapping(path = "/delete{id}")
    public void delete(@PathVariable String id){
        languageService.delete(id);}

    @GetMapping(path = "/read/{id}")
    public Language read(@PathVariable String id){
        Language l = languageService.read(id);
        return l;
    }

    @GetMapping("/getAll")
    public Set<Language> getAll(){
        return languageService.getAll();
    }
}
