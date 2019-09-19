package Assignment6.domain.Progress;

import java.util.Objects;

public class HoursClocked {
    private int hours;

  private HoursClocked(){}

  private HoursClocked(Builder builder){
      this.hours = builder.hours;
  }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours(){return hours;}

  public static class Builder{


      private int hours;

      public Builder hours(int hours){
          this.hours = hours;
          return this;
      }

      public HoursClocked build(){return new HoursClocked(this);}

      @Override
      public boolean equals(Object o) {
          if (this == o) return true;
          if (!(o instanceof Builder)) return false;
          Builder builder = (Builder) o;
          return hours == builder.hours;
      }

      @Override
      public int hashCode() {
          return Objects.hash(hours);
      }
  }













}






















