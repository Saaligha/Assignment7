package Assignment6.factory;

import Assignment6.domain.Language;

public class LanguageFactory {
    public static Language languageBuild(String language, int country){
        return new Language.Builder()
                .Language()
                .Country()
                .build();

    }
}
