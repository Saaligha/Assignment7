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
import za.ac.cput.domain.users.User;

import za.ac.cput.factory.users.UserFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/user";

    @Test
    public void a_create() {

        User user = UserFactory.getUser("369", "Jonah", "Hill", "jj@Gmail.com");
        user.setUserID("369");
        ResponseEntity<User> postResponse = restTemplate.postForEntity(baseURL + "/new", user, User.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        User user = restTemplate.getForObject(baseURL + "/find/" + "369", User.class);
        assertNotNull(user);
        System.out.println(user.getFirstName());

    }

    @Test
    public void c_update() {

        User user = restTemplate.getForObject(baseURL + "/find/" + "369", User.class);
        user.setFirstName("Jonah Hill");
        restTemplate.put(baseURL + "/update/" + "369", user);
        User updatedUser = restTemplate.getForObject(baseURL + "/update/" + "369", User.class);
        assertNotNull(user);
        System.out.println(user);

    }

    @Test
    public void e_delete() {

        User user = restTemplate.getForObject(baseURL + "/find/" + "369", User.class);
        assertNotNull(user);
        restTemplate.delete(baseURL + "/delete/" + "369");

        try {
            user = restTemplate.getForObject(baseURL + "/find/" + "216183006", User.class);
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