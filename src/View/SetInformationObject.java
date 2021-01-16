package View;

import Model.Person;
import Model.PharmaLeader;
import Model.Pharmacist;

import java.time.LocalDate;
import static View.Constant_Variable.Constant.*;

public class SetInformationObject {

    public static Person setInformationObj() {
        Person person = null;
        System.out.println(ENTER_NAME);
        String name = sc.nextLine();
        String day;
        LocalDate birthday = null;
        do {
            System.out.println(ENTER_BIRTH_DAY);
            day = sc1.nextLine();
            try {
                birthday = LocalDate.parse(day);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (!day.matches(REGEX_BIRTH_DAY));
       
        String choice;
        boolean testChoice2;
        boolean testChoice1;
        do {
            System.out.println(ENTER_1_OR_2);
            choice = sc.nextLine();
            testChoice1 = choice.equals(ONE);
            if (testChoice1) {
                System.out.println(ENTER_CODE_STAFF);
                String scCode = sc1.nextLine();
                System.out.println(ENTER_GROUP_OF_STAFF);
                String team = sc.nextLine();
                System.out.println(ENTER_AREA_WORK);
                String areaWork = sc1.nextLine();
                Pharmacist pharmacist = new Pharmacist(name, birthday);
                pharmacist.withAreaWork(areaWork);
                pharmacist.withScCode(scCode);
                pharmacist.withTeam(team);
                person = pharmacist;
            }
            testChoice2 = choice.equals(TWO);
            if (testChoice2) {
                System.out.println(ENTER_LEVEL);
                String positions = sc.nextLine();
                System.out.println(ENTER_MAJOR);
                String degree = sc1.nextLine();
                PharmaLeader pharmaLeader = new PharmaLeader(name, birthday);
                pharmaLeader.withDegree(degree);
                pharmaLeader.withPositions(positions);
                person = pharmaLeader;
            }
        }while (!testChoice1&&!testChoice2);
        return person;
    }
    public static void showMenu(){
        System.out.println(ENTER_OBJECT);
        System.out.println(SHOW_ALL);
        System.out.println(DELETE_OBJECT_BY_INDEX);
        System.out.println(EDIT_BIRTH_DAY);
        System.out.println(SORT_BY_NAME_AND_SALARY);
        System.out.println(WRITE_FILE);
        System.out.println(READ_FILE);
        System.out.println(EXIT_PROGRAM);
        System.out.println(ENTER_CHOICE);
    }

}
