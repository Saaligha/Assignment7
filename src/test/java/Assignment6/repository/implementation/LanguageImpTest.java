package Assignment6.repository.implementation;

import Assignment6.domain.Language;
import Assignment6.factory.LanguageFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LanguageImpTest {
    private LanguageImp repo;
    private Language lang;

    @Before
    public void setUp() throws Exception{
        this.repo = LanguageImp.getRepository();
        this.lang = LanguageFactory.languageBuild("English", 5);
    }
    @Test
    public void create(){
        Language created = this.repo.create(this.lang);
        System.out.println("Created: English" );
        Assert.assertNotNull(created);
        // Assert.assertSame(created, this.course);

    }
    @Test
    public void update(){
        Language created = this.repo.create(this.lang);
        Language created2 = this.repo.create(this.lang);
        Language created3 = this.repo.create(this.lang);
        this.repo.create(created);
        this.repo.create(created2);

        Language updated = this.repo.update(created3);
        Assert.assertEquals(created3, updated);

    }
    @Test
    public void delete(){

        Language created = this.repo.create(this.lang);
        Language created2 = this.repo.create(this.lang);

        this.repo.create(created);
        this.repo.create(created2);

        this.repo.delete(created.getLanguage());

        int a = this.repo.getAll().size();

        Assert.assertEquals(0, a);
    }
    @Test
    public void read(){
        Language created = this.repo.create(this.lang);
        this.repo.create(created);
        Language s = this.repo.read(created.getLanguage());

        Assert.assertEquals(created, s);
    }
}
