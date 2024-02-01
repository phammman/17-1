import java.util.Scanner;

public class bai6slide95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soNguyenDuong;
        do {
            System.out.print("Nhập số nguyên dương: ");
            soNguyenDuong = scanner.nextInt();

            if (soNguyenDuong <= 0) {
                System.out.println("Vui lòng nhập số nguyên dương.");
            }
        } while (soNguyenDuong <= 0);

        long giaiThua = tinhGiaiThua(soNguyenDuong);
        System.out.println("Giai thừa của " + soNguyenDuong + " là: " + giaiThua);

        scanner.close();
    }

    public static long tinhGiaiThua(int n) {
        long giaiThua = 1;

        int i = 1;
        do {
            giaiThua *= i;
            i++;
        } while (i <= n);

        return giaiThua;
    }
}