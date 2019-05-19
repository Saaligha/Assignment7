package Assignment6.domain;

public class Location {
    private String region;

    private Location(Builder builder){
        this.region = builder.region;
    }


    public String getRegion(){
        return region;
    }

    public static class Builder{
        private String region;

        public Builder region(String sa){
            this.region = region;
            return this;
        }
        public Location build(){
            return new Location(this);
        }

        public Builder copy(Location savedLocation){
            this.region = region;
            return this;
        }
    }
}




