package Service;

import Model.Person;
import Storage.WriteAndReadFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ManagerPharma {
    List<Person> pharmaList = new ArrayList<>();
    static final String FILE_NAME = "pharmaList.obj";
    private static ManagerPharma instance = null;
    public static ManagerPharma getInstance(){
        if(instance == null) synchronized (ManagerPharma.class){
            instance = new ManagerPharma();
        }
        return instance;
    }
    private ManagerPharma(){
    }

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
    public List<Person> sortByName(){
       Collections.sort(pharmaList);
        return pharmaList;
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
