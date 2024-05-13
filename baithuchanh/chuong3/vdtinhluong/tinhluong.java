package baithuchanh.chuong3.vdtinhluong;

public class tinhluong {
    public static void main(String[] args) {
        person ps = new person();
    
       employee nv = new employee();
        nv.nhapThongTin();
        nv.xuatThongTin();
        
        parttime pt = new parttime();
        pt.so_gio_lam();
        pt.Luong_NV_PartTime();

        fulltime ft = new fulltime();
        ft.nhapLCB();
        ft.PhanTram_Doanhthu();
        ft.thuong();
        ft.Luong_FullTime();
    }
}
