import java.util.Scanner;

public class slide81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int soHang = scanner.nextInt();

        System.out.print("Nhập số cột của ma trận: ");
        int soCot = scanner.nextInt();

        int[][] maTran = new int[soHang][soCot];

        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử ở vị trí [" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextInt();
            }
        }

        int max = timPhanTuLonNhat(maTran);
        System.out.println("Phần tử lớn nhất trong ma trận là: " + max);

        scanner.close();
    }

    public static int timPhanTuLonNhat(int[][] maTran) {
        int max = maTran[0][0];

        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[i].length; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                }
            }
        }

        return max;
    }
}