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
}
