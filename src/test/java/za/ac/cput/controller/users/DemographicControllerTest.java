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
import za.ac.cput.domain.users.Demographic;
import za.ac.cput.factory.users.DemographicFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemographicControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "" +
            "";

    @Test
    public void a_create() {

        Demographic demographic = DemographicFactory.getDemographic("123", "456", "Indian","Female");
        demographic.setVenueID("123");
        ResponseEntity<Demographic> postResponse = restTemplate.postForEntity(baseURL + "/new", demographic, Demographic.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Demographic demographic = restTemplate.getForObject(baseURL + "/find/" + "123", Demographic.class);
        assertNotNull(demographic);
        System.out.println(demographic.getVenueName());

    }

    @Test
    public void c_update() {

        Demographic demographic = restTemplate.getForObject(baseURL + "/find/" + "123", Demographic.class);
        demographic.setVenueName("Indian");
        restTemplate.put(baseURL + "/update/" + "123", demographic);
        Demographic updatedDemographic = restTemplate.getForObject(baseURL + "/update/" + "123", Demographic.class);
        assertNotNull(demographic);
        System.out.println(demographic);

    }

    @Test
    public void e_delete() {

        Demographic demographic = restTemplate.getForObject(baseURL + "/find/" + "123", Demographic.class);
        assertNotNull(demographic);
        restTemplate.delete(baseURL + "/delete/" + "123");

        try {
            demographic = restTemplate.getForObject(baseURL + "/find/" + "123", Demographic.class);
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