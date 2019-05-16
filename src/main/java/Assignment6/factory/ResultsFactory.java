package Assignment6.factory;
import Assignment6.domain.Results;
public class ResultsFactory {
    public static Results getRes(int finalResult,int semesterResult, boolean p){
        return new Results.Builder().FinalResults(finalResult)
                .SemesterResults(semesterResult)
                .PassOrFail(p)
                .build();
    }


}
