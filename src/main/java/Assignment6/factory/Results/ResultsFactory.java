package Assignment6.factory.Results;
import Assignment6.domain.Results.Results;
public class ResultsFactory {

    public static Results getResults(String finalResult,String semesterResult, String p){
        return new Results.Builder().FinalResults(finalResult)
                .SemesterResults(semesterResult)
                .PassOrFail(p)
                .build();
    }


}
