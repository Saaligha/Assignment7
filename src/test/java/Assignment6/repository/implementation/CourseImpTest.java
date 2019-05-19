package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.factory.CourseFactory;
import Assignment6.repository.CourseRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CourseImpTest {
  private CourseRepo repository;
  private Set<Course> course;

  Course c1;
  Course c2;


    @Before
    public void setUp() throws Exception {
        this.repository = CourseImp.getRepository();
    }

    @Test
    public void create() {
       c1 = new Course.Builder().courseId("olkij").courseName("ADP").build();
       c2 = new Course.Builder().courseId("dcfghy").courseName("ADP").build();
       Course c = this.repository.create(c1);
       Assert.assertNotEquals(c1, c);
       Course cc = this.repository.create(c2);
       Assert.assertNotEquals(c2, cc);
    }

    private Course getSavedCourse() {
        Set<Course> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }


    @Test
    public void update(){
     c1 = new Course.Builder().courseId("ADT45").courseName("ADT").build();
     Course c = this.repository.update(c1);
     Assert.assertEquals(c1,c);
        System.out.println(c.getCourseId());

    }

    @Test
    public void delete(){
        String s = "ADT45";

        this.repository.delete(s);
        course = this.repository.getAll();
        int size = course.size();
        Assert.assertEquals(0,size);

        System.out.println(course.size());
    }
    @Test
    public void getAll(){
        course = this.repository.getAll();
        Assert.assertEquals(0, course.size());
        System.out.println(course.size());
    }
}