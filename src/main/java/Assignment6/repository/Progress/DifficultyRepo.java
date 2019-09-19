package Assignment6.repository.Progress;

import Assignment6.domain.Progress.DifficultyLevel;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface DifficultyRepo extends RepoA<DifficultyLevel, String> {
    Set<DifficultyLevel> getAll();
}
