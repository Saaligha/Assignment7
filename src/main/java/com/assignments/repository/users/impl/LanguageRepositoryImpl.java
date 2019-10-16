package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Language;
import za.ac.cput.repository.users.LanguageRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("AttendanceInMemory")
public class LanguageRepositoryImpl implements LanguageRepository {

    private static LanguageRepositoryImpl repository = null;
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
    public Language create(Language language) {

        languages.add(language);
        return language;
    }

    @Override
    public Language read(String id) {

        return languages.stream().filter(attendance -> attendance.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Language update(Language language) {

        Language inDB = read(language.getUserID());

        if(inDB != null){
            languages.remove(inDB);
            languages.add(language);
            return language;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Language inDB = read(id);
        languages.remove(inDB);

    }

    @Override
    public Set<Language> getAll() {
        return languages;
    }

}

