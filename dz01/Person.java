package dz01;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Person> parents;
    private List<Person> children;

    public Person(String name) {
        this.name = name;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Person> getParents() {
        return parents;
    }

    public void addParent(Person parent) {
        parents.add(parent);
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }
}
