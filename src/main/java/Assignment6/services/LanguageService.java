package Assignment6.services;

import Assignment6.domain.Language;

import java.util.Set;

public interface LanguageService extends IService<Language,String> {
    Set<Language> getAll();
}
