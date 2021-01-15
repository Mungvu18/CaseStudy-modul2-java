package Service;

import Model.Person;
import Storage.WriteAndReadFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagerPharma {
    List<Person> pharmaList = new ArrayList<>();
    static final String FILE_NAME = "pharmaList.obj";
    public void addNew(Person person){
        pharmaList.add(person);
    }
    public void remove(int index){
        pharmaList.remove(index);
    }
    public  void showAll(){
        for (Person person: pharmaList) {
            System.out.println(person);
        }
    }
    public void sortByName(){
        Collections.sort(pharmaList,((o1, o2) -> {
           return o1.getName().compareTo(o2.getName());
        }));
        showAll();
    }
    public void sortBySalary(){
        Collections.sort(pharmaList,((o1,o2) -> {
            if(o1.getSalary()>o2.getSalary()) return 1;
            if(o1.getSalary()<o2.getSalary()) return  -1;
            else return 0;
        }));
    }
    public void writeFile(){
        WriteAndReadFile.writeFile(FILE_NAME,pharmaList);
    }
    public List<Person> readFile(){
       pharmaList = (List<Person>) WriteAndReadFile.readFile(FILE_NAME);
       return pharmaList;
    }

}
