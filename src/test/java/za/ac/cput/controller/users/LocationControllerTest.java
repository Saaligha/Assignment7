package za.ac.cput.controller.users;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.domain.users.Location;
import za.ac.cput.factory.users.LocationFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocationControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/location";

    @Test
    public void a_create() {

        Location location = LocationFactory.getLoc("456", "Cape Town", "South Africa", "Western Cape");
        location.setUniversityID("456");
        ResponseEntity<Location> postResponse = restTemplate.postForEntity(baseURL + "/new", location, Location.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Location location = restTemplate.getForObject(baseURL + "/find/" + "456", Location.class);
        assertNotNull(location);
        System.out.println(location.getUniversityName());

    }

    @Test
    public void c_update() {

        Location location = restTemplate.getForObject(baseURL + "/find/" + "456", Location.class);
        location.setUniversityName("Advanced");
        restTemplate.put(baseURL + "/update/" + "789", location);
        Location updatedLocation = restTemplate.getForObject(baseURL + "/update/" + "789", Location.class);
        assertNotNull(location);
        System.out.println(location);

    }

    @Test
    public void e_delete() {

        Location location = restTemplate.getForObject(baseURL + "/find/" + "456", Location.class);
        assertNotNull(location);
        restTemplate.delete(baseURL + "/delete/" + "456");

        try {
            location = restTemplate.getForObject(baseURL + "/find/" + "456", Location.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }

    @Test
    public void d_getAll() {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());
    }


}