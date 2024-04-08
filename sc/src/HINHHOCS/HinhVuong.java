import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        ten = "Hinh Vuong";
    }
    public void nhapcanh(){
        System.out.println("canh =");
        Scanner sc = new Scanner(System.in);
        chieudai = chieurong = sc.nextFloat();
    }
}
