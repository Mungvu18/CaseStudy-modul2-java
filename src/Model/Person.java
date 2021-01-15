package Model;

import java.time.LocalDate;

public abstract class Person implements Salary {
    private String name;
    private LocalDate birthday;

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

}
