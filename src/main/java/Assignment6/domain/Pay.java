package Assignment6.domain;

import javafx.util.Builder;

public class Pay {

    private int amt;

    private Pay(){}

    private Pay(Builder builder){
        this.amt = builder.amt;
    }

    public int getAmt(){
        return amt;
    }
    public static class Builder{


        private int amt;

        public Builder amt(int amt){
            this.amt = amt;
            return this;
        }

        public Pay build(){
            return new Pay(this);
        }

    }
}