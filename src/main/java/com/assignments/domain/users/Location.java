package za.ac.cput.domain.users;

public class Location {
    private String universityID, universityName, universityDisc, universityLevel;

    public Location(Builder builder) {
        this.universityID = builder.universityID;
        this.universityName = builder.universityName;
        this.universityDisc = builder.universityDisc;
        this.universityLevel = builder.universityLevel;
    }

    public Location(){

    }

    public String getUniversityID() {
        return universityID;
    }

    public void setUniversityID(String universityID) {
        this.universityID = universityID;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityDisc() {
        return universityDisc;
    }

    public void setUniversityDisc(String universityDisc) {
        this.universityDisc = universityDisc;
    }

    public String getUniversityLevel() {
        return universityLevel;
    }

    public void setUniversityLevel(String universityLevel) {
        this.universityLevel = universityLevel;
    }
    public static class Builder{
        private String universityID, universityName, universityDisc, universityLevel;

        public Builder universityID(String universityID){
            this.universityID = universityID;
            return this;
        }

        public Builder universityName(String universityName){
            this.universityName = universityName;
            return this;
        }

        public Builder universityDisc(String universityDisc){
            this.universityDisc = universityDisc;
            return this;
        }

        public Builder universityLevel(String universityLevel){
            this.universityLevel = universityLevel;
            return this;
        }

        public Location.Builder copy(Location location){
            this.universityID = location.universityID;
            this.universityName = location.universityName;
            this.universityDisc = location.universityDisc;
            this.universityLevel = location.universityLevel;
            return this;
        }

        public Location build(){
            return new Location(this);
        }
    }

    @Override
    public String toString() {
        return "UniversityRepository{" +
                "universityID='" + universityID + '\'' +
                ", universityName='" + universityName + '\'' +
                ", universityDisc='" + universityDisc + '\'' +
                ", universityLevel='" + universityLevel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;

        Location location = (Location) o;

        if (getUniversityID() != null ? !getUniversityID().equals(location.getUniversityID()) : location.getUniversityID() != null) return false;
        if (getUniversityName() != null ? !getUniversityName().equals(location.getUniversityName()) : location.getUniversityName() != null)
            return false;
        if (getUniversityDisc() != null ? !getUniversityDisc().equals(location.getUniversityDisc()) : location.getUniversityDisc() != null)
            return false;
        return getUniversityLevel() != null ? getUniversityLevel().equals(location.getUniversityLevel()) : location.getUniversityLevel() == null;
    }

    @Override
    public int hashCode() {
        int result = getUniversityID() != null ? getUniversityID().hashCode() : 0;
        result = 31 * result + (getUniversityName() != null ? getUniversityName().hashCode() : 0);
        result = 31 * result + (getUniversityDisc() != null ? getUniversityDisc().hashCode() : 0);
        result = 31 * result + (getUniversityLevel() != null ? getUniversityLevel().hashCode() : 0);
        return result;
    }
}


