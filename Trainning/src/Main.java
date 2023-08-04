import Person.CanBo;
import Person.CongNhan;
import Person.KySu;
import Person.NhanVien;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        int menuOp;
        boolean condition = true;
        while (condition){
            printMenu();
            menuOp = new Scanner(System.in).nextInt();
            switch (menuOp){
                case 1:
                    addMember(qlcb);
                    break;
                case 2:
                    System.out.println("Nhập tên cán bộ muốn tìm: ");
                    String name = new Scanner(System.in).nextLine();
                    qlcb.showSearched(name);
                    break;
                case 3:
                    qlcb.showCanBo();
                    break;
                case 4:
                    condition = false;
                    break;

            }
        }
    }

    public static void printMenu(){
        System.out.println("Menu:");
        System.out.println("\t1: Add member");
        System.out.println("\t2: Search member");
        System.out.println("\t3: Show member");
        System.out.println("\t4: Exit");
    }

    public static void printJob(){
        System.out.println("What job do you want to add?");
        System.out.println("\t1: Nhân viên");
        System.out.println("\t2: Kỹ sư");
        System.out.println("\t3: Công nhân");
    }

    public static CanBo importCanBo(){
        System.out.println("Nhập họ tên: ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập tuổi: ");
        int tuoi = new Scanner(System.in).nextInt();
        System.out.println("Nhập giới tính: ");
        String gioiTinh = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = new Scanner(System.in).nextLine();
        CanBo canBo = new CanBo(hoTen, tuoi, gioiTinh, diaChi);
        return canBo;
    }

    public static void addMember(QLCB qlcb){
        printJob();
        int jobOp = new Scanner(System.in).nextInt();
        CanBo canBo = importCanBo();
        switch (jobOp) {
            case 1: // Nhân viên
                System.out.println("Nhập công việc của nhân viên: ");
                String congViec = new Scanner(System.in).nextLine();
                CanBo cb1 = new NhanVien(canBo.getHoTen(), canBo.getTuoi(), canBo.getGioiTinh(), canBo.getDiaChi(), congViec);
                qlcb.add(cb1);
                break;
            case 2: // Kỹ sư
                System.out.println("Nhập ngành đào tạo kỹ sư: ");
                String nganhDaoTao = new Scanner(System.in).nextLine();
                CanBo cb2 = new KySu(canBo.getHoTen(), canBo.getTuoi(), canBo.getGioiTinh(), canBo.getDiaChi(), nganhDaoTao);
                qlcb.add(cb2);
                break;
            case 3: // Công nhân
                System.out.println("Nhập bậc công nhân");
                int bac = new Scanner(System.in).nextInt();
                CanBo cb3 = new CongNhan(canBo.getHoTen(), canBo.getTuoi(), canBo.getGioiTinh(), canBo.getDiaChi(), bac);
                qlcb.add(cb3);
                break;
        }
    }
}