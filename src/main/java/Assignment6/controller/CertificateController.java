package Assignment6.controller;

import Assignment6.domain.Certificate;
import Assignment6.services.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("")
public class CertificateController {
    @Autowired
    @Qualifier
    private CertificateService service;

@PostMapping("")
    @ResponseBody
    public Certificate create(Certificate certificate){
    return service.create(certificate);
}

    @PostMapping("")
    @ResponseBody
    public Certificate update(Certificate certificate){
        return service.update(certificate);
    }
    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);}

    @GetMapping("/read/{id}")
    @ResponseBody
    public Certificate read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Certificate> getAll(){
        return service.getAll();
    }

}

