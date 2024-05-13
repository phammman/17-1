package lab2.chuong2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập vào tuổi: ");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.print("Bạn " + name + " ở độ tuổi vị thành niên.");
        } else if (age >= 16 && age < 18) {
            System.out.print("Bạn " + name + " ở độ tuổi trưởng thành.");
        } else if (age >= 18) {
            System.out.print("Bạn " + name + " đã già.");
        } else {
            System.out.print("Tuổi không hợp lệ.");
        }
    }
}