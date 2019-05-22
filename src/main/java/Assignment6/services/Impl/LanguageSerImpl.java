package Assignment6.services.Impl;

import Assignment6.domain.Language;
import Assignment6.repository.LanguageRepo;
import Assignment6.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("LanguageSerImp")
public class LanguageSerImpl implements LanguageService {
    @Autowired
    @Qualifier ("LanguageImp")
    private LanguageRepo repository;

    public LanguageSerImpl(LanguageRepo repository){this.repository = repository;}


    @Override
    public Set<Language> getAll() {
        return null;
    }

    @Override
    public Language create(Language type) {
        return repository.create(type);
    }

    @Override
    public Language update(Language type) {
        return repository.update(type);
    }

    @Override
    public void delete(String s) {
    repository.delete(s);
    }

    @Override
    public Language read(String s) {
        return repository.read(s);
    }
}
