package baithuchanh.chuong3.vdtinhluong;

public class employee extends person {
    public float luong;
    public void nhapThongTin(String ten, String diachi, int tuoi)
    {
        hoTen = ten;
        diaChi = diachi;
        tuoi = tuoi;
    }
    public float inluong()
    {   
        System.out.println("Luong: "+luong);
        return luong;
    }
}
