package Person;

import Person.CanBo;

public class KySu extends CanBo {
    /*********************************
     *            Attribute           *
     **********************************/
    private String nganhDaoTao;

    /*********************************
     *            Constructor        *
     *********************************/
    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    /*********************************
     *        Getter vs Setter       *
     *********************************/
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
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
        System.out.println("\t Ngành đào tạo: " + this.getNganhDaoTao());
    }
}
