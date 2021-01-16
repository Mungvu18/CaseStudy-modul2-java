package View;

import Model.Person;
import Model.PharmaLeader;
import Model.Pharmacist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SetInformationObject {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    public static final String REGEX_BIRTH_DAY = "^[0-9]{4}(-[0-9]{2}){2}$";
    public static Person setInformationObj() {
        Person person = null;
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        String day = "";
        do {
            System.out.println("Nhập ngày sinh yyyy-dd-MM");
            day = sc1.nextLine();
        }while (!day.matches(REGEX_BIRTH_DAY));
        LocalDate birthday = LocalDate.parse(day);
        String choice = "";
        boolean testChoice2 = false;
        boolean testChoice1 = false;
        do {
            System.out.println("Nhập 1 nếu muốn thêm dược sĩ, nhập 2 nếu muốn thêm quản lý");
            choice = sc.nextLine();
            testChoice1 = choice.equals("1");
            if (testChoice1) {
                System.out.println("Nhập mã nhân viên");
                String scCode = sc1.nextLine();
                System.out.println("Nhập team nhân viên");
                String team = sc.nextLine();
                System.out.println("Nhập địa bàn làm việc của trình dược");
                String areaWork = sc1.nextLine();
                Pharmacist pharmacist = new Pharmacist(name, birthday);
                pharmacist.withAreaWork(areaWork);
                pharmacist.withScCode(scCode);
                pharmacist.withTeam(team);
                person = pharmacist;
            }
            testChoice2 = choice.equals("2");
            if (testChoice2) {
                System.out.println("Nhập chức vụ");
                String positions = sc.nextLine();
                System.out.println("Nhập bằng cấp [Đại học, Cao đẳng]");
                String degree = sc1.nextLine();
                PharmaLeader pharmaLeader = new PharmaLeader(name, birthday);
                pharmaLeader.withDegree(degree);
                pharmaLeader.withPositions(positions);
                person = pharmaLeader;
            }
        }while (testChoice1==false&&testChoice2==false);
        return person;
    }
}
