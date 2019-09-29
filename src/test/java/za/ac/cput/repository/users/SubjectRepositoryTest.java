package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Subject;
import za.ac.cput.factory.users.SubjectFactory;
import za.ac.cput.repository.users.impl.SubjectRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SubjectRepositoryTest {

    @Autowired
    private SubjectRepositoryImpl subjectRepository;
    Subject subject = SubjectFactory.getSubject("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        subjectRepository.create(subject);
        assertNotNull(subjectRepository.getAll());
        System.out.println(subjectRepository.getAll());

    }

    @Test
    public void b_read() {

        Subject fromSet = subjectRepository.read(subject.getSubjectID());
        assertEquals(subject, fromSet);
        System.out.println(subjectRepository.getAll());
    }

    @Test
    public void c_update() {


        Subject updatedSubject  = SubjectFactory.getSubject("TestID", "TestName2", "TestLastName", "TestEmail");
        subjectRepository.update(updatedSubject);
        Assert.assertNotEquals(subject.getSubjectName(), updatedSubject.getSubjectName());
        System.out.println(subjectRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(subjectRepository.getAll());
        subjectRepository.delete(subject.getSubjectID());
        Subject subjectTor = subjectRepository.read(subject.getSubjectID());
        assertNull(subjectTor);
        System.out.println(subjectRepository.getAll());

    }
}