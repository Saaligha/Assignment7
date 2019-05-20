package Assignment6.services.Impl;

import Assignment6.domain.Certificate;
import Assignment6.repository.CertificateRepo;
import Assignment6.services.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CertificateImpl")
public class CertificateSerImp implements CertificateService {
@Autowired
@Qualifier("Memory")
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
