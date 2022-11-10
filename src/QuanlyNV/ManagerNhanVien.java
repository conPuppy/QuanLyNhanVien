package QuanlyNV;

import java.util.Scanner;

public class ManagerNhanVien {
    NhanVien[] nhanVien = new NhanVien[0];

    public void show() {
        for (int i = 0; i < nhanVien.length; i++) {
            System.out.println(nhanVien[i].toString());
        }
    }

    public NhanVienFullTime creatNVFullTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên FullTime: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên FullTime: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên FullTime: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập hệ số lương: ");
        double heSo = Double.parseDouble(scanner.nextLine());
        NhanVienFullTime nhanVienFullTime = new NhanVienFullTime(name, age, gender, heSo);
        return nhanVienFullTime;
    }

    public NhanVienPartTime creatNVPartTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên PartTime: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên PartTime: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên PartTime: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập số buổi: ");
        int soBuoi = Integer.parseInt(scanner.nextLine());
        NhanVienPartTime nhanVienPartTime = new NhanVienPartTime(name, age, gender, soBuoi);
        return nhanVienPartTime;
    }

    public void addNhanVienFullTime(NhanVienFullTime nhanVienFullTime) {
        NhanVien[] newNVFullTime = new NhanVien[nhanVien.length + 1];
        for (int i = 0; i < nhanVien.length; i++) {
            newNVFullTime[i] = nhanVien[i];
        }
        newNVFullTime[newNVFullTime.length - 1] = nhanVienFullTime;
        nhanVien = newNVFullTime;
    }

    public void addNhanVienPartTime(NhanVienPartTime nhanVienPartTime) {
        NhanVien[] newNVPartTime = new NhanVien[nhanVien.length + 1];
        for (int i = 0; i < nhanVien.length; i++) {
            newNVPartTime[i] = nhanVien[i];
        }
        newNVPartTime[newNVPartTime.length - 1] = nhanVienPartTime;
        nhanVien = newNVPartTime;
    }

    public void delete(String name) {
        int index = 0;
        for (int i = 0; i < nhanVien.length; i++) {
            if (name.equals(nhanVien[i])) {
                index = i;
            }
        }
        NhanVien[] newNhanVien = new NhanVien[nhanVien.length - 1];
        for (int i = 0; i < newNhanVien.length; i++) {
            if (i < index) {
                newNhanVien[i] = nhanVien[i];
            } else {
                newNhanVien[i] = nhanVien[i + 1];
            }
        }
        nhanVien = newNhanVien;
    }


    public void showSalary() {
        for (int i = 0; i < nhanVien.length; i++) {
            if (nhanVien[i] instanceof NhanVienFullTime) {
                ((NhanVienFullTime) nhanVien[i]).getSalary();
            } else if (nhanVien[i] instanceof NhanVienPartTime) {
                ((NhanVienPartTime) nhanVien[i]).getSalary();
            }
        }
    }
}
