package Assignment6.services.Progress;

import Assignment6.domain.Progress.DifficultyLevel;
import Assignment6.services.IService;

import java.util.Set;

public interface DifficultyLevelService extends IService<DifficultyLevel, String> {
    Set<DifficultyLevel> getAll();
}
