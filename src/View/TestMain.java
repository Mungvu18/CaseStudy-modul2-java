package View;

import Model.Person;
import Service.ManagerPharma;

import java.time.LocalDate;
import java.util.Scanner;

public class TestMain {
    static ManagerPharma managerPharma = ManagerPharma.getInstance();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Thêm đối tượng");
            System.out.println("2. Hiển thị toàn bộ danh sách đối tượng");
            System.out.println("3. Xóa đối tượng theo vị trí trong mảng");
            System.out.println("4. Chỉnh sửa ngày sinh đối tượng");
            System.out.println("5. Sắp xếp danh sách theo tên, và lương");
            System.out.println("6. Ghi file");
            System.out.println("7. Đọc file");
            System.out.println("0. Thoát chương trình");
            System.out.println("Nhập lựa trọn choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng đối tượng muốn thêm");
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
                    System.out.println("Nhập vị trí đối tượng trong mảng bạn muốn thêm");
                    int index = Integer.parseInt(sc.nextLine());
                    managerPharma.remove(index);
                    break;
                case 4:
                    System.out.println("Nhập tên đối tượng bạn muốn tìm kiếm");
                    String name = sc.nextLine();
                    System.out.println("Nhập ngày sinh bạn muốn đổi yyyy-dd-MM");
                    LocalDate birthday = LocalDate.parse(sc.nextLine());
                    managerPharma.editBirthday(name,birthday);
                    break;
                case 5:
                    managerPharma.sortBySalary();
                    break;
                case 6:
                    managerPharma.writeFile();
                    break;
                case 7:
                    managerPharma.readFile();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
            }

        } while (choice != 0);
    }
}
