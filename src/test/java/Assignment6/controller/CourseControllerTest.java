package Assignment6.controller;

import Assignment6.domain.Course;
import Assignment6.factory.CourseFactory;
import org.junit.Assert;
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
    private String baseURL="http://localhost:8080/Course";
/*@Test
    public void create(){

    Course course = CourseFactory.getCourse("ADP");
    ResponseEntity<Course> postResponse = restTemplate.postForEntity(baseURL + "/create", course, Course.class);
    Assert.assertNotNull(postResponse);
    Assert.assertNotNull(postResponse.getBody());
}

*/

@Test
    public void update(){

    String name = "ADP";

    Course course = restTemplate.getForObject(baseURL + "/Course/" + name, Course.class);

    restTemplate.put(baseURL + "/Course" + name, Course.class);
    Course updatedCourse = restTemplate.getForObject(baseURL+ "/Course/" + name, Course.class);

    Assert.assertNotNull(updatedCourse);
}
}
