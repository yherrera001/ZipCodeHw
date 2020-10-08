import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        Educator educator = Educator.MIKAILA;

        Assert.assertTrue(educator instanceof ITeacher);
    }

    @Test
    public void testTeach(){
        Educator educator = Educator.MIKAILA;
        Student student = new Student(43, "terry", 5.0);
        educator.teach(student, 20); //want to teach student and then check hours taught
        Assert.assertTrue(student.getTotalStudyTime() == 25);
    }

    @Test
    public void testLecture(){
        Student student = new Student(43, "terry", 5.0);
        Student student2 = new Student(35, "jerry", 10.0);
        Student[] students = {student, student2};
        Educator.MIKAILA.lecture(students,10.0);
        Assert.assertTrue(student.getTotalStudyTime() == 10); //checking the study hours

    }

    @Test
    public void testInheritance(){
        Educator educator = Educator.MIKAILA;

        Assert.assertTrue(educator.getInstructor() instanceof Person);
    }
}

