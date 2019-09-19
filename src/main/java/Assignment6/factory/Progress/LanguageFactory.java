package Assignment6.factory.Progress;

import Assignment6.domain.Progress.Language;

public class LanguageFactory {
    public static Language languageBuild(String lang, String c){
        return new Language.Builder()
                .Language(lang)
                .Country(c)
                .build();


    }
}
