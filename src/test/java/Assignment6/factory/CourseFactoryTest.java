package Assignment6.factory;

import Assignment6.domain.Course;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseFactoryTest {
/*
    @Test
    public void getCourse(){
    String c = "Spanish";

    Course a = CourseFactory.getCourse(c);
    System.out.println(a);
    Assert.assertNotNull(a.getCourseName());

}
*/


     private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }

    @Test
    public void buildCourse(){
        Course c = CourseFactory.getCourse(this.testName);
        Assert.assertNotNull(c.getCourseId());
        Assert.assertNotNull(c.getCourseName());
        Assert.assertNotNull(c);
        Assert.assertTrue("Spanish", true);

        System.out.println("ok");
    }

}