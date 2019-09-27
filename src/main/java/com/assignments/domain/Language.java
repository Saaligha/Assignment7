package com.assignments.domain;

import java.util.Objects;

public class Language {
    private String language;

    public Language(Builder builder) {
        this.language = builder.language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static class Builder{
        private String language;

        public Builder language(String language){
            this.language= language;
            return this;
        }

        public Builder copy(Language language){
            this.language = language.language;
            return this;
        }

        public Language build(){
            return new Language(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Language)) return false;
        Language language1 = (Language) o;
        return Objects.equals(getLanguage(), language1.getLanguage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLanguage());
    }

    @Override
    public String toString() {
        return "Language{" +
                "language='" + language + '\'' +
                '}';
    }
}
