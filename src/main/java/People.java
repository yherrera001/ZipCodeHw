import javax.management.openmbean.ArrayType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    public List<Person> personList = new ArrayList<Person>();


    public List<Person> getPersonList() {
        return personList;
    }

    public boolean contain(Person person){
        if(personList.contains(person)){
            return true;
        }
        return false;
    }

    public void add(Person person){
        this.personList.add(person);
    }

    public Person findById(long id) {
        for (Person person1 : personList
        ) {
            if (person1.getId() == id) {
                return person1;
            }
        }
        return null;
    }

    public void remove(Person idField){
     personList.remove(idField);
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }

    public Object[] toArray() {
        return personList.toArray();
    }

    public Iterator iterator(){
        return personList.listIterator();
    }
}
