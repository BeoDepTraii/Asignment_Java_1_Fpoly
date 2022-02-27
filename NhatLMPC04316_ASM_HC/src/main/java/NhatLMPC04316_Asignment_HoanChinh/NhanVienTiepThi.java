/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhatLMPC04316_Asignment_HoanChinh;

/**
 *
 * @author DUY
 */
import java.util.Scanner;
public class NhanVienTiepThi extends NhanVien {
    private double doanhSo ;
    private double hueHong;

    public NhanVienTiepThi() {
        super(null,null,"Tiep thi",0);
    }

    public NhanVienTiepThi(double doanhSo, double hueHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public NhanVienTiepThi(String ma,String hoTen,double luong,double doanhSo, double hueHong  ) {
        super(ma, hoTen, "Tiep thi", luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
    @Override
    public void nhap(Scanner s){
        super.nhap(s);
        System.out.println("Nhap doanh so: ");
        this.doanhSo = s.nextDouble();
        System.out.println("Nhap vao hue hong: ");
        this.hueHong = s.nextDouble();
        s.nextLine();
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf(" | Doanh so: %f | Hue hong: %f | Thu nhap: %f | Thue thu nhap: %f",
                doanhSo,hueHong,getThuNhap(),getThueThuNhap());
    }
    public double getThuNhap(){
        return (getLuong() + doanhSo*hueHong);
    }
}
