package za.ac.cput.security;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Person;
import za.ac.cput.factory.users.PersonFactory;
import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SecurityTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/administrator";

    @Autowired

    @Before
    public void addDummyData(){

        Person person = PersonFactory.getPerson("216183006","Deklerk", "Basson", "deklerk@dkbasson.com");

        ResponseEntity<Person> postResponse = restTemplate.postForEntity(baseURL + "/new", person, Person.class);

    }

    @Test
    public void whenCorrectCredentialsWillBe200() throws Exception {

        ResponseEntity<String> response = restTemplate.withBasicAuth("admin", "admin").getForEntity(baseURL + "/getall", String.class);

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());

        assertEquals(HttpStatus.OK, response.getStatusCode());

    }

    @Test
    public void whenIncorrectCredentialsWillBe401() throws Exception {

        ResponseEntity<String> response = restTemplate.withBasicAuth("admin", "admins").getForEntity(baseURL + "/getall", String.class);

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());

        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());

    }

}
