package Assignment6.repository.implementation;

import Assignment6.domain.DifficultyLevel;
import Assignment6.repository.DifficultyRepo;

import java.util.HashSet;
import java.util.Set;

public class DifficultyImp implements DifficultyRepo {
    private static DifficultyImp repository = null;

    private Set<DifficultyLevel> difficulty;

    private DifficultyImp(){
        this.difficulty = new HashSet<>();
    }
    public static DifficultyImp getRepository(){
        if (repository == null) repository = new DifficultyImp();
        return repository;
    }

    @Override
    public Set<DifficultyLevel> getAll() {
        return this.difficulty;
    }

    @Override
    public DifficultyLevel create(DifficultyLevel difficultyLevel) {
        this.difficulty.add(difficultyLevel);
        return difficultyLevel;
    }

    @Override
    public DifficultyLevel update(DifficultyLevel difficultyLevel) {
        this.difficulty.add(difficultyLevel);
        return difficultyLevel;
    }

    @Override
    public void delete(String s) {
    this.difficulty.remove(s);
    }

    @Override
    public DifficultyLevel read(String s) {
        return null;
    }
}
