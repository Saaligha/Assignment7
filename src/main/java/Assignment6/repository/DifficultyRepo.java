package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.DifficultyLevel;

import java.util.Set;

public interface DifficultyRepo extends RepoA<DifficultyLevel, String> {
    Set<DifficultyLevel> getAll();
}
