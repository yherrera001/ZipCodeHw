import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
 public void testImplementation(){
    Instructor instructor = new Instructor(6784L, "Mr. Jobs");
    boolean actual = instructor instanceof Person;
    boolean expected = true;

    Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTeach(){
       //GIVEN
       Instructor instructor = new Instructor(6784L, "Mr. Jobs");
       Student student = new Student(6748L, "Bobby", 6.0);
       instructor.teach(student, 6.0);

       //WHEN
       double actual = student.getTotalStudyTime();
       double expected = 6.0 + 6.0;
       double delta = 0.0;

       //THEN
Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testLecture(){
   Instructor instructor = new Instructor(678L, "Steve");
   Student student1 = new Student(678L, "Taylor", 7.0);
   Student student2 = new Student(684L, "Abby", 2.0);
   Student student3 = new Student(780L, "Wayne", 0.0);
   Student[] students = {student1, student2, student3};

   instructor.lecture(students, 70);
   double expected = student1.getTotalStudyTime();
   double actual = 210;

   Assert.assertEquals(expected, actual);

    }
}
