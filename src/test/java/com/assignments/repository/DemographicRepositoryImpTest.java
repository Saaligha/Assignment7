package com.assignments.repository;

import com.assignments.domain.Demographic;
import com.assignments.factory.DemographicFactory;
import com.assignments.repository.impl.DemographicRepositoryImp;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemographicRepositoryImpTest {
    @Autowired
    private DemographicRepositoryImp demographicRepositoryImp;
    Demographic demo = DemographicFactory.getDemo("I","F");

    @Test
    public void create() {
        demographicRepositoryImp.create(demo);
        assertNotNull(demographicRepositoryImp.getAll());
        System.out.println(demographicRepositoryImp.getAll());

    }
    @Test
    public void read() {
        Demographic demo1 = demographicRepositoryImp.read(demo.getGender());
        assertNull(demo1);
        System.out.println(demographicRepositoryImp.getAll());
    }
    @Test
    public void update() {
        Demographic updatedDemo = DemographicFactory.getDemo("I", "F");
        demographicRepositoryImp.update(updatedDemo);
        System.out.println(demographicRepositoryImp.getAll());
    }

    @Test
    public void delete() {
        assertNotNull(demographicRepositoryImp.getAll());
        demographicRepositoryImp.delete(demo.getGender());
        Demographic D = demographicRepositoryImp.read(demo.getGender());
        assertNull(D);
        System.out.println(demographicRepositoryImp.getAll());
    }


}