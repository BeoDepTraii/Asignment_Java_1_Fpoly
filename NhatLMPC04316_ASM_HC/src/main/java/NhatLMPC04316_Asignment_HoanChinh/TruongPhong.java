
package NhatLMPC04316_Asignment_HoanChinh;

import java.util.Scanner;
public class TruongPhong extends NhanVien{
    private double luongTrachNhiem;

    public TruongPhong() {
        super(null,null,"Truong phong",0);
    }

    public TruongPhong(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public TruongPhong( String ma, String hoTen, double luong,double luongTrachNhiem) {
        super(ma, hoTen, "Truong phong", luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
    @Override
    public void nhap(Scanner s){
        super.nhap(s);
        System.out.println("Nhap luong trach nhiem: ");
        this.luongTrachNhiem = s.nextDouble();
        s.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.printf(" | Luong trach nhiem: %f | Thu nhap: %f | Thue thu nhap: %f",
                luongTrachNhiem,getThuNhap(),getThueThuNhap());
    }
    @Override
    public double getThuNhap(){
        return (getLuong() + luongTrachNhiem);
    }
    
}
