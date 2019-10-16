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
import za.ac.cput.domain.users.Lecturer;
import za.ac.cput.factory.users.LecturerFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LecturerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/lecturer";

    @Test
    public void a_create() {

        Lecturer lecturer = LecturerFactory.getLecturer("216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        lecturer.setUserID("216183006");
        ResponseEntity<Lecturer> postResponse = restTemplate.postForEntity(baseURL + "/new", lecturer, Lecturer.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Lecturer lecturer = restTemplate.getForObject(baseURL + "/find/" + "216183006", Lecturer.class);
        assertNotNull(lecturer);
        System.out.println(lecturer.getFirstName());

    }

    @Test
    public void c_update() {

        Lecturer lecturer = restTemplate.getForObject(baseURL + "/find/" + "216183006", Lecturer.class);
        lecturer.setFirstName("Derek");
        restTemplate.put(baseURL + "/update/" + "216183006", lecturer);
        Lecturer updatedLecturer = restTemplate.getForObject(baseURL + "/update/" + "216183006", Lecturer.class);
        assertNotNull(lecturer);
        System.out.println(lecturer);

    }

    @Test
    public void e_delete() {

        Lecturer lecturer = restTemplate.getForObject(baseURL + "/find/" + "216183006", Lecturer.class);
        assertNotNull(lecturer);
        restTemplate.delete(baseURL + "/delete/" + "216183006");

        try {
            lecturer = restTemplate.getForObject(baseURL + "/find/" + "216183006", Lecturer.class);
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