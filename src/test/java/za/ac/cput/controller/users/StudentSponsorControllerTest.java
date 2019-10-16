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
import za.ac.cput.domain.users.StudentSponsor;
import za.ac.cput.factory.users.StudentSponsorFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentSponsorControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/studentSponsor";

    @Test
    public void a_create() {

        StudentSponsor studentSponsor = StudentSponsorFactory.getStudentSponsor("216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        studentSponsor.setUserID("216183006");
        ResponseEntity<StudentSponsor> postResponse = restTemplate.postForEntity(baseURL + "/new", studentSponsor, StudentSponsor.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        StudentSponsor studentSponsor = restTemplate.getForObject(baseURL + "/find/" + "216183006", StudentSponsor.class);
        assertNotNull(studentSponsor);
        System.out.println(studentSponsor.getFirstName());

    }

    @Test
    public void c_update() {

        StudentSponsor studentSponsor = restTemplate.getForObject(baseURL + "/find/" + "216183006", StudentSponsor.class);
        studentSponsor.setFirstName("Derek");
        restTemplate.put(baseURL + "/update/" + "216183006", studentSponsor);
        StudentSponsor updatedStudentSponsor = restTemplate.getForObject(baseURL + "/update/" + "216183006", StudentSponsor.class);
        assertNotNull(studentSponsor);
        System.out.println(studentSponsor);

    }

    @Test
    public void e_delete() {

        StudentSponsor studentSponsor = restTemplate.getForObject(baseURL + "/find/" + "216183006", StudentSponsor.class);
        assertNotNull(studentSponsor);
        restTemplate.delete(baseURL + "/delete/" + "216183006");

        try {
            studentSponsor = restTemplate.getForObject(baseURL + "/find/" + "216183006", StudentSponsor.class);
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