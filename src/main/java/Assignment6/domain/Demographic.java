package Assignment6.domain;

import java.util.Objects;

public class Demographic {
    private String gender, race;


    private Demographic(Builder builder){
        this.gender = builder.gender;
        this.race = builder.race;

    }
    public String getGender() {
        return gender;
    }
    public String getRace() {
        return race;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public static class Builder{

        private String race,gender;

    public Builder gender(String gender) {
        this.gender = gender;
        return this;
    }


    public Builder race(String race) {
        this.race = race;
        return this;
    }

    public Builder copy(Demographic demographic){
        this.gender = demographic.gender;
        this.race = demographic.race;

        return this;
    }
    public Demographic build(){
        return new Demographic(this);
    }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder)) return false;
            Builder builder = (Builder) o;
            return Objects.equals(race, builder.race) &&
                    Objects.equals(gender, builder.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(race, gender);
        }
    }}
