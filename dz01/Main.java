package dz01;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John");
        Person p2 = new Person("Mary");
        Person p3 = new Person("Tom");

        p3.addParent(p1);
        p3.addParent(p2);

        GenealogyTree tree = new GenealogyTree();
        tree.addPerson(p1);
        tree.addPerson(p2);
        tree.addPerson(p3);

        List<Person> children = tree.getChildren(p1);

        for (Person child : children) {
            System.out.println(child.getName());
        }
    }
}

