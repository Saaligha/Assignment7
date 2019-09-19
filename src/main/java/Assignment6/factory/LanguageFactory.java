package Assignment6.factory;

import Assignment6.domain.Language;

public class LanguageFactory {
    public static Language languageBuild(String lang, String c){
        return new Language.Builder()
                .Language(lang)
                .Country(c)
                .build();


    }
}
