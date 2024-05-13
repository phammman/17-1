package baithuchanh.chuong3.vdtinhluong;

import java.util.Scanner;

public class parttime extends employee {
    public final float luong1h = 25f;
    public Float gio;
    public void so_gio_lam()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("So gio lam: ");
        gio = sc.nextFloat();
    }
    public void Luong_NV_PartTime()
    {   
        luong = luong1h*gio;
        inluong();
    }
}
