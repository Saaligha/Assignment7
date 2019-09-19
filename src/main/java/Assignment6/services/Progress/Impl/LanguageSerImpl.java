package Assignment6.services.Progress.Impl;

import Assignment6.domain.Progress.Language;
import Assignment6.repository.Progress.Impl.LanguageImp;
import Assignment6.repository.Progress.LanguageRepo;
import Assignment6.services.Progress.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("LanguageServiceImp")
public class LanguageSerImpl implements LanguageService {
    private LanguageSerImpl service = null;
    private LanguageRepo repository;

    public LanguageSerImpl( ){this.repository = LanguageImp.getRepository();}
    public LanguageSerImpl getService(){
        if(service==null){
            service= new LanguageSerImpl();
        }
        return service;
    }

    @Override
    public Set<Language> getAll() {
        return this.repository.getAll();
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
