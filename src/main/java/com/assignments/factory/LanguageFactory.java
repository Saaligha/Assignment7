package com.assignments.factory;


import com.assignments.domain.Language;

public class LanguageFactory {

    public static Language getLanguage(String language) {
        return new Language.Builder().language(language).build();
    }
}