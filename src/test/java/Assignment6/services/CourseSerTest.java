package Assignment6.services;

import Assignment6.domain.Course;
import Assignment6.services.Impl.CourseSerImp;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseSerTest {
    private CourseSerImp repository;
    private Course course;

    private Course getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception{

    }

}
