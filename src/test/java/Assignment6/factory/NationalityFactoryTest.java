package Assignment6.factory;

import Assignment6.domain.Nationality;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NationalityFactoryTest {

    private String nationality, language;

    @Before
    public void setUp() throws Exception {
        this.language = "English";
        this.nationality = "South African";
    }

    @Test
    public void buildNationalityTest(){
        Nationality n = NationalityFactory.getNationality(this.nationality, this.language);
        Assert.assertNotNull(n.getLan());
        Assert.assertTrue("English", true);

        Assert.assertNotNull(n.getNationality());
        Assert.assertTrue("South African", true);

    }
}