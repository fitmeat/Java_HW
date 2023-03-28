package dz01;

import java.util.ArrayList;
import java.util.List;

public class GenealogyTree {
    private List<Person> people;

    public GenealogyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getChildren(Person person) {
        List<Person> children = new ArrayList<>();

        for (Person p : people) {
            if (p.getParents().contains(person)) {
                children.add(p);
            }
        }

        return children;
    }
}
