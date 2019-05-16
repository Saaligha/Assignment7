package Assignment6.domain;

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


    public static class Builder{

        private String race,gender;

    public Builder setGender(String gender) {
        this.gender = gender;
        return this;
    }


    public Builder setRace(String race) {
        this.race = race;
        return this;
    }
    public Demographic build(){
        return new Demographic(this);
    }


    }}
