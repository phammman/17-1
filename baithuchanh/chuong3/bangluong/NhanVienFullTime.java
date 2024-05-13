package baithuchanh.chuong3.bangluong;

import java.util.Scanner;
public class NhanVienFullTime extends NhanVien {

    private int ngayLamThem;
    private int loaiChucVu;
    Scanner sc = new Scanner(System.in);
    public NhanVienFullTime(String ten) {
       this.ten = ten;
    }
    public NhanVienFullTime(String ten,int ngayLamThem) {
       this.ten = ten;
       this.ngayLamThem = ngayLamThem;
    }
    public void setloaiChucVu(int loaiChucVu) {
      this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien() {
      return "Nhan vien full time";
    }
    public void tinhLuong() {
      long luongCoBan = (loaiChucVu == Configs.NHAN_VIEN_LINH)
                          ? Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH
                          : Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP;
      luong = luongCoBan + ngayLamThem * Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO;
    }
  }
