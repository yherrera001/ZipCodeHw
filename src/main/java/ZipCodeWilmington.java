import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington(); //Points to the singleton object
    Map<Student, Double> map = new HashMap<Student, Double>();

    //Points to the singleton object
    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(ITeacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
        //Referring to an array when using personList
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructors.getInstance().findById(id).lecture(students.toArray(), numberOfHours);
    }

        public Map<Student, Double> getStudyMap() {
            Map<Student, Double> studentDoubleMap = new HashMap();
            for (int i = 0; i < Students.getInstance().count(); i++) {
                double studyTime = ((Student) Students.getInstance().personList.get(i)).getTotalStudyTime();
                studentDoubleMap.put(((Student) Students.getInstance().personList.get(i)), studyTime);
            }
            return studentDoubleMap;
        }
    }
