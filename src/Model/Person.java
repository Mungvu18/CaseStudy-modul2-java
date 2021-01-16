package Model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Person implements Salary, Comparable<Person>,Serializable {
    private String name;
    private LocalDate birthday;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Model.Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}
