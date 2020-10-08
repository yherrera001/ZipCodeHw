public class Students extends People<Student> {
    private static final Students INSTANCE = new Students();


    public static Students getInstance() {
        return INSTANCE;
    }

    //CONSTRUCTOR
    private Students() {
        this.add(new Student(1,"Yasmin",10.0));
        this.add(new Student(5,"Raymundo",5.0));
        this.add(new Student(8, "Dallas", 10.0));
        this.add(new Student(3, "Jadyn", 5.0));
        this.add(new Student(2, "Darren", 10.0));
        this.add(new Student(4, "Corey", 5.0));
        this.add(new Student(6, "Dean", 10.0));
        this.add(new Student(7, "Asher", 5.0));
        this.add(new Student(6, "Ryan", 10.0));

    }

    @Override
    public Student[] toArray() {
        return (Student[]) personList.toArray(new Student[personList.size()]);
    }
}


