package baithuchanh;

Import until.Configs;

public class class NhanVienPartTime Extends NhanVien {
    private int gioLamviec;
    public NhanVienPartTime(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = giolamViec;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan Vien Thoi Vu";
    }
    public void tinhluong(){
        luong = configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO *gioLamViec;
    }
}
