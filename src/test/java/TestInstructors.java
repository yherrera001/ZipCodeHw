import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void currentInstructorTest(){
        Instructors instructor = Instructors.getInstance();

        Assert.assertEquals(instructor.count(),1);
    }
}
