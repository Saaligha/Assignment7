package Assignment6.domain;

import javafx.util.Builder;

public class Subscription {
    private boolean type;

    private Subscription(){}

    private Subscription(Builder builder){
        this.type = builder.type;

    }

    public Subscription(Object o) {
    }

    public boolean isType() {
        return type;
    }

    public static class Builder {

        private boolean type;

        public Builder subType() {
            this.type = type;
            return this;
        }
        public Subscription build(){return new Subscription(this);}
    }


}
