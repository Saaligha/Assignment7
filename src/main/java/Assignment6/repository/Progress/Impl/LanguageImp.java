package Assignment6.repository.Progress.Impl;

import Assignment6.domain.Progress.Language;
import Assignment6.repository.Progress.LanguageRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("LanguageImp")
public class LanguageImp implements LanguageRepo {

    public static LanguageImp repository = null;
    private Map<String, Language> languages;

    private LanguageImp(){
        this.languages = new HashMap<>();
    }
    public static LanguageImp getRepository(){
        if(repository == null) repository = new LanguageImp();
        return repository;
    }
    @Override
    public Set<Language> getAll() {
        Collection<Language> languages = this.languages.values();
        Set<Language> set = new HashSet<>();
        set.addAll(languages);
        return set;
    }



    @Override
    public Language create(Language language) {
        this.languages.put(language.getLanguage(), language);
        return language;
    }

    @Override
    public Language update(Language language) {

        this.languages.replace(language.getLanguage(), language);
        return language;
    }

    @Override
    public void delete(String s) {

      this.languages.remove(s);
    }

    @Override
    public Language read(String s) {

      return this.languages.get(s);
    }
}