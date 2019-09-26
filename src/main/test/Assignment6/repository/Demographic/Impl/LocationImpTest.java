package Assignment6.repository.Demographic.Impl;

import Assignment6.domain.Demographic.Location;
import Assignment6.factory.Demographic.LocationFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationImpTest {

    @Autowired
    private LocationImp locRepo;

    @Test
    public void create() {
        Location loc = LocationFactory.getUserRegion("South region");
        locRepo.create(loc);

        assertNotNull(locRepo.getAll());
    }
}

   /*   @Test
    public void update() {
 /*    Location l = LocationFactory.getUserRegion("North region");
    locRepo.create(l);

    Location lUpdate = LocationFactory.getUserRegion("North region");
    lUpdate.setRegion(l.getRegion());
    locRepo.update(lUpdate);
   */
     /*     Location loc = LocationFactory.getUserRegion("South region");
        locRepo.create(loc);

        assertNotNull(locRepo.getAll());
    /*  }

   /*   @Test
    public void delete() {
            Location loc = LocationFactory.getUserRegion("South region");
              locRepo.create(loc);

               assertNotNull(locRepo.getAll());

           locRepo.delete(loc.getRegion());

         Location updated = locRepo.read(loc.getRegion());

          assertEquals(null, updated);
    }

    @Test
    public void read() {
        Location loc = LocationFactory.getUserRegion("South region");
        locRepo.create(loc);

        Location locinSet = locRepo.read(loc.getRegion());
        assertNull(locinSet);
    }

}*/