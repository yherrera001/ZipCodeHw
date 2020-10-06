import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(1789, "Yas", 5.0);
        boolean actual = student instanceof ILearner;
        boolean expected = true;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testInheritance(){
    Student student = new Student(1789, "Yas", 0.0);
    boolean actual = student instanceof Person;
    boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn(){
    Student student = new Student(1789, "Yas", 5.0);
    student.getTotalStudyTime();

    }
}
