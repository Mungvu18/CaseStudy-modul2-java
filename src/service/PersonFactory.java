package service;


import model.Person;
import model.PersonType;
import model.PharmaLeader;
import model.Pharmacist;

import java.time.LocalDate;

public class PersonFactory {
    public static final Person getPerson(PersonType type, String name, LocalDate birthday){
        switch (type){
            case Pharmacist:
                return new Pharmacist(name, birthday);
            case PharmaLeader:
                return new PharmaLeader(name,birthday);
            default:
                throw new IllegalArgumentException("Không hỗ trợ");
        }
    }
}
