package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Language;
import za.ac.cput.repository.users.LanguageRepository;
import za.ac.cput.repository.users.impl.LanguageRepositoryImpl;
import za.ac.cput.service.users.LanguageService;

import java.util.Set;

@Repository("AttendanceServiceImpl")
public class LanguageServiceImpl implements LanguageService {

    private LanguageServiceImpl service = null;
    private LanguageRepository repository;

    public LanguageServiceImpl() {
        repository = LanguageRepositoryImpl.getRepository();
    }

    public LanguageServiceImpl getService(){

        if(service == null){
            return new LanguageServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Language> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Language create(Language language) {
        return repository.create(language);
    }

    @Override
    public Language read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Language update(Language language) {
        return repository.update(language);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

