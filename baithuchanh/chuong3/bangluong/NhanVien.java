package baithuchanh.chuong3.bangluong;

public class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien() {

    }
    public NhanVien(String ten) {
        this.ten = ten;
    }
    protected String loaiNhanVien() {
        return "";
    }
    public void xuatThongTin() {
        System.out.print("Nhan vien : " + ten);
        System.out.print("Loai nhan vien : " + loaiNhanVien());
        System.out.print("Luong : " + luong);
    }
}