package baithuchanh.chuong2;

import java.util.Scanner;

public class slide90 {
    public static void main(String[] args) {

        String chuoi;
        char KyTu;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap vao chuoi bat ky : ");
        chuoi = sc.nextLine();
        System.out.println(" Cac ky tu co trong chuoi la : ");
        for (int i = 0; i < chuoi.length(); i++) {
            KyTu = chuoi.charAt(i);

            System.out.println(KyTu);
        }

    }
}