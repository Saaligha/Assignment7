package Assignment6.repository.Demographic.Impl;

import Assignment6.domain.Demographic.Demographic;
import Assignment6.factory.Demographic.DemographicFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemographicRepoImpTest {
    @Autowired
    private DemographicRepoImp demographicRepo;


    @Test
    public void create() {
        Demographic demo = DemographicFactory.getDemo("indian", "F");
        demographicRepo.create(demo);

        assertNotNull(demographicRepo.getAll());
    }

    @Test
    public void update() {
        Demographic demo = DemographicFactory.getDemo("indian", "F");
        demographicRepo.create(demo);

        Demographic demoUpdate = DemographicFactory.getDemo("indian", "F");
        demoUpdate.setGender(demo.getGender());
        demographicRepo.update(demoUpdate);
    }

    @Test
    public void delete() {
        Demographic demo = DemographicFactory.getDemo("indian", "F");
        demographicRepo.create(demo);

        assertNotNull(demographicRepo.getAll());

        demographicRepo.delete(demo.getGender());

        Demographic updated = demographicRepo.read(demo.getGender());

        assertEquals(null, updated);
    }

    @Test
    public void read() {

        Demographic demo = DemographicFactory.getDemo("indian", "F");
        demographicRepo.create(demo);

        Demographic inSet = demographicRepo.read(demo.getRace());
        assertNotEquals(demo,inSet);
    }
}