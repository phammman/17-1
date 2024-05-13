package baithuchanh.chuong3.bangluong;

public class tinhluong {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van A", 5);
        sep.setloaiChucVu(Configs.NHAN_VIEN_SEP);
        sep.tinhLuong();
        sep.xuatThongTin();
        System.out.println();

        NhanVienFullTime linh = new NhanVienFullTime("Nguyen Van B", 8);
        linh.setloaiChucVu(Configs.NHAN_VIEN_LINH);
        linh.tinhLuong();
        linh.xuatThongTin();
        System.out.println();

        NhanVienPartTime partTime = new NhanVienPartTime("Nguyen Van C", 150);
        partTime.tinhLuong();
        partTime.xuatThongTin();
    }
}
