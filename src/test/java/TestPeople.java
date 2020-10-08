import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test

    public void testAdd() {
        People people = new People();
        //WHEN
        List<Person> list = new ArrayList<Person>();
        Person person = new Person(6890, "Terry");
        people.add(person);
        list.add(person);

        boolean expected = true;
        boolean actual = people.contain(person);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void testRemove() {
        List<Person> list = new ArrayList<Person>();
        Person person = new Person(6890, "Terry");
        People people = new People();
        people.add(person);
        people.remove(person);

        List<Person> expected = list;
        List actual = people.getPersonList();

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testFindById() {
        Person person = new Person(6890, "Mike");
        People people = new People();
        people.add(person);

        Assert.assertEquals(person, people.findById(6890));
    }
}
