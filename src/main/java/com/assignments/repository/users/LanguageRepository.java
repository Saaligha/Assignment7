package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Language;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface LanguageRepository extends IRepository<Language, String> {

    Set<Language> getAll();

}