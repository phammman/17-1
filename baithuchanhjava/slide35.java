import java.util.Scanner;

public class slide35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("Số nhỏ nhất là: " + a);
        } else {
            System.out.println("Số nhỏ nhất là: " + b);
        }
    }
}
