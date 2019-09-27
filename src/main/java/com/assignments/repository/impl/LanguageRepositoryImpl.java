package com.assignments.repository.impl;


import com.assignments.domain.Language;
import com.assignments.repository.LanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("LanguageInMemory")
public class LanguageRepositoryImpl implements LanguageRepository {

    private static  LanguageRepositoryImpl repository = null;
    private Set<Language> languages;

    public LanguageRepositoryImpl(){
        languages = new HashSet<>();
    }

    public static LanguageRepositoryImpl getRepository() {

        if(repository == null){
            return new LanguageRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<Language> getAll() {
        return null;
    }

    @Override
    public Language create(Language language) {
        languages.add(language);
        return language;
    }

    @Override
    public Language read(String l) {
        return languages.stream().filter(language -> language.getLanguage().equals(l)).findAny().orElse(null);

    }

    @Override
    public Language update(Language language) {
        Language inDB = read(language.getLanguage());

        if(inDB != null){
            languages.remove(inDB);
            languages.add(language);
            return language;
        }

        return null;
    }

    @Override
    public void delete(String s) {
        Language inDB = read(s);
        languages.remove(inDB);
    }
}
