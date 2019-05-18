package Assignment6.repository.implementation;

import Assignment6.domain.Certificate;
import Assignment6.repository.CertificateRepo;

import java.util.HashSet;
import java.util.Set;

public class CertificateImp implements CertificateRepo {

    private static CertificateImp repository = null;
    private Set<Certificate> certificate;

    private CertificateImp(){
        this.certificate = new HashSet<>();

    }

    public static CertificateRepo getRepository(){
        if(repository == null) repository = new CertificateImp();
        return repository;
    }
    @Override
    public Set<Certificate> getAll() {
        return null;
    }

    @Override
    public Certificate create(Certificate certificate) {
        this.certificate.add(certificate);
        return certificate;
    }

    @Override
    public Certificate update(Certificate certificate) {
        this.certificate.add(certificate);
        return certificate;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Certificate read(String s) {
        return null;
    }




}
