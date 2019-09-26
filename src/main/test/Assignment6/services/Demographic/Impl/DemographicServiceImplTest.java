package Assignment6.services.Demographic.Impl;

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
public class DemographicServiceImplTest {

    @Autowired
    private DemographicServiceImpl demographicService1;

    @Test
    public void create() {
        Demographic demo1 = DemographicFactory.getDemo("indian", "F");
        demographicService1.create(demo1);

        assertNotNull(demographicService1.getAll());
    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}