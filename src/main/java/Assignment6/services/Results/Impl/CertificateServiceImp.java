package Assignment6.services.Results.Impl;

import Assignment6.domain.Results.Certificate;
import Assignment6.repository.Results.CertificateRepo;
import Assignment6.repository.Results.Impl.CertificateRepositoryImp;
import Assignment6.services.Results.CertificateService;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CertificateServiceImpl")
public class CertificateServiceImp implements CertificateService {

private CertificateRepo repository;
private CertificateServiceImp service = null;

public CertificateServiceImp( ){
    this.repository = CertificateRepositoryImp.getCertificateRepository();
}

public CertificateServiceImp getService(){
    if(service==null){
        service = new CertificateServiceImp();
    }
    return service;
}

    @Override
    public Set<Certificate> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Certificate create(Certificate type) {
        return repository.create(type);
    }

    @Override
    public Certificate update(Certificate type) {
        return repository.update(type);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Certificate read(String s) {
        return repository.read(s);
    }
}
