package Assignment6.domain;

import javafx.util.Builder;

import java.util.Objects;

public class DifficultyLevel {

    private int level;
    private DifficultyLevel(){}
    private DifficultyLevel(Builder builder){
        this.level = builder.level;

    }

    public void setLevel(int level) {
        this.level = level;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DifficultyLevel)) return false;
        DifficultyLevel that = (DifficultyLevel) o;
        return getLevel() == that.getLevel();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLevel());
    }
}
