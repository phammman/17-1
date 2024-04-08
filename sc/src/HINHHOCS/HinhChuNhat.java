import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float chieudai;
    public float chieurong;
    
    public void hinhchunhat(){
        ten = "Hinh Chu Nhat";
    }
    public void nhapchieudai(){
        System.out.println("chieu dai =");
        Scanner sc = new Scanner(System.in);
        chieudai = sc.nextFloat();
    }
    public void nhapchieurong(){
        System.out.println("chieu rong =");
        Scanner sc = new Scanner(System.in);
        chieurong = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = ( chieudai + chieurong ) * 2;
    }
    public void tinhdientich(){
        dientich = chieudai * chieurong;
    }
}
