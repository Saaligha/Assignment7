package Assignment6.domain;

public class HoursClocked {
    private int hours;

  private HoursClocked(){}

  private HoursClocked(Builder builder){
      this.hours = builder.hours;
  }


  public int getHours(){return hours;}

  public static class Builder{


      private int hours;

      public Builder hours(int hours){
          this.hours = hours;
          return this;
      }

      public HoursClocked build(){return new HoursClocked(this);}

  }













}






















