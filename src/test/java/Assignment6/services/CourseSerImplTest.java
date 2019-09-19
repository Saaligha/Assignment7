package Assignment6.services;

import Assignment6.domain.Progress.Course;
import Assignment6.factory.Progress.CourseFactory;
import Assignment6.repository.Progress.Impl.CourseImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseSerImplTest {

    private CourseImp repository;
    private Course course;

    private Course getSaved(){
        Set<Course> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.repository = CourseImp.getRepository();
        this.course = CourseFactory.getCourse("Application Development Practice 3");
    }

    @Test
    public void create(){
        Course created = this.repository.create(this.course);
        System.out.println("Created: ADP 2019" );
        Assert.assertNotNull(created);
       // Assert.assertSame(created, this.course);

    }
    @Test
    public void update(){
        Course created = this.repository.create(this.course);
        Course created2 = this.repository.create(this.course);
        Course created3 = this.repository.create(this.course);
        this.repository.create(created);
        this.repository.create(created2);

        Course updated = this.repository.update(created3);
        Assert.assertEquals(created3, updated);

    }
    @Test
    public void delete(){

        Course created = this.repository.create(this.course);
        Course created2 = this.repository.create(this.course);

        this.repository.create(created);
        this.repository.create(created2);

        this.repository.delete(created.getCourseId());

        int a = this.repository.getAll().size();

        Assert.assertEquals(0, a);
        System.out.println("Deleted" +a);
    }

    @Test
    public void read(){
        Course created = this.repository.create(this.course);
        this.repository.create(created);
        Course s = this.repository.read(created.getCourseId());

        Assert.assertEquals(created, s);
        Assert.assertNotNull(s);
        System.out.println("Read: " +s);
    }
    }

