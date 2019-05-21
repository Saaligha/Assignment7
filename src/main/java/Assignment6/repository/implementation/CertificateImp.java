package Assignment6.repository.implementation;

import Assignment6.domain.Certificate;
import Assignment6.repository.CertificateRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("CertificateRepo")
public class CertificateImp implements CertificateRepo {

    private static CertificateImp repository = null;
    private Map<String,Certificate> certificate;

    private CertificateImp(){
        this.certificate = new HashMap<>();

    }

    public static CertificateImp getRepository(){
        if(repository == null) repository = new CertificateImp();
        return repository;
    }
    @Override
    public Set<Certificate> getAll() {
        Collection<Certificate> courses = this.certificate.values();
        Set<Certificate> set = new HashSet<>();
        set.addAll(courses);
        return set;
    }

    @Override
    public Certificate create(Certificate certificate) {
        this.certificate.put(certificate.getCertificate(), certificate);
        return certificate;
    }

    @Override
    public Certificate update(Certificate certificate) {
        this.certificate.replace(certificate.getCertificate(), certificate);
        return certificate;
    }

    @Override
    public void delete(String s) {
    this.certificate.remove(s);
    }

    @Override
    public Certificate read(String s) {
        return this.certificate.get(s);
    }




}
