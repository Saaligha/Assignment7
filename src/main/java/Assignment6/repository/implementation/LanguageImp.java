package Assignment6.repository.implementation;

import Assignment6.domain.Demographic;
import Assignment6.domain.Language;
import Assignment6.repository.LanguageRepo;
import Assignment6.repository.RepoA;

import java.util.HashSet;
import java.util.Set;

public class LanguageImp implements LanguageRepo {

    public static LanguageImp repository = null;
    private Set<Language> languages;
    @Override
    public Set<Language> getAll() {
        return null;
    }
    public LanguageRepo getRepository(){
        if(repository==null)
            repository = new LanguageImp();
        return repository;
    }

    @Override
    public Language create(Language language) {
        this.languages.add(language);
        return language;
    }

    @Override
    public Language update(Language language) {

        this.languages.add(language);
        return language;
    }

    @Override
    public void delete(String s) {

        for(Language l: languages)
        {
            if(l.getLanguage().equals(s))
            {
                this.languages.remove(l);
            }
        }
    }

    @Override
    public Language read(String s) {
      Language l = null;
      for(Language lang : languages){
          if(lang.getLanguage().equals(s)){
              System.out.println((lang.getLanguage())+ lang.getCountry());
         }
      }
      return l;
    }
}
