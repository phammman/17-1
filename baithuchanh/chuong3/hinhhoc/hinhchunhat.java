package baithuchanh.chuong3.hinhhoc;

import java.util.Scanner;
public class hinhchunhat extends hinhhoc {
    float dai;
    float rong;
public hinhchunhat() {
    ten = "Hinh chu nhat";
}
public void nhapchieudai() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Chieu dai = ");
    dai = sc.nextFloat();
}
public void nhapchieurong() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Chieu rong = ");
    rong = sc.nextFloat();
}
public void tinhchuvi() {
    chuvi = (dai + rong) * 2;
}
public void tinhdientich() {
    dientich = dai * rong;
}
}