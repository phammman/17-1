import java.util.Scanner;

public class ptb2 {

    public static void main(String[] args) {
        // Nhập vào hệ số a, b, c
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập hệ số b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập hệ số c: ");
        int c = scanner.nextInt();

        // Tính delta
        int delta = b * b - 4 * a * c;

        // Giải phương trình
        if (delta > 0) {
            int x1 = (-b + Math.sqrt(delta)) / (2 * a);
            int x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiệm của phương trình là: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            int x = -b / (2 * a);
            System.out.println("Nghiệm của phương trình là: x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}