package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Administrator;
import za.ac.cput.repository.users.AdministratorRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("AdministratorInMemory")
public class AdministratorRepositoryImpl implements AdministratorRepository {

    private static AdministratorRepositoryImpl repository = null;
    private Set<Administrator> administrators;

    public AdministratorRepositoryImpl(){
        administrators = new HashSet<>();
    }


    public static AdministratorRepositoryImpl getRepository() {

        if(repository == null){
            return new AdministratorRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Administrator create(Administrator administrator) {

        administrators.add(administrator);
        return administrator;
    }

    @Override
    public Administrator read(String id) {

        return administrators.stream().filter(administrator -> administrator.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Administrator update(Administrator administrator) {

        Administrator inDB = read(administrator.getUserID());

        if(inDB != null){
            administrators.remove(inDB);
            administrators.add(administrator);
            return administrator;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Administrator inDB = read(id);
        administrators.remove(inDB);

    }

    @Override
    public Set<Administrator> getAll() {
        return administrators;
    }

}

