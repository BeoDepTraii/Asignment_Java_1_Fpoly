
package NhatLMPC04316_Asignment_HoanChinh;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachNhanVien {

    private ArrayList<NhanVien> list = new ArrayList<>();

    public void menu() {
        Scanner s = new Scanner(System.in);
        int chon, check;
        do {
            System.out.println("****************************************************************************");
            System.out.println("*                                  MENU                                    *");
            System.out.println("****************************************************************************");
            System.out.println("+   1. Nhap Danh Sach Nhan Vien                                            +");
            System.out.println("+   2. Xuat Danh Sach Nhan Vien                                            +");
            System.out.println("+   3. Tim Kiem Nhan Vien Theo Ma Nhap Tu Ban Phim                         +");
            System.out.println("+   4. Xoa Nhan Vien Theo Ma Nhap Tu Ban Phim                              +");
            System.out.println("+   5. Cap Nhat Thong Tin Nhan Vien Theo Ma Nhap Tu Ban Phim               +");
            System.out.println("+   6. Tim Cac Nhan Vien Theo Khoang Luong Nhap Tu Ban Phim                +");
            System.out.println("+   7. Sap Xep Nhan Vien Theo Ho Va Ten                                    +");
            System.out.println("+   8. Sap Xep Nhan Vien Theo Thu Nhap                                     +");
            System.out.println("+   9. Xuat 5 Nhan Vien Co Thu Nhap Cao Nhat                               +");
            System.out.println("+   0. Thoat chuong trinh                                                  +");
            System.out.println("+==========================================================================+");
            System.out.println("Xin Moi Ban Chon Chuc Nang: ");
            chon = nhapso();

            switch (chon) {
                case 1:
                    System.out.println("_________________Nhap Danh Sach Nhan Vien_________________");
                    nhap();
                    break;
                case 2:
                    System.out.println("_________________Xuat Danh Sach Nhan Vien_________________");
                    xuat();
                    break;
                case 3:
                    System.out.println("_________________Tim Kiem Nhan Vien Theo Ma Nhap Tu Ban Phim_________________");
                    timNv();
                    break;
                case 4:
                    System.out.println("_________________Xoa Nhan Vien Theo Ma Nhap Tu Ban Phim_________________");
                    xoaNV();
                    break;
                case 5:
                    System.out.println("_________________Cap Nhat Thong Tin Nhan Vien Theo Ma Nhap Tu Ban Phim_________________");
                    capNhat();
                    break;
                case 6:
                    System.out.println("_________________Tim Cac Nhan Vien Theo Khoang Luong Nhap Tu Ban Phim_________________");
                    timKiemTheoKhoangLuong();
                    break;
                case 7:
                    System.out.println("_________________Sap Xep Nhan Vien Theo Ho Va Ten_________________");
                    sapXepTheoTen();
                    break;
                case 8:
                    System.out.println("_________________Sap Xep Nhan Vien Theo Thu Nhap_________________");
                    sapXepTheoThuNhap();
                    break;
                case 9:
                    System.out.println("_________________Xuat 5 Nhan Vien Co Thu Nhap Cao Nhat_________________");
                    hienThiTop5();
                    break;
                case 0:
                    System.out.println("=====================================");
                    System.out.println("THOAT CHUONG TRINH!");
                    System.out.println("CAM ON BAN DA SU DUNG CHUONG TRINH!");
                    System.out.println("=====================================");
                    System.exit(0);
            }
            System.out.println("");
            System.out.println("Ban Co Muon Tiep Tuc Su Dung Chuong Trinh Khong (1.YES)   (2.KHONG) ?");
            check = choice();
        } while (check == 1);
        System.out.println("=====================================");
        System.out.println("CAM ON BAN DA SU DUNG CHUONG TRINH!");
        System.out.println("CHAO TAM BIET! HEN GAP LAI!");
        System.out.println("=====================================");
    }

    public static int choice() {
        int checkk;
        Scanner input = new Scanner(System.in);

        while (true) {

            String str = input.nextLine();
            if (str.trim().equals("")) {
                System.out.println("-----------------------------------");
                System.out.println("Ban Vua Nhap Khoang Trong! Xin Vui Long Nhap Lai!");
                System.out.println("-----------------------------------");
                continue;
            }
            try {
                checkk = Integer.parseInt(str);
            } catch (NumberFormatException ex) {
                System.out.println("-----------------------------------");
                System.out.println("Ban Vua Chon Sai!");
                System.out.println("Xin Vui Long Chi Nhap So (1.YES)   (2.KHONG)!");
                System.out.println("-----------------------------------");
                continue;
            }
            if (checkk < 1 || checkk > 2) {
                System.out.println("-----------------------------------");
                System.out.println("Ban Vua Chon Sai!");
                System.out.println("Xin Vui Long Chi Chon (1.YES)   (2.KHONG)!");
                System.out.println("Xin Vui Long Nhap Lai!");
                System.out.println("-----------------------------------");
                continue;
            }
            return checkk;
        }

    }

    public int nhapso() {
        int so;
        Scanner input = new Scanner(System.in);

        while (true) {

            String str = input.nextLine();
            if (str.trim().equals("")) {
                System.out.println("-----------------------------------");
                System.out.println("Ban Vua Nhap Khoang Trong! Xin Vui Long Nhap Lai!");
                System.out.println("-----------------------------------");
                continue;
            }
            try {
                so = Integer.parseInt(str);
            } catch (NumberFormatException ex) {
                System.out.println("-----------------------------------");
                System.out.println("Ban Vua Chon Chuc Nang khong Hop Le!");
                System.out.println("Xin Vui Long Chi Nhap So!");
                System.out.println("-----------------------------------");
                continue;
            }
            if (so < 0 || so > 9) {
                System.out.println("-----------------------------------");
                System.out.println("Ban Vua Chon Chuc Nang khong Hop Le!");
                System.out.println("Xin Vui Long Chon Dung Chuc Nang Trong Menu!");
                System.out.println("Xin Vui Long Nhap Lai!");
                System.out.println("-----------------------------------");
                continue;
            }
            return so;
        }

    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Nhap loai nhan vien (1. Hanh chinh | 2. Truong phong | 3. Tiep thi | 0. Ket thuc nhap): ");
            int chon = s.nextInt();

            if (chon == 0) {
                break;
            }
            switch (chon) {
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.nhap(s);
                    list.add(nvhc);
                    break;
                case 2:
                    TruongPhong tp = new TruongPhong();
                    tp.nhap(s);
                    list.add(tp);
                    break;
                case 3:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.nhap(s);
                    list.add(nvtt);
                    break;
            }
        } while (true);
    }

    public void xuat() {

        System.out.println("Danh sach nhan vien");
        KT_Data();
        for (NhanVien x : list) {
            if (x instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh) x).xuat();
            } else if (x instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) x).xuat();
            } else if (x instanceof TruongPhong) {
                ((TruongPhong) x).xuat();
            }
            System.out.println("");
        }
    }

    public void timNv() {

        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma NV can tim: ");
        String maNV = s.nextLine();
        KT_Data();
        boolean t = true;
        for (NhanVien x : list) {
            if (x.getMa().equalsIgnoreCase(maNV)) {
                System.out.println("Thong tin nhan vien can tim: ");
                x.xuat();
                System.out.println("");
                break;
            }
        }
        if (t == false) {
            System.out.println("Khong tim thay ma NV" + maNV);
        }
    }

    public void xoaNV() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can xoa: ");

        String maNV = s.nextLine();
        KT_Data();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(maNV)) {
                list.remove(nv);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        } else {
            System.out.println("Nhan vien da duoc xoa !");
        }

    }

    public void capNhat() {
        Scanner s = new Scanner(System.in);

        System.out.println("Nhap ma nhan vien can cap nhat thong tin: ");
        while (true) {
            if (list.isEmpty()) {
                System.out.println("   *Ban chua nhap du lieu!*    *Xin vui long nhap du lieu!*   ");
                break;
            }
            String ma = s.nextLine();

            NhanVien tim = null;
            for (NhanVien nv : list) {
                if (nv.getMa().equalsIgnoreCase(ma)) {
                    tim = nv;
                    break;
                }
            }
            if (tim != null) {
                System.out.println("Nhap thong tin moi cho nhan vien can cap nhat(Enter tiep de nhap)");
                if (tim instanceof NhanVienHanhChinh) {
                    ((NhanVienHanhChinh) tim).nhap(s);
                    break;
                } else if (tim instanceof TruongPhong) {
                    ((TruongPhong) tim).nhap(s);
                    break;
                } else if (tim instanceof NhanVienTiepThi) {
                    ((NhanVienTiepThi) tim).nhap(s);
                    break;
                }
            } else {
                System.out.println("Khong tim thay ma nhan vien: " + ma);
                break;
            }
        }

    }

    public void timKiemTheoKhoangLuong() {
        Scanner s = new Scanner(System.in);

        System.out.println("Nhap khoang luong thap nhat: ");
        double min = s.nextDouble();
        System.out.println("Nhap khoang luong cao nhat: ");
        double max = s.nextDouble();

        boolean tim = false;
        for (NhanVien nhanVien : list) {
            if (min <= nhanVien.getLuong() && nhanVien.getLuong() <= max) {
                nhanVien.xuat();
                System.out.println("");
                tim = true;
            }

        }
        if (tim == false) {
            System.out.println("Khong co nhan vien nao o khoang luong " + min + " -> " + max);
            System.out.println("\n");

        }
        KT_Data();
    }

    public void sapXepTheoTen() {

        Collections.sort(list, (a, b) -> a.getHoTen().compareTo(b.getHoTen()));
        xuat();
        KT_Data();

    }

    public void sapXepTheoThuNhap() {

        Collections.sort(list, (a, b) -> (int) (a.getThuNhap() - b.getThuNhap()));
        xuat();
        KT_Data();

    }

    public void hienThiTop5() {
        Scanner s = new Scanner(System.in);

        Collections.sort(list, (a, b) -> (int) (b.getThuNhap() - a.getThuNhap()));
        System.out.println("Danh sach 5 sinh vien co thu nhap cao nhat: ");
        for (int i = 0; i < 5 && i < list.size(); i++) {
            list.get(i).xuat();
        }
        KT_Data();
    }

    public void KT_Data() {
        if (list.isEmpty()) {
            System.out.println("   *Ban chua nhap du lieu!*    *Xin vui long nhap du lieu!*   ");
        }
    }
}
