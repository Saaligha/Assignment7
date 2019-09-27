package com.assignments.service.impl;


import com.assignments.domain.Language;
import com.assignments.service.IService;
import com.assignments.service.LanguageService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service("LanguageServiceInMemory")
public class LanguageServiceImpl implements LanguageService {
    private static  LanguageServiceImpl repository = null;
    private Set<Language> languages;

    public LanguageServiceImpl(){
        languages = new HashSet<>();
    }

    public static LanguageServiceImpl getRepository() {

        if(repository == null){
            return new LanguageServiceImpl();
        }
        return repository;
    }

    @Override
    public Set<Language> getAll() {
        return languages;
    }

    @Override
    public Language create(Language language) {
        languages.add(language);
        return language;
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
    public void delete(String language) {
        Language inDB = read(language);
        languages.remove(inDB);
    }

    @Override
    public Language read(String language) {
        return languages.stream().filter(language1 -> language1.getLanguage().equals(language)).findAny().orElse(null);

    }
}