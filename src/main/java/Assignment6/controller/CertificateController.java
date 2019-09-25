package Assignment6.controller;

import Assignment6.domain.Results.Certificate;
import Assignment6.services.Results.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Certificate/")
public class CertificateController {
    @Autowired
    @Qualifier("CertificateServiceImpl")
    private CertificateService CertificateService;

    public CertificateController(CertificateService service) {
        this.CertificateService = service;
    }

    @PostMapping("/create")
    public Certificate create(@RequestBody Certificate certificate){
    return CertificateService.create(certificate);
}

    @GetMapping(path = "/read/{id}")
    public Certificate read(@PathVariable String id){
        Certificate c = CertificateService.read(id);
        return c;

    }
    @PutMapping("/update")
    public Certificate update(@RequestBody Certificate certificate){
        return CertificateService.update(certificate);
    }


   @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        CertificateService.delete(id);}



    @GetMapping("/getAll")
    public Set<Certificate> getAll(){

        return CertificateService.getAll();
    }

}

