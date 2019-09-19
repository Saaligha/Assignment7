package Assignment6.repository.Progress;

import Assignment6.domain.Progress.Language;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface LanguageRepo extends RepoA<Language, String> {
    Set<Language> getAll();
}
