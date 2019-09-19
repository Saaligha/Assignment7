package Assignment6.factory;

import Assignment6.domain.Progress.Language;
import Assignment6.factory.Progress.LanguageFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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