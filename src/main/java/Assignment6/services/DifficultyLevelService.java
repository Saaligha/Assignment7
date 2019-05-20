package Assignment6.services;

import Assignment6.domain.DifficultyLevel;

import java.util.Set;

public interface DifficultyLevelService extends IService<DifficultyLevel, String> {
    Set<DifficultyLevel> getAll();
}
