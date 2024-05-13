package baithuchanh.chuong2;

import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên n bất kỳ (n > 0): ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Tổng các chữ số của số " + number + " là: " + sum);
    }
}