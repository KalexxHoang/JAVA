package Person;

import Person.CanBo;

public class CongNhan extends CanBo {
    /*********************************
     *            Attribute           *
     **********************************/
    private int bac;

    /*********************************
     *            Constructor        *
     *********************************/
    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    /*********************************
     *        Getter vs Setter       *
     *********************************/
    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    /*********************************
     *        showInfor              *
     *********************************/
    @Override
    public void showInfor() {
        System.out.println("Nhân viên:");
        System.out.println("\t Tên: " + this.getHoTen());
        System.out.println("\t Tuổi: " + this.getTuoi());
        System.out.println("\t Giới tính: " + this.getGioiTinh());
        System.out.println("\t Địa chỉ: " + this.getDiaChi());
        System.out.println("\t Bậc: " + this.getBac());
    }
}
