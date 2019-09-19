package Assignment6.domain.Payment;

import java.util.Objects;

public class Pay {

    private int amt;

    private Pay(){}

    private Pay(Builder builder){
        this.amt = builder.amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder)) return false;
            Builder builder = (Builder) o;
            return amt == builder.amt;
        }

        @Override
        public int hashCode() {
            return Objects.hash(amt);
        }
    }
}