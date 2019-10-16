package za.ac.cput.service.users;

import za.ac.cput.domain.users.Language;
import za.ac.cput.service.IService;

import java.util.Set;

public interface LanguageService extends IService<Language, String> {

    Set<Language> getAll();

}