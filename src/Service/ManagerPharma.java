package Service;

import Model.Person;
import Storage.WriteAndReadFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ManagerPharma {
    public static final String CHANGE_NAME_OF_OBJECT_OK = "Đã đổi ngày sinh thành công";
    public static final String OBJECT_NOT_EXITS = "Đối tượng không tồn tại";
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
    public void editBirthday(String name, LocalDate birthday){
        for (Person person: pharmaList) {
            if(person.getName().equalsIgnoreCase(name)){
                person.setBirthday(birthday);
                System.out.println(CHANGE_NAME_OF_OBJECT_OK);
                return;
            }
        }
        System.out.println(OBJECT_NOT_EXITS);
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
        pharmaList = sortByName();
        Collections.sort(pharmaList,((o1,o2) -> {
            if(o1.getSalary()>o2.getSalary()) return 1;
            if(o1.getSalary()<o2.getSalary()) return  -1;
            else return 0;
        }));
        showAll();
    }
    public void writeFile(){
        WriteAndReadFile.writeFile(FILE_NAME,pharmaList);
    }
    public void readFile(){
       pharmaList = (List<Person>) WriteAndReadFile.readFile(FILE_NAME);
       showAll();
    }

}
