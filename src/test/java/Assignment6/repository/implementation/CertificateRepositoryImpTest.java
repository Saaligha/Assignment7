package Assignment6.repository.implementation;

import Assignment6.domain.Results.Certificate;
import Assignment6.factory.Results.CertificateFactory;
import Assignment6.repository.Results.Impl.CertificateRepositoryImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CertificateRepositoryImpTest {
    private CertificateRepositoryImp repository;
    private Certificate cert;

    @Before
    public  void setUp() throws Exception {
        //this.repository = CertificateRepositoryImp.getRepository();
        this.cert = CertificateFactory.getCertificate("Diploma");
    }
    @Test
    public void create() {
        Certificate created = this.repository.create(this.cert);
        System.out.println("Created: Certificate");
        Assert.assertNotNull(created);
        // Assert.assertSame(created, this.course);
    }

    @Test
    public void update(){
        Certificate created = this.repository.create(this.cert);
        Certificate created2 = this.repository.create(this.cert);
        Certificate created3 = this.repository.create(this.cert);
        this.repository.create(created);
        this.repository.create(created2);

        Certificate updated = this.repository.update(created3);
        Assert.assertEquals(created3, updated);
        Assert.assertNotNull(created3);
        System.out.println("Updated" +updated);

    }

    @Test
    public void delete(){

        Certificate created = this.repository.create(this.cert);
        Certificate created2 = this.repository.create(this.cert);

        this.repository.create(created);
        this.repository.create(created2);

        this.repository.delete(String.valueOf(created.getCertificate()));

        int a = this.repository.getAll().size();
        Assert.assertNotNull(created);
        Assert.assertEquals(1, a);
        System.out.println("Deleted: " +a);
    } @Test
    public void read(){
        Certificate created = this.repository.create(this.cert);
        this.repository.create(created);
        Certificate s = this.repository.read(String.valueOf(created.getCertificate()));

        // Assert.assertEquals(created, s);
        Assert.assertNull(s);
        System.out.println("Read: " +s);
    }
}
