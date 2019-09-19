package Assignment6.repository.Results.Impl;

import Assignment6.domain.Results.Certificate;
import Assignment6.repository.Results.CertificateRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("CertificateImnMemory")
public class CertificateImp implements CertificateRepo{

    private static CertificateImp certificateRepository = null;
    private Set<Certificate> certificates;

    public static CertificateImp getCertificateRepository(){
        if(certificateRepository == null){
            return new CertificateImp();
        }
        return certificateRepository;
    }

    @Override
    public Set<Certificate> getAll() {
        return null;
    }

    @Override
    public Certificate create(Certificate certificate) {
        certificates.add(certificate);
        return certificate;
    }

    @Override
    public Certificate update(Certificate certificate) {
        return null;
    }

    @Override
    public void delete(String s) {
certificates.remove(s);
    }

    @Override
    public Certificate read(String s) {
        return null;
    }
}
