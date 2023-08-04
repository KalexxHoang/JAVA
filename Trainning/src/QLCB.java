import Person.CanBo;
import Person.CongNhan;
import Person.KySu;
import Person.NhanVien;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class QLCB {
    /*********************************
    *            Attribute           *
    **********************************/
    private ArrayList<CanBo> canBo;

    /*********************************
     *            Constructor        *
     *********************************/
    public QLCB(){
        this.canBo = new ArrayList<>();
    }

    /*********************************
     *            Add Member         *
     *********************************/
    public void add(CanBo canBo){
        this.canBo.add(canBo);
    }

    // Show Infor of member
    public void show(CanBo canBo){
        System.out.println("Nhân viên:");
        System.out.println("\t Tên: " + canBo.getHoTen());
        System.out.println("\t Tuổi: " + canBo.getTuoi());
        System.out.println("\t Giới tính: " + canBo.getGioiTinh());
        System.out.println("\t Địa chỉ: " + canBo.getDiaChi());
        if (canBo instanceof CongNhan){
            System.out.println("\t Bậc: " + ((CongNhan) canBo).getBac());
        } else if (canBo instanceof KySu) {
            System.out.println("\t Ngành đào tạo: " + ((KySu) canBo).getNganhDaoTao());
        } else if (canBo instanceof NhanVien) {
            System.out.println("\t Công việc: " + ((NhanVien) canBo).getCongViec());
        }
    }

    /*********************************
     *            Search Member      *
     *********************************/
    public ArrayList<CanBo> searchCanBo(String hoTen) {
        return (ArrayList<CanBo>) this.canBo.stream().filter(i -> i.getHoTen().contains(hoTen)).collect(Collectors.toList());
    }

    public void showSearched(String hoTen){
        ArrayList<CanBo> cb = searchCanBo(hoTen);
        for (CanBo canBo : cb){
            show(canBo);
        }
    }

    /*********************************
     *            Show Member        *
     *********************************/
    public void showCanBo(){
        for (CanBo canBo : this.canBo){
            show(canBo);
        }
    }

    /*public void showCanBo(ArrayList<CanBo> canBo = this.canBo){
        for (CanBo cb : canBo){
            System.out.println("Nhân viên:");
            System.out.println("\t Tên: " + cb.getHoTen());
            System.out.println("\t Tuổi: " + cb.getTuoi());
            System.out.println("\t Giới tính: " + cb.getGioiTinh());
            System.out.println("\t Địa chỉ: " + cb.getDiaChi());
            if (cb instanceof CongNhan){
                System.out.println("\t Bậc: " + ((CongNhan) cb).getBac());
            } else if (cb instanceof KySu) {
                System.out.println("\t Ngành đào tạo: " + ((KySu) cb).getNganhDaoTao());
            } else if (cb instanceof NhanVien) {
                System.out.println("\t Công việc: " + ((NhanVien) cb).getCongViec());
            }
        }
    }*/
}
