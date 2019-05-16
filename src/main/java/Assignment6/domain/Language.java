package Assignment6.domain;

import java.util.Set;

public class Language {
    private String language;
    private int country;

    private Language(Builder builder){
        this.language = builder.language;
        this.country = builder.country;
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

    public Builder Language() {
        this.language = language;
        return this;
    }


    public Builder Country() {
        this.country = country;
        return this;
    }
    public Language build(){
        return new Language(this);
    }
}}
