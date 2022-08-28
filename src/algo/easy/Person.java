package algo.easy;

import java.util.Comparator;

public class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    /*public static Comparator COMP = new Comparator() {
        @Override
        public int compare(Person o1, Person o2) {
            return (o1.age - o2.age);
        }
    }*/
}
