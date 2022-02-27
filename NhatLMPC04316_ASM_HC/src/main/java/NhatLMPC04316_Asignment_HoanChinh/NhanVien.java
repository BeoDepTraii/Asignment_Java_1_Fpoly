
package NhatLMPC04316_Asignment_HoanChinh;

import java.util.Scanner;
public abstract class NhanVien {
    String ma, hoTen, loai;
    double luong;
    
    Scanner s = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, String loai, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.loai = loai;
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getLuong() {
        return luong;
    }
    
    public void nhap(Scanner s){
        s.nextLine();
        System.out.println("Nhap ma nhan vien: ");
        this.ma = s.nextLine();
        System.out.println("Nhap ho ten nhan vien: ");
        this.hoTen = s.nextLine();
        System.out.println("Nhap luong nhan vien: ");
        this.luong = s.nextDouble();
        
        s.nextLine();
    }
    
    public void xuat(){
        System.out.printf("\n Ma nhan vien: %s | Ho ten: %s | Loai: %s | Luong: %f",
                ma,hoTen,loai,luong);
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public abstract double getThuNhap();
    public double getThueThuNhap(){
        double thuNhap = getThuNhap();
        double thueThuNhap = 0;
        if (thuNhap < 9000){
            thueThuNhap =0;
        }else if (thuNhap < 15000){
            thueThuNhap = thuNhap * 0.1;
        }else {
            thueThuNhap = thuNhap * 0.12;
        }
        return thueThuNhap;
    }

    String getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
