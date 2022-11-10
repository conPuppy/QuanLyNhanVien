package QuanlyNV;

import QuanlySP2.ManagerProduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerNhanVien managerNhanVien = new ManagerNhanVien();
        while (true) {
            System.out.println("1. Thêm nhân viên:  ");
            System.out.println("    " + "1. Nhân viên fulltime: ");
            System.out.println("    " + "2. Nhân viên parttime: ");
            System.out.println("2. Xoá theo tên: ");
            System.out.println("3. Hiển thị lương: ");
            System.out.println("4. Hiển thị nhân viên: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2) {
                        case 1:
                            NhanVienFullTime nhanVienFullTime = managerNhanVien.creatNVFullTime();
                            managerNhanVien.addNhanVienFullTime(nhanVienFullTime);
                            break;
                        case 2:
                            NhanVienPartTime nhanVienPartTime = managerNhanVien.creatNVPartTime();
                            managerNhanVien.addNhanVienPartTime(nhanVienPartTime);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Chọn tên nhân viên muốn xoá: ");
                    String name = scanner.nextLine();
                    managerNhanVien.delete(name);
                    break;
                case 3:
                    managerNhanVien.showSalary();
                    break;
                case 4:
                    managerNhanVien.show();
                    break;
            }
        }
    }
}
