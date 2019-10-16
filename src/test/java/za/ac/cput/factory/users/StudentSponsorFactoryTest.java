package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.StudentSponsor;

public class StudentSponsorFactoryTest {

    @Test
    public void getStudentSponsor() {

        StudentSponsor studentSponsor = StudentSponsorFactory.getStudentSponsor( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(studentSponsor);
    }
}