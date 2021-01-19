package view;

import model.Person;
import service.ManagerPharma;

import java.time.LocalDate;
import java.util.Scanner;
import static view.constant_Variable.Constant.*;

public class TestMain {
    static ManagerPharma managerPharma = ManagerPharma.getInstance();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            SetInformationObject.showMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(ENTER_AMOUNT_OBJECT);
                    int amount = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < amount; i++) {
                        Person person = SetInformationObject.setInformationObj();
                        managerPharma.addNew(person);
                    }
                    break;
                case 2:
                    managerPharma.showAll();
                    break;
                case 3:
                    System.out.println(ENTER_INDEX_OF_OBJECT);
                    int index = Integer.parseInt(sc.nextLine());
                    managerPharma.remove(index);
                    break;
                case 4:
                    System.out.println(ENTER_NAME);
                    String name = sc.nextLine();
                    System.out.println(ENTER_BIRTH_DAY);
                    LocalDate birthday = LocalDate.parse(sc.nextLine());
                    managerPharma.editBirthday(name,birthday);
                    break;
                case 5:
                    managerPharma.sortBySalaryAndName();
                    break;
                case 6:
                    managerPharma.showTopThreeMaxBySalary();
                case 7:
                    managerPharma.writeFile();
                    break;
                case 8:
                    managerPharma.readFile();
                    break;
                case 0:
                    System.out.println(EXIT);
                    break;
            }
        } while (choice != 0);
    }
}
