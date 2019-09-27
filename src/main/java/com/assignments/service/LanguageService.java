package com.assignments.service;


import com.assignments.domain.Language;

import java.util.Set;

public interface LanguageService extends IService<Language, String>{

        Set<Language> getAll();
        }
