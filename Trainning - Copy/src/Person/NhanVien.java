package Person;

import Person.CanBo;

public class NhanVien extends CanBo {
    /*********************************
     *            Attribute           *
     **********************************/
    private String congViec;

    /*********************************
     *            Constructor        *
     *********************************/
    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    /*********************************
     *        Getter vs Setter       *
     *********************************/
    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
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
        System.out.println("\t Công việc: " + this.getCongViec());
    }
}
