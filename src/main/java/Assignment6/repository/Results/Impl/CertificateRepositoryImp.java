package Assignment6.repository.Results.Impl;

import Assignment6.domain.Results.Certificate;
import Assignment6.repository.Results.CertificateRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("CertificateInMemory")
public class CertificateRepositoryImp implements CertificateRepo{

    private static CertificateRepositoryImp certificateRepository = null;
    private Set<Certificate> certificates;

    public CertificateRepositoryImp(){
        certificates = new HashSet<>();
    }

    public static CertificateRepositoryImp getCertificateRepository(){
        if(certificateRepository == null){
            return new CertificateRepositoryImp();
        }
        return certificateRepository;
    }

    @Override
    public Set<Certificate> getAll() {
        return certificates;
    }

    @Override
    public Certificate create(Certificate certificate) {
        certificates.add(certificate);
        return certificate;
    }

    @Override
    public Certificate update(Certificate certificate) {
        Certificate inDB = read(certificate.getCertificate());

        if(inDB != null){
            certificates.remove(inDB);
            certificates.add(certificate);
            return certificate;
        }

        return null;
    }

    @Override
    public void delete(String c) {
        Certificate inDB = read(c);
        certificates.remove(inDB);
    }

    @Override
    public Certificate read(String c) {
        return certificates.stream().filter(certificate -> certificate.getCertificate().equals(c)).findAny().orElse(null);

    }
}
