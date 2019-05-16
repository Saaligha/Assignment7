package Assignment6.factory;
import Assignment6.domain.DifficultyLevel;
public class DifficultyLevelFactory {

    public static DifficultyLevel levelFectory(int level){
        return new DifficultyLevel.Builder().level(level)
                .build();
    }
}
