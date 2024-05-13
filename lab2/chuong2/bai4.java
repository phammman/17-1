package lab2.chuong2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số từ 1 - 12: ");
        int soNguyen = scanner.nextInt();

        switch (soNguyen) {
            case 1:
                System.out.print("Tháng 1");
                break;
            case 2:
                System.out.println("Tháng 2");
                break;
            case 3:
                System.out.print("Tháng 3");
                break;
            case 4:
                System.out.print("Tháng 4");
                break;
            case 5:
                System.out.print("Tháng 5");
                break;
            case 6:
                System.out.print("Tháng 6");
                break;
            case 7:
                System.out.print("Tháng 7");
                break;
            case 8:
                System.out.print("Tháng 8");
                break;
            case 9:
                System.out.print("Tháng 9");
                break;
            case 10:
                System.out.print("Tháng 10");
                break;
            case 11:
                System.out.print("Tháng 11");
                break;
            case 12:
                System.out.print("Tháng 12");
                break;
            default:
                System.out.print("Số bạn nhập không hợp lệ. Vui lòng nhập vào một số từ 1 - 12.");
                break;
        }
    }
}