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
    @Qualifier("CertificateSerImp")
    private CertificateService service;

@PostMapping("/create")
    @ResponseBody
    public Certificate create(Certificate certificate){
    return service.create(certificate);
}

    @PostMapping("/update")
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

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Certificate> getAll(@RequestHeader HttpHeaders headers){
        System.out.println(headers.getFirst("Certificate"));
        return service.getAll();
    }

}

