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
import za.ac.cput.domain.users.Language;
import za.ac.cput.factory.users.LanguageFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LanguageControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/language";

    @Test
    public void a_create() {

        Language language = LanguageFactory.getAttendance("456", "Saaligha", "Logday", "sl@Gmail.com");
        language.setUserID("456");
        ResponseEntity<Language> postResponse = restTemplate.postForEntity(baseURL + "/new", language, Language.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Language language = restTemplate.getForObject(baseURL + "/find/" + "456", Language.class);
        assertNotNull(language);
        System.out.println(language.getFirstName());

    }

    @Test
    public void c_update() {

        Language language = restTemplate.getForObject(baseURL + "/find/" + "456", Language.class);
        language.setFirstName("English");
        restTemplate.put(baseURL + "/update/" + "456", language);
        Language updatedLanguage = restTemplate.getForObject(baseURL + "/update/" + "456", Language.class);
        assertNotNull(language);
        System.out.println(language);

    }

    @Test
    public void e_delete() {

        Language language = restTemplate.getForObject(baseURL + "/find/" + "456", Language.class);
        assertNotNull(language);
        restTemplate.delete(baseURL + "/delete/" + "456");

        try {
            language = restTemplate.getForObject(baseURL + "/find/" + "456", Language.class);
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