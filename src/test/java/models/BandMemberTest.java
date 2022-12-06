package models;

import org.junit.Assert;
import org.junit.Test;

public class BandMemberTest {

    @Test
    public void nullaryConstructorTest(){
        BandMember test = new BandMember();

        Assert.assertNull(test.getId());
        Assert.assertNull(test.getFirstName());
        Assert.assertNull(test.getLastName());
        Assert.assertNull(test.getBirthYear());
        Assert.assertNull(test.getInstrument());
    }

    @Test
    public void constructorNoIdTest(){
        BandMember test = new BandMember("Trey", "Anastasio", 1964, "guitar");

        Assert.assertEquals("Trey", test.getFirstName());
        Assert.assertEquals("Anastasio", test.getLastName());
        Assert.assertEquals(1964, (int)test.getBirthYear());
        Assert.assertEquals("guitar", test.getInstrument());
    }

    @Test
    public void fullConstructorTest(){
        BandMember test = new BandMember(1, "Tomas", "Kalnoky", 1980, "guitar");

        Assert.assertEquals(1, (int)test.getId());
        Assert.assertEquals("Tomas", test.getFirstName());
        Assert.assertEquals("Kalnoky", test.getLastName());
        Assert.assertEquals(1980, (int)test.getBirthYear());
        Assert.assertEquals("guitar", test.getInstrument());
    }

    @Test
    public void setIdTest(){
        BandMember test = new BandMember(0,"test", "test", null, "test");

        test.setId(12);

        Assert.assertEquals(12, (int)test.getId());
    }

    @Test
    public void setFirstNameTest(){
        BandMember test = new BandMember("test", "test", null, "test");

        test.setFirstName("Zubin");

        Assert.assertEquals("Zubin", test.getFirstName());
    }

    @Test
    public void setLastNameTest(){
        BandMember test = new BandMember("test", "test", null, "test");

        test.setLastName("Sedghi");

        Assert.assertEquals("Sedghi", test.getLastName());
    }

    @Test
    public void setBirthYear(){
        BandMember test = new BandMember("test", "test", null, "test");

        test.setBirthYear(1991);

        Assert.assertEquals(1991, (int)test.getBirthYear());
    }

    @Test
    public void setInstrument(){
        BandMember test = new BandMember("test", "test", null, "test");

        test.setInstrument("bass");

        Assert.assertEquals("bass", test.getInstrument());
    }

}
