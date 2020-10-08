public enum Educator implements ITeacher {
    MIKAILA(new Instructor(34,"Mikaila"));

    final private Instructor instructor;
    private double timeWorked;

    public Instructor getInstructor(){
        return instructor;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public void teach (ILearner learner,double numberOfHours){
    instructor.teach(learner, numberOfHours);
    timeWorked += numberOfHours;
    }

    @Override
    public void lecture(ILearner[] learners, double numberOfHours) {
    instructor.lecture(learners, numberOfHours);
    timeWorked += numberOfHours;

    }

}
