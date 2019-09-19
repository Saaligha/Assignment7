package Assignment6.domain.Demographic;

import java.util.Objects;

public class Location {
    private String region;

    private Location(Builder builder){
        this.region = builder.region;
    }


    public String getRegion(){
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder)) return false;
            Builder builder = (Builder) o;
            return Objects.equals(region, builder.region);
        }

        @Override
        public int hashCode() {
            return Objects.hash(region);
        }
    }
}




