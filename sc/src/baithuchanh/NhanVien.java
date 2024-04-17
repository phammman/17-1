package baithuchanh;

public class NhanVien {
    protected String ten;
    protected long luong;

    public Nhanvien {

    }

    public Nhanvien (String ten){
        this.ten = ten;
    }
    protected  String Loainhanvien(){
        return "";
    }
    public Xuatthongtin(){
        System.out.println("===== Nhanvien :" + ten + "=====");
        System.out.println(" - loainhanvien " + loaiNhanVien());
        System.out.println("luong = " + luong + "VND");
    }
}
