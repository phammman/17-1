import java.util.Scanner;

public class slide30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            sum += digit;

            n /= 10;
        }
        System.out.println("Tổng các chữ số của n là: " + sum);
    }
}