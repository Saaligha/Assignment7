package Assignment6.repository.Results;

import Assignment6.domain.Results.Certificate;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface CertificateRepo extends RepoA<Certificate, String> {
    Set<Certificate> getAll();
}
