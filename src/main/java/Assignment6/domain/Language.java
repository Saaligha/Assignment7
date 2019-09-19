package Assignment6.domain;

import java.util.Objects;
import java.util.Set;

public class Language {
    private String language;
    private int country;

    private Language(Builder builder){
        this.language = builder.language;
        this.country = builder.country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }
    public int getCountry() {
        return country;
    }
public static class Builder{
        private String language;
        private int country;

    public Builder Language(String language) {
        this.language = this.language;
        return this;
    }


    public Builder Country(String c) {
        this.country = country;
        return this;
    }
    public Language build(){
        return new Language(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Builder)) return false;
        Builder builder = (Builder) o;
        return country == builder.country &&
                language.equals(builder.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, country);
    }
}}
