package Assignment6.factory.Results;
import Assignment6.domain.Results.Results;
public class ResultsFactory {

    public static Results getResults(int finalResult,int semesterResult, boolean p){
        return new Results.Builder().FinalResults(finalResult)
                .SemesterResults(semesterResult)
                .PassOrFail(p)
                .build();
    }


}
