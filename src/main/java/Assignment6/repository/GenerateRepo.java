package Assignment6.repository;

import Assignment6.domain.Progress.Course;
import Assignment6.domain.GenerateId;

import java.util.Set;

public interface GenerateRepo extends RepoA<Course, String> {
    Set<GenerateId> getAll();
}
