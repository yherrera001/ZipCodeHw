public class Instructors extends People<Instructor> {
    final static Instructors INSTANCE = new Instructors();

    public static Instructors getInstance(){
        return INSTANCE;
    }

    //CONSTRUCTOR
    private Instructors() {
        this.add(Educator.MIKAILA.getInstructor());
        this.add(new Instructor(35, "Peter"));
    }


    @Override
    public Instructor[] toArray() {
        return (Instructor[]) personList.toArray(new Instructor[personList.size()]);
    }

    @Override
    public String toString() {
        return "Instructors{" +
                "personList=" + personList +
                '}';
    }
}
