package Assignment6.services.Results;

import Assignment6.domain.Results.Certificate;
import Assignment6.services.IService;

import java.util.Set;

public interface CertificateService extends IService<Certificate, String> {
    Set<Certificate> getAll();
}
