package Assignment6.services.Impl;

import Assignment6.domain.DifficultyLevel;
import Assignment6.repository.DifficultyRepo;
import Assignment6.services.DifficultyLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("DifficultyLevelSer")
public class DifficultyLevelSerImpl implements DifficultyLevelService {
@Autowired
@Qualifier
private DifficultyRepo repository;

public DifficultyLevelSerImpl(DifficultyRepo repository){
    this.repository = repository;
}

    @Override
    public Set<DifficultyLevel> getAll() {
        return null;
    }

    @Override
    public DifficultyLevel create(DifficultyLevel type) {
        return repository.create(type);
    }

    @Override
    public DifficultyLevel update(DifficultyLevel type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public DifficultyLevel read(String s) {
        return repository.read(s);
    }
}
