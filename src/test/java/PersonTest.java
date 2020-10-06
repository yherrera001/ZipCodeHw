import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testConstructor(){
        //GIVEN
        Person person = new Person(1578L,"Steven");

        Assert.assertEquals(person.getId(),1578L);
        Assert.assertEquals(person.getName(), "Steven");

    }

    @Test
    public void setIdTest(){

        //GIVEN
        Person person = new Person(1578L,"Steven");
        person.setId(1578);

        //WHEN
        long actual = person.getId();
        long expect = 1578L;

        //THEN
        Assert.assertEquals(actual, expect);

    }

    @Test
    public void setNameTest(){
        //GIVEN
        Person person = new Person(1578,"Steven");
        person.setName("Steven");

        //WHEN
        String actual = person.getName();
        String expect = "Steven";

        //THEN
        Assert.assertEquals(actual, expect);
    }
}
