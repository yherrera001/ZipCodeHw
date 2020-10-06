public class Instructor extends Person implements ITeacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(ILearner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }

    public void lecture(ILearner[] learners, double numberOfHours){

        for (ILearner learner : learners) {
            double numberOfHoursPerLearner = numberOfHours / learners.length;
            learner.learn(numberOfHoursPerLearner);

        }

    }
}
