package Assignment6.factory.Progress;
import Assignment6.domain.Progress.DifficultyLevel;
public class DifficultyLevelFactory {

    public static DifficultyLevel levelFectory(int level){
        return new DifficultyLevel.Builder().level(level)
                .build();
    }
}
