package baithuchanh.chuong2;

import java.util.Scanner;

public class slide35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập vào số nguyên thứ hai: ");
        int num2 = scanner.nextInt();

        while (true) {
            if (num1 < num2) {
                System.out.print("Số nhỏ nhất là: " + num1);
                break;
            } else if (num1 > num2) {
                System.out.print("Số nhỏ nhất là: " + num2);
                break;
            } else {
                System.out.print("Hai số bằng nhau.");
                break;
            }
        }
    }
}
