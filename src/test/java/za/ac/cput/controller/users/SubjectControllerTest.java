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
import za.ac.cput.domain.users.Subject;
import za.ac.cput.factory.users.SubjectFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SubjectControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/subject";

    @Test
    public void a_create() {

        Subject subject = SubjectFactory.getSubject("216183006", "Maths", "Boring", "Too High");
        subject.setSubjectID("216183006");
        ResponseEntity<Subject> postResponse = restTemplate.postForEntity(baseURL + "/new", subject, Subject.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Subject subject = restTemplate.getForObject(baseURL + "/find/" + "216183006", Subject.class);
        assertNotNull(subject);
        System.out.println(subject.getSubjectName());

    }

    @Test
    public void c_update() {

        Subject subject = restTemplate.getForObject(baseURL + "/find/" + "216183006", Subject.class);
        subject.setSubjectName("MathsAdvanced");
        restTemplate.put(baseURL + "/update/" + "216183006", subject);
        Subject updatedSubject = restTemplate.getForObject(baseURL + "/update/" + "216183006", Subject.class);
        assertNotNull(subject);
        System.out.println(subject);

    }

    @Test
    public void e_delete() {

        Subject subject = restTemplate.getForObject(baseURL + "/find/" + "216183006", Subject.class);
        assertNotNull(subject);
        restTemplate.delete(baseURL + "/delete/" + "216183006");

        try {
            subject = restTemplate.getForObject(baseURL + "/find/" + "216183006", Subject.class);
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