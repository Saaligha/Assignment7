package Assignment6.factory;

import Assignment6.domain.Nationality;

public class NationalityFactory {

    public static Nationality getNationality(String nationality, String language){
        return new Nationality.Builder().Nationality(nationality)
                .language(language)
                .build();

    }

}
