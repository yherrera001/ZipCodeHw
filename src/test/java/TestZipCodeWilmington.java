import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test

    public void testHostLecture() {
        Instructor instructor = new Instructor(1, "Jerry"); //Created an Instructor
        Student yasmin = ((Student) Students.getInstance().findById(1)); //Grabbing the student "Yasmin"
        double numberOfHoursToLearn = 9; //divide this by student count. I only made 9 students

        double expectedHours = 10.0; //amount of hours yasmin is starting off with
        double actualHours = yasmin.getTotalStudyTime(); //getting the total study time
        Assert.assertEquals(expectedHours, actualHours, 0.0);

        ZipCodeWilmington.getInstance().hostLecture(instructor, numberOfHoursToLearn);
        Assert.assertEquals(expectedHours + 1, yasmin.getTotalStudyTime(), 0.0);
    }

    @Test
    //testing the second time for the updates

    public void testHostLecture2(){
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();

        Instructor instructor = Educator.MIKAILA.getInstructor();

        zipCodeWilmington.hostLecture(instructor, 9.0);

        double actual = Students.getInstance().findById(5).getTotalStudyTime();
        double expected = 6.0; //
        Assert.assertEquals(actual, expected, 0.0);
    }
}
