import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tong = 0; 

        while (true) {
            System.out.print("Nhập vào một số nguyên (nhập 0 để kết thúc): ");
            int so = scanner.nextInt();

            if (so == 0) {
                break;
            }

            tong += so;

            if (tong > 100) {
                break;
            }
        }

        System.out.println("Tổng các số đã nhập là: " + tong);

        scanner.close();
    }
}