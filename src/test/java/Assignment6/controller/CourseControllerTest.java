package Assignment6.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class CourseControllerTest {

@Autowired
private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/course";
@Test
    public void getCourse(){
    HttpHeaders headers = new HttpHeaders();

    HttpEntity<String> entity = new HttpEntity<String>(null, headers);
    ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
            HttpMethod.GET, entity, String.class);
    assertNotNull(response.getBody());
}


}
