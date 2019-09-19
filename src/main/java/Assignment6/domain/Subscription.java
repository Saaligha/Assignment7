package Assignment6.domain;

import javafx.util.Builder;

import java.util.Objects;

public class Subscription {
    private String type;

    private Subscription(){}

    private Subscription(Builder builder){
        this.type = builder.type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Subscription(Object o) {
    }

    public String isType() {
        return type;
    }

    public static class Builder {

        private String type;

        public Builder subType(String type) {
            this.type = this.type;
            return this;
        }
        public Subscription build(){return new Subscription(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscription)) return false;
        Subscription that = (Subscription) o;
        return isType() == that.isType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isType());
    }
}
