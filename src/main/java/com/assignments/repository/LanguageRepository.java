package com.assignments.repository;



import com.assignments.domain.Language;

import java.util.Set;

public interface LanguageRepository extends IRepository<Language, String>{

    Set<Language> getAll();
}
