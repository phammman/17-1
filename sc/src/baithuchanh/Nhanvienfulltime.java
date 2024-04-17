package baithuchanh;

Import java.until.Scanner;

public class NhanVienfulltime extends NhanVien {
    public int ngayLamThem;
    public int loaichucvu;

    public NhanVienFULLTime( String ten ){
        System.out.println("\n\n=====" + ten "=====");
    }
    public NhanVienFullTime (String ten ,int ngayLamThem){
        System.out.println("\n\n=====" + ten "=====");
        System.out.println("ngayLamThem =");
    }
    public void SetLoaiChucVu (int loaiChucVu){
        System.out.println("loaiChucVu =");
    }
    public void tinhluong(){
        System.out.println("luong" + luong + "VND");
    }
}
