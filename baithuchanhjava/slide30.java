import java.util.Scanner;

public class slide30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so nguyen n : ");
        int n = scanner.nextInt();

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            sum += digit;

            n /= 10;
        }
        System.out.println("tong cac chu so cua n la: " + sum);
    }
}