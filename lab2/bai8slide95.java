import java.util.Scanner;

public class bai8slide95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong dãy số: ");
        int n = scanner.nextInt();

        int[] daySo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            daySo[i] = scanner.nextInt();
        }

        double trungBinhCong = tinhTrungBinhCong(daySo);

        System.out.println("Trung bình cộng của dãy số là: " + trungBinhCong);

        scanner.close();
    }

    public static double tinhTrungBinhCong(int[] daySo) {
        int tong = 0;

        for (int so : daySo) {
            tong += so;
        }

        double trungBinhCong = (double) tong / daySo.length;

        return trungBinhCong;
    }
}