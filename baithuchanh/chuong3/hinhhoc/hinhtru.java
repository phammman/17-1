package baithuchanh.chuong3.hinhhoc;

import java.util.Scanner;

public class hinhtru extends hinhtron {
float chieucao;
public hinhtru() {
    ten = "Hinh tru";
}
public void nhapchieucao() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Chieu cao = ");
    chieucao = sc.nextFloat();
    nhapbankinh();
}
public void tinhthetich() {
    tinhdientich();
    thetich = dientich * chieucao;
}
}
