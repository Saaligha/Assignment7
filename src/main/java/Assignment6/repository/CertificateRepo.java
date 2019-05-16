package Assignment6.repository;

import Assignment6.domain.Certificate;
import Assignment6.domain.User;

import java.util.Set;

public interface CertificateRepo extends RepoA {
    Set<Certificate> getAll();
}
