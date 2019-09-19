package Assignment6.services.Results.Impl;

import Assignment6.domain.Results.Certificate;
import Assignment6.repository.Results.CertificateRepo;
import Assignment6.repository.Results.Impl.CertificateRepositoryImp;
import Assignment6.services.Results.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CertificateServiceImpl")
public class CertificateSerImp implements CertificateService {

private CertificateRepo repository;
private CertificateSerImp service = null;
public CertificateSerImp( ){
    this.repository = CertificateRepositoryImp.getCertificateRepository();
}
public CertificateSerImp getService(){
    if(service==null){
        service = new CertificateSerImp();
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
