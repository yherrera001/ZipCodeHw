import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<T extends Person> implements Iterable<T> { //People extends Person and is a T type so it can grab any object from Student, students, instructor etc
    public List<T> personList = new ArrayList<T>();

    //method
    public List<T> getPersonList() {
        return personList;
    }

    public boolean contain(T person){
        return personList.contains(person);
    }

    public void add(T person){
        this.personList.add(person);
    }

    public T findById(long id) {
        for (T person1 : personList
        ) {
            if (person1.getId() == id) {
                return person1;
            }
        }
        return null;
    }

    public void remove(T idField){
     personList.remove(idField);
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public T[] toArray() {
        return (T[]) personList.toArray(new Person[0]);
    }

    public Iterator<T> iterator(){
        return personList.listIterator();
    }
}
