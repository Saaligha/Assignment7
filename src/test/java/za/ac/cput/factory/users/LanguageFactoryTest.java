package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Language;

public class LanguageFactoryTest {

    @Test
    public void getAttendance() {

        Language language = LanguageFactory.getAttendance( "123", "English", "", "");
        Assert.assertNotNull(language);
    }
}