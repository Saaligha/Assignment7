package repositoryTest;

import Assignment6.repository.Demographic.Impl.DemographicRepoImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemographicRepositoryTest {
    @Autowired
    private DemographicRepoImp demographicRepoImp;

    @Test
    public void create(){


    }

}
