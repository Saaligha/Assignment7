package Assignment6.services;

import Assignment6.domain.Certificate;

import java.util.Set;

public interface CertificateService extends IService<Certificate, String> {
    Set<Certificate> getAll();
}
