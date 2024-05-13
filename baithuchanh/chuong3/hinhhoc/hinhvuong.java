package baithuchanh.chuong3.hinhhoc;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
public hinhvuong() {
    ten = "Hinh vuong";
}
public void nhapcanh() {
Scanner sc = new Scanner(System.in);
System.out.print("Canh = ");
dai = rong = sc.nextFloat();
}
}