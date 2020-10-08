import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void currentCohortTest(){
        Students students = Students.getInstance();

        Assert.assertEquals(students.count(),9);

    }
}
