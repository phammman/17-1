package lab2.chuong2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int sum = 0, number;
        String strResult = "";
        Scanner sc = new Scanner(System.in);
        while (sum <= 100) {
    System.out.print("Nhap so nguyen: ");
    number = sc.nextInt();
    sum = sum + number;
    strResult = strResult + number + " + ";
    }
    System.out.print(strResult.substring(0,strResult.length() - 2) + " = " + sum);
    }
}
