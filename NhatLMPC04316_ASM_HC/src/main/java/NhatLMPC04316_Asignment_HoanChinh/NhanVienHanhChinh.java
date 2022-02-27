
package NhatLMPC04316_Asignment_HoanChinh;

import java.util.Scanner;
public class NhanVienHanhChinh extends NhanVien {

    public NhanVienHanhChinh() {
        super(null,null,"Hanh chinh",0);
    }

    public NhanVienHanhChinh(String ma, String hoTen, String loai, double luong) {
        super(ma, hoTen, loai, luong);
    }
    @Override
    public void nhap(Scanner s){
      super.nhap(s);
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf(" | Thu nhap: %f | Thue thu nhap: %f",getThuNhap(),getThueThuNhap());
    }
    @Override
    public double getThuNhap(){
        return getLuong();
    }
    
}
