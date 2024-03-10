import java.util.Scanner;

public class ptb1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap he so b: ");
        int b = scanner.nextInt();

        // Giai phuong trinh
        if (a != 0) {
            int x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        } else {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
    }
}