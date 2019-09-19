package Assignment6.repository.implementation;
import Assignment6.domain.Progress.Course;
import Assignment6.factory.Progress.CourseFactory;
import Assignment6.repository.Progress.CourseRepo;
import Assignment6.repository.Progress.Impl.CourseImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.apache.logging.log4j.util.LambdaUtil.getAll;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseImpTest {
  private CourseRepo repository;
  private Course course;

  Course c1;
  Course c2;


    @Before
    public void setUp() throws Exception {
        this.repository = CourseImp.getRepository();
        this.course = CourseFactory.getCourse("ADP 362S");
    }

    @Test
    public void create() {
       Course created = this.repository.create(this.course);
        System.out.println("Created: " +created);

        Assert.assertSame(created, this.course);
    }


    @Test
    public void update(){
     c1 = new Course.Builder().courseId("ADT45").courseName("ADT").build();
     Course c = this.repository.update(c1);
     Assert.assertEquals(c1,c);
     Assert.assertSame(c1, c);
     getAll();
        System.out.println("Updated: "+ c.getCourseId()+ " "+c.getCourseName());

    }
    @Test
    public void delete(){
        Course created = this.repository.create(this.course);
        this.repository.create(created);

        int a = this.repository.getAll().size();

        Assert.assertSame(created, this.course);
        Assert.assertEquals(1, a);
        getAll();
        System.out.println("Deleted: ");
    }
@Test
    public void read(){
    Course created = this.repository.create(this.course);
    this.repository.create(created);
    Course s = this.repository.read(created.getCourseId());

    Assert.assertEquals(created, s);
    Assert.assertNotNull(s);
    getAll();
    System.out.println("Read: " +s);

}

}