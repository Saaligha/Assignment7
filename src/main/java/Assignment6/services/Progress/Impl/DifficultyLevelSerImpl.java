package Assignment6.services.Progress.Impl;

import Assignment6.domain.Progress.DifficultyLevel;
import Assignment6.repository.Progress.DifficultyRepo;
import Assignment6.repository.Progress.Impl.DifficultyImp;
import Assignment6.services.Progress.DifficultyLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("DifficultyLevelServiceImpl")
public class DifficultyLevelSerImpl implements DifficultyLevelService {
private DifficultyLevelSerImpl service = null;
private DifficultyRepo repository;

public DifficultyLevelSerImpl( ){
    this.repository = DifficultyImp.getRepository();
}

    @Override
    public Set<DifficultyLevel> getAll() {
        return this.repository.getAll();
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
