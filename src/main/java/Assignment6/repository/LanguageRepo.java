package Assignment6.repository;

import Assignment6.domain.Language;

import java.util.Set;

public interface LanguageRepo extends RepoA<Language, String> {
    Set<Language> getAll();
}
