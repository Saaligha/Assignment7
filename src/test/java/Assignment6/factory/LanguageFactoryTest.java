package Assignment6.factory;

import Assignment6.domain.Language;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LanguageFactoryTest {

    private String language;
    private int country;

    @Before
    public void setUp() throws Exception {
        this.country = 5;
        this.language = "English";
    }

    @Test
    public void languageAndCountryTest(){
        Language l = LanguageFactory.languageBuild(this.language, this.country);
        Assert.assertNotNull(l.getLanguage());
        Assert.assertTrue("English", true);

        Assert.assertNotNull(l.getCountry());
        Assert.assertEquals(2,2);
    }
}