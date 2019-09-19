package Assignment6.services.Results.Impl;

import Assignment6.domain.Results.Certificate;
import Assignment6.repository.Results.CertificateRepo;
import Assignment6.services.Results.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CertificateSerImpl")
public class CertificateSerImp implements CertificateService {
@Autowired

@Qualifier("CertificateImp")
private CertificateRepo repository;
public CertificateSerImp(CertificateRepo repository){
    this.repository = repository;
}

    @Override
    public Set<Certificate> getAll() {
        return null;
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