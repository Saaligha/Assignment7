package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Administrator;
import za.ac.cput.repository.users.AdministratorRepository;
import za.ac.cput.repository.users.impl.AdministratorRepositoryImpl;
import za.ac.cput.service.users.AdministratorService;

import java.util.HashSet;
import java.util.Set;

@Repository("AdministratorServiceImpl")
public class AdministratorServiceImpl implements AdministratorService {

    private AdministratorServiceImpl service = null;
    private AdministratorRepository repository;

    public AdministratorServiceImpl() {
        repository = AdministratorRepositoryImpl.getRepository();
    }

    public AdministratorServiceImpl getService(){

        if(service == null){
            return new AdministratorServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Administrator> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Administrator create(Administrator administrator) {
        return repository.create(administrator);
    }

    @Override
    public Administrator read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Administrator update(Administrator administrator) {
        return repository.update(administrator);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

