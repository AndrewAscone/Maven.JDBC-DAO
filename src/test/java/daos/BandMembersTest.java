package daos;

import models.BandMember;
import org.junit.Assert;
import org.junit.Test;

public class BandMembersTest {

    @Test
    public void findByIdTest(){
        BandMembers test = new BandMembers();

        String actual = test.findByID(1).getFirstName();
        String expected = "Jerry";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findAllTest(){
        BandMembers test = new BandMembers();

        String actual = test.findAll().get(1).getFirstName();
        String expected = "Bob";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createTest(){
        BandMembers test = new BandMembers();

        //Only run creation once, prove method created a new row to table
        //test.create(new BandMember("Donna Jean", "Godchaux", 1947, "vocals"));
        BandMember found = test.findByID(8);

        Assert.assertEquals("vocals", found.getInstrument());

    }

    @Test
    public void updateTest(){
        BandMembers test = new BandMembers();

        //Run update once, prove method updated fields on chosen row
        //test.update(new BandMember("Keith", "Godchaux", 1948, "keyboards"), 10);
        BandMember found = test.findByID(10);

        Assert.assertEquals("Keith", found.getFirstName());
    }

    @Test
    public void deleteTest(){
        BandMembers test = new BandMembers();

        //Run delete once, prove method removed row and row is now null
        //test.delete(11);

        Assert.assertNull(test.findByID(11));
    }
}
