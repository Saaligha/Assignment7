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
import za.ac.cput.domain.users.Quiz;
import za.ac.cput.factory.users.QuizFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QuizControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/quiz";

    @Test
    public void a_create() {

        Quiz quiz = QuizFactory.getQuiz("First Quiz", "", "", "");
        quiz.setUserID("First Quiz");
        ResponseEntity<Quiz> postResponse = restTemplate.postForEntity(baseURL + "/new", quiz, Quiz.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Quiz quiz = restTemplate.getForObject(baseURL + "/find/" + "First Quiz", Quiz.class);
        assertNotNull(quiz);
        System.out.println(quiz.getFirstName());

    }

    @Test
    public void c_update() {

        Quiz quiz = restTemplate.getForObject(baseURL + "/find/" + "First Quiz", Quiz.class);
        quiz.setFirstName("First Quiz");
        restTemplate.put(baseURL + "/update/" + "Second Quiz", quiz);
        Quiz updatedQuiz = restTemplate.getForObject(baseURL + "/update/" + "Second Quiz", Quiz.class);
        assertNotNull(quiz);
        System.out.println(quiz);

    }

    @Test
    public void e_delete() {

        Quiz quiz = restTemplate.getForObject(baseURL + "/find/" + "First Quiz", Quiz.class);
        assertNotNull(quiz);
        restTemplate.delete(baseURL + "/delete/" + "First Quiz");

        try {
            quiz = restTemplate.getForObject(baseURL + "/find/" + "First Quiz", Quiz.class);
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