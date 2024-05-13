package baithuchanh.chuong3.hinhhoc;

import java.util.Scanner;
public class hinhtron extends hinhhoc {
    float bankinh;
public hinhtron() {
    ten = "Hinh tron ";
}
public void nhapbankinh() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ban kinh = ");
    bankinh = sc.nextFloat();
}
public void tinhchuvi() {
    chuvi = 2 * PI * bankinh;
}
public void tinhdientich() {
    dientich = PI * bankinh * bankinh;
}
}
