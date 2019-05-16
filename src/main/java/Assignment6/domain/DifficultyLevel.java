package Assignment6.domain;

import javafx.util.Builder;

public class DifficultyLevel {

    private int level;
    private DifficultyLevel(){}
    private DifficultyLevel(Builder builder){
        this.level = builder.level;

    }
    public int getLevel() {
        return level;
    }
public static class Builder {
        private int level;

    public Builder level(int level) {
        this.level = level;
        return this;
    }
    public DifficultyLevel build(){return new DifficultyLevel(this);}
}


}
